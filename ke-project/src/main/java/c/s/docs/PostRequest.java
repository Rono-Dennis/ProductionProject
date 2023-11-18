/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs;

/**
 *
 * @author John.Simiyu
 */
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.Base64;

/**
 *
 * @author jnyongesa
 */
public class PostRequest {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://providerportal.uapoldmutual.com:1196/RestServiceImpl.svc/UploadSmartDocument");
            String Username = "integration@smartapplicationsgroup.com";
            String Password = "c!YS+.mU|57P*|";
            String DestinationFolder = "Smart Test";
            String SourceFilePath = "C:\\Users\\john.simiyu\\Documents\\NetBeansProjects\\INTEG\\edi-doc-integration\\UAT\\CLM-388698582-UAT-PM3.pdf";
            String DestinationFileName = "CLM-388698582-UAT-PM3.pdf";
            String ClaimType = "Outpatient"; //Inpatient/Outpatient
            String ProviderName = "Sample Hospital Name";

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String encoding = Base64.getEncoder().encodeToString((Username + ":" + Password).getBytes("UTF-8"));
            connection.setRequestProperty("Authorization", "Basic " + encoding);
            connection.setRequestProperty("LibraryName", DestinationFolder);
            connection.setRequestProperty("DocumentName", DestinationFileName);
            connection.setRequestProperty("ClaimType", ClaimType);
            connection.setRequestProperty("ProviderName", ProviderName);

            OutputStream os = connection.getOutputStream();
            File file = new File(SourceFilePath);
            Files.copy(file.toPath(), os);
            os.close();

            InputStream content = (InputStream) connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(content));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
