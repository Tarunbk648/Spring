package com.xworkz.hasa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.xworkz.hasa")
public class ConfigurationFile {

     ConfigurationFile(){
        System.out.println("Configuration called");
    }
}
