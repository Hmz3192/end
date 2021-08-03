package com.end.onlineendapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class},
        scanBasePackages = {"com.end"})
public class OnlineEndAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineEndAppApplication.class, args);
    }

}
