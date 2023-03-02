package com.tss.shayon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * ===========================================================
 * RUNNING MAIN SPRING BOOT SERVER FROM HERE
 * */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
