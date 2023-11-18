/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.service;

import c.s.docs.model.Attachment;
import c.s.docs.model.Claims;
import c.s.docs.model.SpAttachment;
import c.s.docs.model.SpAttachmentClaimModel;
import c.s.docs.model.UAPUpload;
import c.s.docs.repo.ClaimsRepo;
import c.s.docs.util.ImageProcessor;
import c.s.docs.util.PdfProcessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author John.Simiyu
 */
@Service
public class SpAttachmentService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(
            ClaimsInvLines.class
    );

    @Autowired
    private ClaimsInvLines claimsInvLines;

    @Autowired
    private ClaimsRepo claimsRepo;

    @Autowired
    @Qualifier("plainRestTemplate")         //does not use ribbon
    private RestTemplate plainRestTemplate;

    private final String file_base_url = "https://data.smartapplicationsgroup.com/ripoti/reportapits/files/";

   public String directoryName = "reports/";

    public void processSpAttachments(Integer custId) {
        log.info("===================processSpAttachments============================== : ");
        List<Claims> SpClaimsWithAttchments = claimsRepo.getSpClaimsWithAttchments(custId);
        String destinationDir = directoryName;//"directoryName";//claims_images/"; // converted

        if (SpClaimsWithAttchments.size() > 0) {

            SpClaimsWithAttchments.forEach((SpClaimsWithAttchment) -> {
            	
                String serviceType = SpClaimsWithAttchment.getServiceType();
                if (serviceType.equalsIgnoreCase("OP")) {
                    serviceType = "Outpatient";
                } else {
                    serviceType = "Inpatient";
                }
                if (serviceType.equalsIgnoreCase("OP")) {
                    serviceType = "Outpatient";
                } else {
                    serviceType = "Inpatient";
                }

//                ObjectMapper mapper = new ObjectMapper();
//                BufferedImage bufferedImageClaim = null;
                
                List<SpAttachment> spAttachments = claimsRepo.getSpAttchments(
                		SpClaimsWithAttchment.getVisit_number(),
                		SpClaimsWithAttchment.getGlobal_id(),
                		SpClaimsWithAttchment.getProv_id());
                List<String> allFilesList = new ArrayList();
                if (spAttachments.size() > 0) {
                    try {
                        spAttachments.forEach((attachement) -> {
                            downloadFile(file_base_url, attachement.getATT_NAME(), destinationDir).forEach((files) -> {
//                                log.info("files Extracted : " + files);
                                allFilesList.add(files);
                            });

                        });
                        Timestamp timestampx = new Timestamp(System.currentTimeMillis());
//                        String timestamp = new SimpleDateFormat("ddMMyyyyHHmmss").format(new java.util.Date());
                        String fileName
                                = "CLAIM-"
                                + timestampx.getTime()
                                + "-"
                                + SpClaimsWithAttchment.getVisit_number()
                                + "-"
                                + SpClaimsWithAttchment.getGlobal_id()
                                + ".pdf";
                        fileName = fileName.replace("/", "-");

//                        ImageProcessor imageProcessor = new ImageProcessor();
                        PdfProcessor pdfProcessor = new PdfProcessor();
                        String newMergedFile = pdfProcessor.mergePdfs(allFilesList, spAttachments.get(0).getCLAIM_ID());
                        String base64ClaimData = pdfProcessor.ConvertPdfToBase64(newMergedFile);
                        String filePath = pdfProcessor.convertBase64ToPdf(base64ClaimData, fileName, directoryName);

//                        String fileNameAbsolutePath = directoryName + "/" + fileName;
//                        log.info("====================================FilePath======== " + filePath 
//                                +"===============CLAIM ID===== "+SpClaimsWithAttchment.getCLAIMS_ID()+"======== claim code :"+SpClaimsWithAttchment.getCLAIM_CODE());

                        log.info("****************** SENDING THE PDF TO SHAREPOINT ****************");
                        UAPUpload uapUpload = new UAPUpload();
                        uapUpload.setClaimType(serviceType);
                        uapUpload.setFileName(fileName);
                        uapUpload.setProviderName(SpClaimsWithAttchment.getCLIENT_PROVIDER_NAME());
                        Map<String, String> sendDocMap = sendDocumentUAP(uapUpload);
                        log.info("****************** SHAREPOINT RESPONCE ****************" + sendDocMap.toString());
                        if (sendDocMap.containsKey("barCode")) {
                            log.info("****************** BARCODE SHARED ****************");
                            String isBarCode = sendDocMap.get("isBarCode");
                            String barCode = sendDocMap.get("barCode");
                            String isBarCodeMsg = sendDocMap.get("isBarCodeMsg");
                            if (isBarCode.equalsIgnoreCase("true")) {
                                claimsRepo.updateClaimBarCodeSPAttachement(barCode, SpClaimsWithAttchment);
                            } else {
                                log.error(
                                        "\uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D Document file "
                                        + fileName
                                        + " failed to save in sharepoint with the following error "
                                        + isBarCodeMsg
                                );
                                
                            	log.error("BIG FILE - PROVIDER["+SpClaimsWithAttchment.getCLIENT_PROVIDER_NAME()+"]#"+
                    					"VISIT-NUMBER["+SpClaimsWithAttchment.getVisit_number()+"]"+
                    					"GLOBAL-ID["+SpClaimsWithAttchment.getGlobal_id()+"]"+
                    					"PROV-ID["+SpClaimsWithAttchment.getProv_id()+"]");
                            	
                            }
                        } else {
                            log.error(
                                    "Connection to UAP Sharepoint server failed \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D"
                            );
                        }
                        
                        // DELETE TEMPORARILY MERGED FILE
                        claimsInvLines.deleteFileLocaly(newMergedFile);

                        // DELETE DOWNLOADED FTP FILES
                        allFilesList.forEach((att) -> {
                        	claimsInvLines.deleteFileLocaly( att);
                        });
                        
                        // DELETE THE FILE THAT IS SENT TO UAP
                        claimsInvLines.deleteFileLocaly(directoryName+fileName);
                    } catch (COSVisitorException ex) {
                    	log.error(ex.getMessage());
                    } catch (IOException ex) {
                    	log.error(ex.getMessage());
                    } catch (Exception ex) {
                    	log.error(ex.getMessage());
                    }
                }else {
                	log.error("NON-PDF - PROVIDER["+SpClaimsWithAttchment.getCLIENT_PROVIDER_NAME()+"]#"+
                					"VISIT-NUMBER["+SpClaimsWithAttchment.getVisit_number()+"]"+
                					"GLOBAL-ID["+SpClaimsWithAttchment.getGlobal_id()+"]"+
                					"PROV-ID["+SpClaimsWithAttchment.getProv_id()+"]");
                }
            });
        }
    }

    public List<String> downloadFile(String file_base_url, String file_name, String destinationDir) {
//      RestTemplate restTemplate = new RestTemplate();
//      https://data.smartapplicationsgroup.com/ripoti/reportapits/files/15102020091705-4168184-28111-INV-scan2197.pdf
        byte[] imageBytes = plainRestTemplate.getForObject(file_base_url + file_name, byte[].class);
        List<String> fileList = new ArrayList();

        try {
//            String file_name = "testdock.pdf";
            Files.write(Paths.get(file_name), imageBytes);
            fileList.add(file_name);
//            String sourceDir = file_name; // Pdf files are read from this folder
//            String destinationDir = "claims_images/"; // converted
//            fileList = fileUtil.convertPdfImage(file_name, destinationDir);

//            fileList.forEach((files) -> {
//                log.info("files Extracted : " + destinationDir+files);
//            });
            return fileList;
        } catch (IOException ex) {
        	log.error(ex.getMessage());
            return fileList;
        }
    }

    
    
    public Map<String, String> sendDocumentUAP(UAPUpload uapUpload) {
        Map<String, String> mapResponse = new HashMap<String, String>();
        String barCode = null;
        try {
            String claimType = uapUpload.getClaimType(); //Inpatient/Outpatient
            String providerName = uapUpload.getProviderName();
            String fileName = uapUpload.getFileName();

           
            URL url = new URL( 
                    "https://providerportal.uapoldmutual.com:1196/RestServiceImpl.svc/UploadSmartDocumentProd"
            );
            String Username = "integration@smartapplicationsgroup.com";
            String Password = "c!YS+.mU|57P*|";
            String DestinationFolder = "Smart";
            String SourceFilePath = directoryName + fileName;
            String DestinationFileName = fileName;

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String encoding = Base64
                    .getEncoder()
                    .encodeToString((Username + ":" + Password).getBytes("UTF-8"));
            connection.setRequestProperty("Authorization", "Basic " + encoding);
            connection.setRequestProperty("LibraryName", DestinationFolder);
            connection.setRequestProperty("DocumentName", DestinationFileName);
            connection.setRequestProperty("ClaimType", claimType);
            connection.setRequestProperty("ProviderName", providerName);
            connection.setConnectTimeout(60000);

            OutputStream os = connection.getOutputStream();
            File file = new File(SourceFilePath);
            Files.copy(file.toPath(), os);
            os.close();

            InputStream content = (InputStream) connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(content));
            String line;
            ObjectMapper mapper = new ObjectMapper();
            while ((line = in.readLine()) != null) {
//                log.info("sending docts");
//                log.debug(line);
                //		        String json=mapper.writeValueAsString(line);
                Map<String, String> map = mapper.readValue(line, Map.class);
                log.info(map.toString());
                if (map.containsKey("UploadSmartDocumentResult")) {
                    try {                        
                        barCode = map.get("UploadSmartDocumentResult");
                        if (barCode.toLowerCase().contains("error")) {
                            mapResponse.put("isBarCode", "false");
                            mapResponse.put("barCode", "");
                            mapResponse.put("isBarCodeMsg", barCode);
                        } else {
                            mapResponse.put("isBarCode", "true");
                            mapResponse.put("barCode", barCode);
                            mapResponse.put("isBarCodeMsg", barCode);
                        }
                    } catch (Exception e) {
                        log.trace(e.getMessage());
                    }
                }else if(map.containsKey("UploadSmartDocumentProdResult")){
                    
                    try {                        
                        barCode = map.get("UploadSmartDocumentProdResult");
                        if (barCode.toLowerCase().contains("error")) {
                            mapResponse.put("isBarCode", "false");
                            mapResponse.put("barCode", "");
                            mapResponse.put("isBarCodeMsg", barCode);
                        } else {
                            mapResponse.put("isBarCode", "true");
                            mapResponse.put("barCode", barCode);
                            mapResponse.put("isBarCodeMsg", barCode);
                        }
                    } catch (Exception e) {
                        log.trace(e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return mapResponse;
    }

}
