package com.xworkz.ns200spring.config.web;

import com.xworkz.ns200spring.config.NsConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NsWeb extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses() is called");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses() is called");
        return new Class[]{NsConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings() is called");
        return new String[]{"/"}; // "/" will indicates yenadhru barli Dispatcher servlet accept maadu
    }
}
