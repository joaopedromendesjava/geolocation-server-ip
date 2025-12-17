package com.ip.geolocation.service.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ip.geolocation.service")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
