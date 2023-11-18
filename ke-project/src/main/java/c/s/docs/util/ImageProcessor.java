/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.util;

/**
 *
 * @author John.Simiyu
 */ 
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
//from   ww  w  .  j  a v  a2s .c om
import javax.imageio.ImageIO;

public class ImageProcessor {

    private int heightCurr = 0;
    private int heightTotal = 0;
    private int widthTotal = 0;
    int PageNo = 1;
//    private int 

    public static void main(String args[]) throws Exception {
//    BufferedImage img1 = ImageIO.read(new File("claims_images/15102020091705-4168184-28111-INV-scan2197_1.png"));
//    BufferedImage img2 = ImageIO.read(new File("claims_images/15102020091705-4168184-28111-INV-scan2197_1.png"));
//    
//    BufferedImage joinedImg = joinBufferedImage(img1, img2);
//    ImageIO.write(joinedImg, "png", new File("joined.png"));
//        joinVertically();
        ImageProcessor concatenator = new ImageProcessor();
        List<String> filePaths = new ArrayList<String>();
        filePaths.add("claims_images/15102020091705-4168184-28111-INV-scan2197_1.png");
        filePaths.add("claims_images/15102020091705-4168184-28111-INV-scan2197_1.png");
        filePaths.add("claims_images/15102020091705-4168184-28111-INV-scan2197_1.png");
        filePaths.add("claims_images/15102020091705-4168184-28111-INV-scan2197_1.png");

        BufferedImage joinedImg = concatenator.joinBufferedImageHorizotal(filePaths);
        ImageIO.write(joinedImg, "pdf", new File("joined.pdf"));
//        concatenator.encodeToString(concatenator.joinedImg, "png");
        System.out.println(concatenator.encodeToString(joinedImg, "pdf"));
//        concatenator.joinImagesVerticially(filePaths);

    }

    public BufferedImage joinBufferedImageHorizotal(List<String> filePaths) {

        int offset = 2;
        List<BufferedImage> bufferedImagesList = new ArrayList<BufferedImage>();
        filePaths.forEach((filepath) -> {
            try {
                BufferedImage image;
                image = ImageIO.read(new File(filepath));
                bufferedImagesList.add(image);
                heightTotal += image.getHeight();
                widthTotal += image.getWidth();
            } catch (IOException ex) {
                Logger.getLogger(ImageProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
//        int width = img1.getWidth() + img2.getWidth() + offset;
        Optional<BufferedImage> newHeight = bufferedImagesList.stream().max(Comparator.comparing(BufferedImage::getHeight));
        int height = newHeight.get().getHeight() + offset;
//        int height = Math.max(img1.getHeight(), img2.getHeight()) + offset;
        BufferedImage newImage = new BufferedImage(widthTotal, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = newImage.createGraphics();
        Color oldColor = g2.getColor();
        g2.setPaint(Color.BLACK);
        g2.fillRect(0, 0, widthTotal, height);
        g2.setColor(oldColor);
        bufferedImagesList.forEach((bufferedImage) -> {
            g2.drawImage(bufferedImage, null, heightCurr + offset, 0);
            heightCurr += bufferedImage.getWidth();
        });
//        g2.drawImage(img1, null, 0, 0);
//        g2.drawImage(img2, null, img1.getWidth() + offset, 0);
        g2.dispose();
        return newImage;
    }

//    public BufferedImage joinBufferedImageVertically(List<String> filePaths, String finalFileName, EdiActisureLogModel cacheClaim) throws IOException {
//
//        List<BufferedImage> bufferedImagesList = new ArrayList<BufferedImage>();
//        filePaths.forEach((filepath) -> {
//            try {
//                BufferedImage image;
//                image = ImageIO.read(new File(filepath));
//                bufferedImagesList.add(image);
//                heightTotal += image.getHeight();
//            } catch (IOException ex) {
//                Logger.getLogger(ImageProcessor.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        });
//
//        int offset = 10;
//        Optional<BufferedImage> widthx = bufferedImagesList.stream().max(Comparator.comparing(BufferedImage::getWidth));
//        int width = widthx.get().getWidth() + offset;
//        BufferedImage concatImage = new BufferedImage(width, heightTotal + offset, BufferedImage.TYPE_INT_RGB);
//        Graphics2D g2d = concatImage.createGraphics();
//        Color oldColor = g2d.getColor();
//        g2d.setPaint(Color.BLACK);
//        g2d.fillRect(0, 0, width, heightTotal);
//        g2d.setColor(oldColor);
//
//        bufferedImagesList.forEach((bufferedImage) -> {
//
//           
//
//            Graphics g = bufferedImage.getGraphics();
//            g.setFont(g.getFont().deriveFont(16f));
//            g.setColor(Color.RED);
//            FontMetrics fm = g.getFontMetrics();
//
//            String ASSESSMENT_ID = cacheClaim.getASSESSMENT_ID();
//            String ACTISURE_INVOICE_ID = cacheClaim.getACTISURE_INVOICE_ID();
//            String DME_DOCUMENT_NUMBER = "SMART_"+cacheClaim.getCLAIM_CODE();
//
//            String text = MessageFormat.format("PG NO: {0}, ASSESMENT ID: {1} , INV ID: {2} , SMART DOC NO: {3} ", PageNo, ASSESSMENT_ID, ACTISURE_INVOICE_ID, DME_DOCUMENT_NUMBER);
//            int textWidth = fm.stringWidth(text);
//            g.drawString(text, (bufferedImage.getWidth() / 2) - textWidth / 2, bufferedImage.getHeight()-10);
//            g.dispose();
//            PageNo++;
//            
//            g2d.drawImage(bufferedImage, 0, heightCurr + offset, null);
//            heightCurr += bufferedImage.getHeight();
//        });
//        g2d.dispose();
//
//        ImageIO.write(concatImage, "png", new File(finalFileName + ".png")); // export concat image
//        return concatImage;
//
//    }

    public String encodeToString(BufferedImage image, String type) {
        try {
            String imageString = null;
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();
            Base64.Encoder encoder = Base64.getEncoder();
            imageString = encoder.encodeToString(imageBytes);
            bos.close();

            return imageString;
        } catch (IOException ex) {
            Logger.getLogger(ImageProcessor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void joinVertically() throws IOException {

        int imagesCount = 4;
        BufferedImage images[] = new BufferedImage[imagesCount];
        for (int j = 0; j < images.length; j++) {
            images[j] = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = images[j].createGraphics();
            g2d.drawRect(10, 10, 80, 80);
            g2d.dispose();
        }
        int heightTotal = 0;
        for (int j = 0; j < images.length; j++) {
            heightTotal += images[j].getHeight();
        }

        int heightCurr = 0;
        BufferedImage concatImage = new BufferedImage(100, heightTotal, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = concatImage.createGraphics();
        for (int j = 0; j < images.length; j++) {
            g2d.drawImage(images[j], 0, heightCurr, null);
            heightCurr += images[j].getHeight();
        }
        g2d.dispose();

        ImageIO.write(concatImage, "png", new File("concat.png")); // export concat image
        ImageIO.write(images[0], "png", new File("single.png")); // export single image

    }

//    public static BufferedImage decodeToImage(String imageString) {
//    BufferedImage image = null;
//    byte[] imageByte;
//    try {
//        Base64.Decoder decoder = Base64.getDecoder();
//        imageByte = decoder.decode(imageString);
//        ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
//        image = ImageIO.read(bis);
//        bis.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    return image;
//}
}












