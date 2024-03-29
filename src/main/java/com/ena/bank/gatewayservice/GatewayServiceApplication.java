package com.ena.bank.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
        /*new SpringApplicationBuilder(GatewayServiceApplication.class)
                .web(WebApplicationType.REACTIVE)
                .run(args);*/
    }

}
