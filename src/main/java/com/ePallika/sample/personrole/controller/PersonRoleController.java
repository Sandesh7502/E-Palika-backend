package com.ePallika.sample.personrole.controller;

import com.ePallika.sample.personrole.dtoconverter.PersonRoleDtoConverter;
import com.ePallika.sample.personrole.service.Interface.PersonRoleInterface;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/person/role")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PersonRoleController {
    @Autowired
    PersonRoleInterface service;

    @GetMapping
    public ResponseEntity getAllPersonRole(){
        return ResponseMessage.success(service.getPersonRole().stream().map(PersonRoleDtoConverter::convert).collect(Collectors.toList()));
    }
}
