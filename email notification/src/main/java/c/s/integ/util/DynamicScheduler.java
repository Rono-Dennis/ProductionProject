// package c.s.integ.util;

// import java.util.Calendar;
// import java.util.Date;
// import java.util.GregorianCalendar;
// import java.util.concurrent.Executor;
// import java.util.concurrent.Executors;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.env.Environment;
// import org.springframework.scheduling.Trigger;
// import org.springframework.scheduling.TriggerContext;
// import org.springframework.scheduling.annotation.EnableScheduling;
// import org.springframework.scheduling.annotation.SchedulingConfigurer;
// import org.springframework.scheduling.config.ScheduledTaskRegistrar;

// @Configuration
// @EnableScheduling
// public class DynamicScheduler implements SchedulingConfigurer {

//     @Autowired
//     Environment env;

//     @Bean
//     public MyBean myBean() {
//         return new MyBean();
//     }

//     @Bean(destroyMethod = "shutdown")
//     public Executor taskExecutor() {
//         return Executors.newScheduledThreadPool(100);
//     }

//     @Override
//     public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//         taskRegistrar.setScheduler(taskExecutor());
//         taskRegistrar.addTriggerTask(
//                 new Runnable() {
//                     @Override public void run() {
//                         myBean().getSchedule();
//                     }
//                 },
//                 new Trigger() {
//                     @Override public Date nextExecutionTime(TriggerContext triggerContext) {
//                         Calendar nextExecutionTime =  new GregorianCalendar();
//                         Date lastActualExecutionTime = triggerContext.lastActualExecutionTime();
//                         nextExecutionTime.setTime(lastActualExecutionTime != null ? lastActualExecutionTime : new Date());
//                         nextExecutionTime.add(Calendar.MILLISECOND, env.getProperty("myRate", Integer.class)); //you can get the value from wherever you want
//                         return nextExecutionTime.getTime();
//                     }
//                 }
//         );
//     }
// }