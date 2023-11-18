/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFMergerUtility;
import org.slf4j.LoggerFactory;

import c.s.docs.service.ClaimsInvLines;

import java.io.*;
//import sun.misc.BASE64Decoder;

/**
 *
 * @author John.Simiyu
 */
public class PdfProcessor {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(PdfProcessor.class);

//    public static void main(String[] args) throws IOException, COSVisitorException {
//
//        List<String> filePaths = new ArrayList();
//        filePaths.add("15102020091646-4168184-28111-CF-scan2198.pdf");
//        filePaths.add("15102020091705-4168184-28111-INV-scan2197.pdf");
//        PdfProcessor pdfProcessor = new PdfProcessor();
//        pdfProcessor.mergePdfs(filePaths, "new_merged.pdf");
////        //Loading an existing PDF document 
////        File file1 = new File("15102020091705-4168184-28111-INV-scan2197.pdf");
////        PDDocument doc1 = PDDocument.load(file1);
////
////        File file2 = new File("15102020091646-4168184-28111-CF-scan2198.pdf");
////        PDDocument doc2 = PDDocument.load(file2);
////
////        //Instantiating PDFMergerUtility class 
////        PDFMergerUtility PDFmerger = new PDFMergerUtility();
////
////        //Setting the destination file 
////        PDFmerger.setDestinationFileName("merged.pdf");
////
////        //adding the source files 
////        PDFmerger.addSource(file1);
////        PDFmerger.addSource(file2);
////
////        //Merging the two documents 
////        PDFmerger.mergeDocuments();
////        System.out.println("Documents merged");
////
////        //Closing the documents 
////        doc1.close();
////        doc2.close();
//    }

    public String mergePdfs(List<String> filePaths, String fileName) throws COSVisitorException, IOException {
        //Instantiating PDFMergerUtility class 
        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        //Setting the destination file 
        pdfMerger.setDestinationFileName(fileName);
        List<PDDocument> docs = new ArrayList();
        filePaths.forEach((filePath) -> {
            try {
                //Loading an existing PDF document
                File file = new File(filePath);
                docs.add(PDDocument.load(file));
                //adding the source files
                pdfMerger.addSource(file);
            } catch (IOException ex) {
            	log.error(ex.getMessage());
            } catch (Exception ex) {
            	log.error(ex.getMessage());
            }
        });
        //Merging documents 
        pdfMerger.mergeDocuments();
//        System.out.println("Documents merged");
        log.info("Documents merged");
        //Closing the documents 
        docs.forEach((doc) -> {
            try {
                doc.close();
            } catch (IOException ex) {
                log.error(ex.getMessage());
            }catch (Exception ex) {
                log.error(ex.getMessage());
            }
        });
        return fileName;
    }

    public String ConvertPdfToBase64(String filePath) {
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            return encodedString;
        } catch (IOException ex) {
            log.error(ex.getMessage());
            return null;
        } catch (Exception ex) {
            log.error(ex.getMessage());
            return null;
        }
    }

    public String convertBase64ToPdf(String encodedBytes, String fileName, String file_directory) {
        File directory = new File(file_directory);
        if (!directory.exists()) {
            directory.mkdir();
        }
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
            File file = new File(file_directory+ fileName);
            try ( FileOutputStream fop = new FileOutputStream(file)) {
                fop.write(decodedBytes);
                fop.flush();
            }
            return file.getPath().toString();
        } catch (IOException ex) {

            log.error(ex.getMessage());
            return null;
        } catch (Exception ex) {

            log.error(ex.getMessage());
            return null;
        }
    }

}
