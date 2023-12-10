package com.ePallika.sample.thirdpartyapi.controller;


import com.ePallika.sample.thirdpartyapi.model.dto.ProjectPermaDto;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@RestController
@RequestMapping("/project/perma")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProjectPermaList {

    private static final Duration REQUEST_TIMEOUT = Duration.ofMinutes(5);

    private final WebClient localApiClient;

    @Autowired
    public ProjectPermaList(WebClient localApiClient) {
        this.localApiClient = localApiClient;
    }

    @GetMapping
    public ResponseEntity getProjectPermaList(){

        return ResponseMessage.success(localApiClient
                .get()
                .uri("http://localhost:5000/project/perma/cbps/all")
                .retrieve()
                .bodyToMono(ProjectPermaDto[].class)
                .block(REQUEST_TIMEOUT));

    }
}