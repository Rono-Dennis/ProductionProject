/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.s.docs.StartuRunners;

import c.s.docs.service.SpAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author John.Simiyu
 */
@Component
public class ApplRunner implements ApplicationRunner {

    @Autowired
    private SpAttachmentService attachmentService;

    @Override
    public void run(ApplicationArguments aa) throws Exception {

//        attachmentService.processSpAttachments();

    }

}
