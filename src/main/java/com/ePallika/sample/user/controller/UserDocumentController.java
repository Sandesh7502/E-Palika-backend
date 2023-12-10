package com.ePallika.sample.user.controller;

import com.ePallika.sample.user.dtoconverter.UserDtoConverter;
import com.ePallika.sample.user.model.dto.UserDocumentDto;
import com.ePallika.sample.user.service.UserDocumentServiceInterface;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user/document")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserDocumentController {

    @Autowired
    UserDocumentServiceInterface service;

    @PostMapping
    public ResponseEntity saveUserDocument(@RequestBody UserDocumentDto dto){
        return ResponseMessage.success(UserDtoConverter.convert(service.saveUserDocument(dto)));
    }

}
