package com.baizhi;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyIntercepterConfig extends WebMvcConfigurerAdapter {
    public void addInterceptors(InterceptorRegistry registry){
        MyIntercepter intercepter = new MyIntercepter();
         registry.addInterceptor(intercepter)
                 .addPathPatterns("/test/**")
                 .excludePathPatterns("/test/test01");
    }
}
