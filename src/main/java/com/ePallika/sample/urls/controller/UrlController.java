package com.ePallika.sample.urls.controller;

import com.ePallika.sample.urls.dtoconverter.UrlDtoConverter;
import com.ePallika.sample.urls.model.dto.UrlsDto;
import com.ePallika.sample.urls.service.Interface.UrlServiceInterface;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;
@RestController
@RequestMapping("/url")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UrlController {
    @Autowired
    UrlServiceInterface service;

    @PostMapping
    public ResponseEntity saveUrl(@RequestBody UrlsDto dto){
        return ResponseMessage.success(UrlDtoConverter.convert(service.save(dto)));
    }

    @GetMapping("/{offset}/{page}")
    public ResponseEntity getAllByPage(@PathVariable("offset") int offset, @PathVariable("page") int page){
        return ResponseMessage.success(service.getAllUrl(offset, page).map((a)->UrlDtoConverter.convert(a)));
    }

    @GetMapping
    public ResponseEntity getAll(){
        return ResponseMessage.success(service.getAll().stream().map(UrlDtoConverter::convert).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") long id){
        return ResponseMessage.success(UrlDtoConverter.convert(service.getById(id)));
    }
}

