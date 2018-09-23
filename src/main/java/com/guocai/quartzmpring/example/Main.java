package com.guocai.quartzmpring.example;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * java类简单作用描述
 *
 * @ClassName: Main
 * @Package: com.guocai.quartzmpring.example
 * @Description: <  >
 * @Author: Sun GuoCai
 * @CreateDate: 2018/9/23 9:30
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();//自动快速地使用缺省Log4j环境。
        new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
}
