package com.ePallika.sample.category.model.dto;

import com.ePallika.sample.category.model.CategoryStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto {

    private int id;
    private String name;

    private long parentId;

    private int level;

    private String description;

    private CategoryStatus status;

}
