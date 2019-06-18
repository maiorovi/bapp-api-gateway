package com.bapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class BAppApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BAppApiGatewayApplication.class, args);
    }

}
