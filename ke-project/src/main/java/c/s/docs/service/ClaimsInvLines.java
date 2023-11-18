package c.s.docs.service;

import c.s.docs.model.*;
import c.s.docs.repo.ClaimsRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@Service("ClaimsInvLines")
public class ClaimsInvLines {

    @Value("${sharepoint.endpoint}")
    private String sharepointURL;

    @Value("${sharepoint.email}")
    private String sharepointUsername;

    @Value("${sharepoint.password}")
    private String sharepointPassword;

    @Value("${sharepoint.folder}")
    private String sharepointFolder;

    private static final Logger log = LoggerFactory.getLogger(
            ClaimsInvLines.class
    );

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private ClaimsRepo claimsRepo;

    @Autowired
    private ResourceLoader resourceLoader;

    String baseUrl = "http://192.180.4.230:8082/abakus";
    WebClient webClient = WebClient.builder().baseUrl(baseUrl).build();

    public String directoryName = "reports/";

    public EdiClaims getClaims() {
        //		Claims claims=webClientBuilder.build()
        //			.get()
        //			.uri("/integ/claims")
        //			.retrieve()
        //			.bodyToMono(Claims.class)
        //			.block();
        //		return claims;

        EdiClaims ediClaims = webClient
                .get()
                .uri("/integ/claims")
                .retrieve()
                .bodyToMono(EdiClaims.class)
                .block();

        return ediClaims;
    }

//    @Async
    public void getClaimWithoutAttachments(Integer custId) {
        try {
            File directory = new File(directoryName);
            if (!directory.exists()) {
                directory.mkdir();
            }

            Resource JasperReport_A4 = resourceLoader.getResource(
                    "classpath:/reports/JasperReport_A4.jrxml"
            );
            File jrxmlFile = ResourceUtils.getFile("");

            //            ClassPathXmlApplicationContext appContext = ClassPathXmlApplicationContext() ;
            //        File file = appContext.getResource("classpath:/example.txt");
            //
            //			JasperReport jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
            List<Claims> listClaims = claimsRepo.fetchClaims(custId);
            //                        log.info(marker, baseUrl, log);
            log.info("****************** CLAIMS FOUND READY TO GENERATE THE DOCUMENTS----------["+ listClaims.size()+"]");
            try {
                for (Claims claims : listClaims) {
                    Integer claimId = claims.getId();
                    String memberName = claims.getMemberNames();
                    String memberNumber = claims.getMemberNumber();
                    String benefits = "";
                    String claimDate = "";
                    String provider = claims.getProvider();
                    String authorizedBy = claims.getAuthorizedBy();
                    String registrationNo = "";
                    String copayAmount = "0.00";
                    String invoiceAmount = "0.00";
                    String serviceType = claims.getServiceType();
                    String integ_member_number = claims.getInteg_member_number();

                    // method 1
                    Timestamp timestampx = new Timestamp(System.currentTimeMillis());
                    //        System.out.println(timestamp);                      // 2021-03-24 16:34:26.666

                    //        // method 2 - via Date
                    //        Date date = new Date();
                    //        System.out.println(new Timestamp(date.getTime()));  // 2021-03-24 16:34:26.666
                    //                                                            // number of milliseconds since January 1, 1970, 00:00:00 GMT
                    String timestamp = new SimpleDateFormat("ddMMyyyyHHmmss")
                            .format(new java.util.Date());
                    String fileName
                            = "CLAIM-"
                            + timestampx.getTime()
                            + "-"
                            + claims.getVisit_number()
                            + "-"
                            + claims.getGlobal_id()
                            + ".pdf";
                    fileName = fileName.replace("/", "-");
                    String fileNameAbsolutePath = directoryName + fileName;
                    OutputStream outputStream = new FileOutputStream(
                            new File(fileNameAbsolutePath)
                    );
                    if (serviceType.equalsIgnoreCase("OP")) {
                        serviceType = "Outpatient";
                    } else {
                        serviceType = "Inpatient";
                    }
                    //				log.info("Claim ID - "+claimId.toString());
                    // CHECK ON THE VISIT START DATES AND UPDATE IF NECESSARY
                    Date minClaimDate = claimsRepo.validateVisitStart(
                            claims.getVisit_number(),
                            claims.getGlobal_id(),
                            claims.getProv_id()
                    );

                    List<Invoices> listInvoices = claimsRepo.fetchInvoices(
                            claims.getVisit_number(),
                            claims.getGlobal_id(),
                            claims.getProv_id()
                    );
                    //                Integer visit_number, String global_id, Integer prov_id
                    List<JasperPrint> jasperPrintList = new ArrayList<JasperPrint>();

                    Map<Integer, Integer> claimIdMap = new HashMap<Integer, Integer>();
                    if (listInvoices.size() > 0) {
                        log.info(
                                "****************** GENERATING PDF DOCUMENR****************",
                                listClaims.get(0).getId()
                        );
                        //
                        for (Invoices invoices : listInvoices) {
                            claimId = Integer.parseInt(invoices.getClaimId());
                            List<Diagnosis> diagnosisLines = claimsRepo.fetchDiagnosis(
                                    Integer.parseInt(invoices.getClaimId())
                            );
                            claimIdMap.put(
                                    Integer.parseInt(invoices.getClaimId()),
                                    Integer.parseInt(invoices.getClaimId())
                            );
                            Integer invoiceId = invoices.getId();
                            String invoiceNumber = invoices.getInvoiceNumber();
                            benefits = invoices.getBenefitDesc();
                            claimDate = invoices.getInvoiceDate();
                            invoiceAmount = invoices.getAmount();

                            //					log.info("Invoice ID - "+invoiceId.toString());
                            List<InvoiceLines> invoiceLines = claimsRepo.fetchInvoiceLines(
                                    invoiceId
                            );

                            JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(
                                    invoiceLines
                            );
                            JRBeanCollectionDataSource diagnosisJRBean = new JRBeanCollectionDataSource(
                                    diagnosisLines
                            );

                            JRBeanCollectionDataSource paymentModifierJRBean = new JRBeanCollectionDataSource(
                                    claimsRepo.fetchPaymentModifier(claimId)
                            );


                            Map<String, Object> parameters = new HashMap<String, Object>();
                            parameters.put("CollectionBeanParam", itemsJRBean);
                            parameters.put("DiagnosisCollectionBeanParam", diagnosisJRBean);
                            parameters.put("invoiceNumber", invoiceNumber);
                            parameters.put("memberName", memberName);
                            parameters.put("memberNumber", memberNumber);
                            parameters.put("benefits", benefits);
                            parameters.put("claimDate", claimDate);
                            parameters.put("provider", provider);
                            parameters.put("authorizedBy", authorizedBy);
                            parameters.put("registrationNo", registrationNo);
                            parameters.put("copayAmount", copayAmount);
                            parameters.put("invoiceAmount", invoiceAmount);
                            parameters.put("claimId", claimId);
                            parameters.put("integMemberNumber", integ_member_number);

                            parameters.put("paymentModifier", paymentModifierJRBean);

                            InputStream input = JasperReport_A4.getInputStream();
                            //                            new FileInputStream(jrxmlFile);
                            JasperDesign jasperDesign = JRXmlLoader.load(input);
                            JasperReport jasperreport = JasperCompileManager.compileReport(
                                    jasperDesign
                            );
                            JasperPrint jasperPrint = JasperFillManager.fillReport(
                                    jasperreport,
                                    parameters,
                                    new JREmptyDataSource()
                            );
                            jasperPrintList.add(jasperPrint);
                        }
                        log.info("****************** GENERATING PDF DOCUMENR****************");
                        JRPdfExporter jrpdfExporter = new JRPdfExporter();

                        jrpdfExporter.setParameter(
                                JRPdfExporterParameter.FORCE_LINEBREAK_POLICY,
                                Boolean.TRUE
                        );
                        jrpdfExporter.setParameter(
                                JRPdfExporterParameter.OUTPUT_STREAM,
                                outputStream
                        );
                        jrpdfExporter.setParameter(
                                JRPdfExporterParameter.JASPER_PRINT_LIST,
                                jasperPrintList
                        );
                        jrpdfExporter.exportReport();

                        log.info("****************** SENDING THE PDF TO SHAREPOINT ****************");
                        UAPUpload uapUpload = new UAPUpload();
                        uapUpload.setClaimType(serviceType);
                        uapUpload.setFileName(fileName);
                        uapUpload.setProviderName(provider);

                        Attachment attachment = new Attachment();
                        attachment.setAttName(fileName);
                        attachment.setUserId(0);
                        attachment.setAttType("INV");
                        attachment.setClaimId(claims.getId());
                        attachment.setInvoiceId(0);

                        Map<String, String> sendDocMap = sendDocumentUAP(uapUpload);

                        if (sendDocMap.containsKey("barCode")) {
                            log.info("****************** BARCODE SHARED ****************");
                            String isBarCode = sendDocMap.get("isBarCode");
                            String barCode = sendDocMap.get("barCode");
                            String isBarCodeMsg = sendDocMap.get("isBarCodeMsg");
                            attachment.setBarCode(barCode);

                            if (isBarCode.equalsIgnoreCase("true")) {
                                Boolean isSmartFTP = sendDocumentSmartFtp(fileNameAbsolutePath);
                                for (Map.Entry<Integer, Integer> claimEntry : claimIdMap.entrySet()) {
                                    attachment.setClaimId(claimEntry.getKey());
                                    if (isSmartFTP) {
                                        claimsRepo.saveAttachment(attachment);
                                    } else {
                                        claimsRepo.saveAttachment(attachment);
                                    }
                                }
                                claimsRepo.updateClaimBarCode(attachment, claims);
//                                deleteFileLocaly(fileNameAbsolutePath);
                            } else {
                                log.error(
                                        "\uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D Document file "
                                        + fileName
                                        + " failed to save in sharepoint with the following error "
                                        + isBarCodeMsg
                                );
                            }
                        } else {
                            log.error(
                                    "Connection to UAP Sharepoint server failed \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D"
                            );
                        }
                        
                        deleteFileLocaly(fileName);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JRException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFileLocaly(String fileName) {
		try {
			File f= new File(fileName);
			if(f.delete()) {
//				log.info("File deleted locally after Push to UAP and Smart Server");
			}else {
				log.error("File deletion failed");
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
	}

	public Map<String, String> sendDocumentUAP(UAPUpload uapUpload) {
        Map<String, String> mapResponse = new HashMap<String, String>();
        String barCode = null;
        try {
            String claimType = uapUpload.getClaimType(); //Inpatient/Outpatient
            String providerName = uapUpload.getProviderName();
            String fileName = uapUpload.getFileName();


//            URL url = new URL(
//                    "https://providerportal.uapoldmutual.com:1196/RestServiceImpl.svc/UploadSmartDocumentProd"
//            );
//            String Username = "integration@smartapplicationsgroup.com";
//            String Password = "c!YS+.mU|57P*|";
//            String DestinationFolder = "Smart";

            URL url = new URL(sharepointURL);
            String Username = sharepointUsername;
            String Password = sharepointPassword;
            String DestinationFolder = sharepointFolder;
            String SourceFilePath = directoryName + fileName;
            String DestinationFileName = fileName;

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setReadTimeout(60000);

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
//                System.out.println("sending docts");
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
        } catch (java.net.SocketTimeoutException e) {
//        	e.printStackTrace();
        	log.error("Socket Timeout - "+e.getMessage());
        } catch (java.io.IOException e) {
//        	e.printStackTrace();
        	log.error("IO Timeout - "+e.getMessage());
        } catch (Exception e) {
        	e.printStackTrace();
            log.error(e.getMessage());
        }
        return mapResponse;
    }

    public Boolean sendDocumentSmartFtp(String SourceFilePath) {
        FtpDownload ftp = new FtpDownload();
        Boolean isTransfer = false;
        try {
            isTransfer = ftp.ConnectAndUpload(SourceFilePath);
        } catch (JSchException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (SftpException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        return isTransfer;
    }
}








