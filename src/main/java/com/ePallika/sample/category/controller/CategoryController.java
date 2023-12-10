package com.ePallika.sample.category.controller;

import com.ePallika.sample.category.dtoconverter.CategoryDtoConverter;
import com.ePallika.sample.category.model.CategoryStatus;
import com.ePallika.sample.category.model.dto.CategoryDto;
import com.ePallika.sample.category.service.Interface.CategoryInterface;
import com.ePallika.sample.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryInterface service;

    @PostMapping
    public ResponseEntity save(@RequestBody CategoryDto dto) {
        return ResponseMessage.success(CategoryDtoConverter.convert(service.save(CategoryDtoConverter.convert(dto))));
    }

    @GetMapping
    public ResponseEntity getByid(@RequestParam("id") int id) {
        return ResponseMessage.success(CategoryDtoConverter.convert(service.getById(id)));
    }

    @GetMapping("/all")
    public ResponseEntity getAll() {
        return ResponseMessage
                .success(service.getAll().stream().map(CategoryDtoConverter::convert).collect(Collectors.toList()));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody CategoryDto dto) {
        return ResponseMessage.success(CategoryDtoConverter.convert(service.update(dto)));
    }

    @PatchMapping
    public ResponseEntity delete(@RequestParam("id") int id) {
        return ResponseMessage.success(CategoryDtoConverter.convert(service.delete(id)));
    }

    @PatchMapping("/change/status")
    public ResponseEntity changeStatus(@RequestParam("id") int id, @RequestParam("status") CategoryStatus status) {
        return ResponseMessage.success(CategoryDtoConverter.convert(service.changeStatus(id, status)));
    }

    @GetMapping("/get/by/status")
    public ResponseEntity getByStatus(@RequestParam("status") CategoryStatus status) {
        return ResponseMessage.success(
                service.getByStatus(status).stream().map(CategoryDtoConverter::convert).collect(Collectors.toList()));
    }
}
