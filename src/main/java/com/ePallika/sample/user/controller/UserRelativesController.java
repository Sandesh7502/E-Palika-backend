package com.ePallika.sample.user.controller;


import com.ePallika.sample.user.dtoconverter.UserDtoConverter;
import com.ePallika.sample.user.model.dto.UserRelativeDto;
import com.ePallika.sample.user.service.UserRelativeServiceInterface;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/relative")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserRelativesController {

    @Autowired
    UserRelativeServiceInterface service;

    public ResponseEntity saveUserRelative(@RequestBody UserRelativeDto dto){
        return ResponseMessage.success(UserDtoConverter.convert(service.saveUserRelative(dto)));
    }

}
