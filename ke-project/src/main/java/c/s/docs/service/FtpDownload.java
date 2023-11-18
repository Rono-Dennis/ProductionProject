/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.service;


import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author smart
 */
public class FtpDownload {
    
    private String ftpHost = "192.180.3.175";
    private Integer ftpPort =22;
    private String ftpUsername = "smart-ftp";
    private String ftpPassword = "ihl@2019!";
    private String ftpDestination="/home/smart-ftp/www/reports/downloads/";

    
    

    public FtpDownload() {
        
    }
    
    public Boolean ConnectAndUpload(
    		String source
    		) throws JSchException, SftpException {
    	Boolean r=false;
    	try{
	    	JSch jsch = new JSch();
	    	Session mysession = null;
	    	mysession = jsch.getSession(ftpUsername, ftpHost, ftpPort);
	    	mysession.setPassword(ftpPassword);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            mysession.setConfig(config);
//	    	mysession.setConfig("StrictHostKeyChecking", "no");
	    	mysession.connect();
	        Channel channel = mysession.openChannel("sftp");
	        channel.connect();
	        ChannelSftp sftpChannel = (ChannelSftp) channel;
	        sftpChannel.put(source, ftpDestination);
	        sftpChannel.exit();
			channel.disconnect();
	        mysession.disconnect();
	        r=true;
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        return r;
    }
}
