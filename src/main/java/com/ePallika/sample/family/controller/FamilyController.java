package com.ePallika.sample.family.controller;


import com.ePallika.sample.family.dtoconverter.FamilyDtoConverter;
import com.ePallika.sample.family.model.dto.FamilyDto;
import com.ePallika.sample.family.service.Interface.FamilyServiceInterface;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/family")
public class FamilyController {

    @Autowired
    FamilyServiceInterface service;


    @PostMapping
    public ResponseEntity save(@RequestBody FamilyDto dto){
        return ResponseMessage.success(FamilyDtoConverter.convert(service.save(dto)));
    }

    @GetMapping("{offset}/{page}")
    public ResponseEntity getAll(@PathVariable("offset") int offset, @PathVariable("page") int page){
        return ResponseMessage.success(service.getAllFamily(offset, page).map(FamilyDtoConverter::convert));
    }
}
