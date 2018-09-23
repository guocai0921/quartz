package com.guocai.quartzmpring.example;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * java类简单作用描述
 *
 * @ClassName: MyJob
 * @Package: com.guocai.quartzmpring.example
 * @Description: <  >
 * @Author: Sun GuoCai
 * @CreateDate: 2018/9/23 9:11
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class MyJob extends QuartzJobBean {
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("myJob 执行了 ......." + jobExecutionContext.getTrigger().getKey().getName());
        ApplicationContext applicationContext = (ApplicationContext) jobExecutionContext.getJobDetail().getJobDataMap().get("applicationContext");
        System.out.println("得到的Spring容器是:" + applicationContext);
    }
}
