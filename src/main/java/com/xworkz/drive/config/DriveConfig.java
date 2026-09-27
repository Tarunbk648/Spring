package com.xworkz.drive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan(basePackages = "com.xworkz.drive")
public class DriveConfig {

    DriveConfig(){
        System.out.println("Drive Config is Called");
    }

    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver= new InternalResourceViewResolver();
        internalResourceViewResolver.setSuffix(".jsp");
        return  internalResourceViewResolver;
    }
}
