package com.example.chinalawtranslateclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ChinaLawTranslateClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChinaLawTranslateClientApplication.class, args);
        log.info("spring-boot-cxf-client启动!");
    }

}
