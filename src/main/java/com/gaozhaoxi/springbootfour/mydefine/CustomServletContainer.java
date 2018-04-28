package com.gaozhaoxi.springbootfour.mydefine;


import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;

/**
 * @author Leon
 */
public class CustomServletContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {


    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
            factory.addErrorPages(new ErrorPage(HttpStatus.NOT_MODIFIED,"404.html"));
    }
}
