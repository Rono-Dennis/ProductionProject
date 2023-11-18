package com.smart.cleanup.SmartCleanUp.Schedular;

import com.smart.cleanup.SmartCleanUp.Service.CicPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@EnableAsync
public class Scheduler {
    @Autowired
    private CicPolicyService cicPolicyService;

//    @Scheduled(fixedRate = 1000)
    @Scheduled(cron = "0 5 11 * * *")
    public void runIntegrationReverseService(){
//        cicPolicyService.InitiateCicAlreadyExistProcess();
        cicPolicyService.AlignMemType();
    }
}