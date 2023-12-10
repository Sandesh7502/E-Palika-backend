package com.ePallika.sample.category.dtoconverter;

import com.ePallika.sample.category.model.Category;
import com.ePallika.sample.category.model.dto.CategoryDto;

public class CategoryDtoConverter {

    public static Category convert(CategoryDto dto) {
        Category entity = new Category();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setParentId(dto.getParentId());
        entity.setLevel(dto.getLevel());
        entity.setDescription(dto.getDescription());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    public static CategoryDto convert(Category entity) {
        CategoryDto dto = new CategoryDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setParentId(entity.getParentId());
        dto.setLevel(entity.getLevel());
        dto.setStatus(entity.getStatus());
        dto.setDescription(entity.getDescription());
        return dto;
    }
}
