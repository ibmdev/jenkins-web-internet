package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import javax.annotation.PostConstruct;

/**
 * Created  on 07/01/2018.
 */

@Configuration
public class ConfigBean {

    @Autowired
    private Environment env;

    @PostConstruct
    public void post() {
        System.out.println("ConfigBean - Post Construct : "+env.getProperty("com.ibm.spring.webapp.name"));
    }
}
