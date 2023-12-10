package com.ePallika.sample.thirdpartyapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class Config {
    @Bean
    public WebClient localApiClient() {
        return WebClient.create("");
    }
}
