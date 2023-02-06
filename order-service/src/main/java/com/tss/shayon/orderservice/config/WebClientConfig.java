package com.tss.shayon.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/*
 * ===========================================================
 * CONFIGURATION
 * */
//Non-blocking, reactive client to perform HTTP requests, exposing a fluent, reactive API over underlying HTTP client libraries such as Reactor Netty. - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/reactive/function/client/WebClient.html
@Configuration
public class WebClientConfig {

    // It will create a bean of webclient method name
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
