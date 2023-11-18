package c.s.docs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import c.s.docs.DocsIntegrationApplication;
import c.s.docs.service.ClaimsInvLines;

@RestController
public class RestartController {
	private static final Logger log = LoggerFactory.getLogger(RestartController.class);
	
	@PostMapping("/restart")
	public void restart() {
		log.info("Application Restarting");
		DocsIntegrationApplication.restart();
	}
}
