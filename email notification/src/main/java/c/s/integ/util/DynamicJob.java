// package c.s.integ.util;

// import java.util.Calendar;
// import java.util.Date;
// import java.util.GregorianCalendar;
// import java.util.concurrent.Executor;
// import java.util.concurrent.Executors;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.scheduling.TaskScheduler;
// import org.springframework.scheduling.Trigger;
// import org.springframework.scheduling.TriggerContext;
// import org.springframework.scheduling.annotation.SchedulingConfigurer;
// import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
// import org.springframework.scheduling.config.ScheduledTaskRegistrar;
// import org.springframework.scheduling.support.CronTrigger;

// //@Configuration
// public class DynamicJob implements SchedulingConfigurer {

//     // @Bean(destroyMethod = "shutdown")
//     // public Executor taskExecutor() {
//     //     System.out.println("shutting down...");
//     //     return Executors.newScheduledThreadPool(100);
//     //     }
    
//     @Override
//     public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//     taskRegistrar.addTriggerTask(
//         new Runnable() {
//             @Override
//             public void run() {
//                 // Do not put @Scheduled annotation above this method, we don't need it anymore.
//                 System.out.println("executing..." + Calendar.getInstance().getTime());
//                 }
//             }, 

//         new Trigger() {
//             @Override
//             public Date nextExecutionTime(TriggerContext triggerContext) {
//                 Calendar nextExecutionTime = new GregorianCalendar();
//                 Date lastActualExecutionTime = triggerContext.lastActualExecutionTime();
//                 nextExecutionTime.setTime(lastActualExecutionTime != null ? lastActualExecutionTime : new Date());
//                 nextExecutionTime.add(Calendar.MILLISECOND, getNewExecutionTime());
//                 return nextExecutionTime.getTime();
//                 }
//             }
    
//         //new CronTrigger("0 */5 * * * *")
//         );
//     }

//     private int getNewExecutionTime() {
//         //Load Your execution time from database or property file
//         System.out.println("getting execution time...");
//         return 60000;
//         }

//     //ref: https://learnwithtaufik.home.blog/2019/03/05/dynamic-scheduling-with-spring-boot/
//     @Bean
//     public TaskScheduler poolScheduler() {
//         ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//         scheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
//         scheduler.setPoolSize(1);
//         scheduler.initialize();
//         return scheduler;
//     }        

// }