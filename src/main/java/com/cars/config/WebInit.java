package com.cars.config;

import com.cars.config.AppConfig;
import com.cars.config.MVCconfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MVCconfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
