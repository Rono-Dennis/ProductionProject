package c.s.docs.daemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import c.s.docs.model.UAPUpload;
import c.s.docs.service.ClaimsInvLines;
import c.s.docs.service.SpAttachmentService;

@Component
@EnableScheduling
@EnableAsync
public class ClaimsDaemon {
	 private static final Logger log = LoggerFactory.getLogger(ClaimsInvLines.class);

    @Autowired
    private ClaimsInvLines claimsInvLines;

    @Autowired
    private SpAttachmentService attachmentService;

	@Async
	@Scheduled(fixedRate  = 600000)
	public void processClaimsWithoutAttachments() {
		//UAP-OM
		log.info("Start UAP Create Documents");
		claimsInvLines.getClaimWithoutAttachments(351);
		log.info("End UAP Create Documents");
		
		//EABL
		log.info("Start EABL Create Documents");
		claimsInvLines.getClaimWithoutAttachments(61000955);
		log.info("End EABL Create Documents");

    }

    @Async
    @Scheduled(fixedRate = 600000)
    public void processSpAttachments() {

		log.info("Start UAP Portal Documents");
        attachmentService.processSpAttachments(351);
		log.info("End UAP Portal Documents");

		log.info("Start EABL Portal Documents");
        attachmentService.processSpAttachments(61000955);
		log.info("End EABL Portal Documents");
    }
}
