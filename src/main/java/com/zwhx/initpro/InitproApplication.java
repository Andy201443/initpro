package com.zwhx.initpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class InitproApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitproApplication.class, args);
    }
}
