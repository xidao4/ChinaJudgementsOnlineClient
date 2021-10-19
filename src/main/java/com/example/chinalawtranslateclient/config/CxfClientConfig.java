package com.example.chinalawtranslateclient.config;

import com.example.chinalawtranslate.service.DocService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfClientConfig {

    @Bean
    public DocService createDocServiceProxy() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(DocService.class);
        jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:8080/ws/doc?wsdl");
        return (DocService)jaxWsProxyFactoryBean.create();
    }
}
