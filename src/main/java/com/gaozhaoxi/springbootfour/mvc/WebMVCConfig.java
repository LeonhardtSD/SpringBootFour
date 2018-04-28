package com.gaozhaoxi.springbootfour.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Leon
 */
@Configuration
public class WebMVCConfig extends WebMvcConfigurationSupport{
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/hello").setViewName("/hello");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //两个*表示以/static开始的任意层级的路径都可以访问得到图片，如<img src="../static/img/1.png">
        //一个*表示只可以访问assets目录下的图片文件
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
