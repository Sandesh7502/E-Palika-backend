package com.ePallika.sample.category.service.Interface;

import com.ePallika.sample.category.model.Category;
import com.ePallika.sample.category.model.CategoryStatus;
import com.ePallika.sample.category.model.dto.CategoryDto;

import java.util.List;

public interface CategoryInterface {

    Category save(Category entity);

    Category getById(int id);

    List<Category> getAll();

    List<Category> getLevel(int level);

    Category update(CategoryDto dto);

    Category delete(int id);

    Category changeStatus(int id, CategoryStatus status);

    List<Category> getByStatus(CategoryStatus status);

}
