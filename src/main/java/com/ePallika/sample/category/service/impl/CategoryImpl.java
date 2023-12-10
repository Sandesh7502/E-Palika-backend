package com.ePallika.sample.category.service.impl;

import com.ePallika.sample.category.model.Category;
import com.ePallika.sample.category.model.CategoryStatus;
import com.ePallika.sample.category.model.dto.CategoryDto;
import com.ePallika.sample.category.repository.CategoryRepository;
import com.ePallika.sample.category.service.Interface.CategoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryImpl implements CategoryInterface {

    @Autowired
    CategoryRepository repo;

    @Override
    public Category save(Category entity) {
        return repo.save(entity);
    }

    @Override
    public Category getById(int id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public List<Category> getLevel(int level) {
        return repo.getByLevel(level);
    }

    @Override
    public Category update(CategoryDto dto) {
        Category entity = repo.findById(dto.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        if (dto.getName() != null)
            entity.setName(dto.getName());
        if (dto.getParentId() != 0)
            entity.setParentId(dto.getParentId());
        if (dto.getLevel() != 0)
            entity.setLevel(dto.getLevel());
        return repo.save(entity);
    }

    @Override
    public List<Category> getAll() {
        return repo.findAll();
    }

    @Override
    public Category delete(int id) {
        Category entity = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//        entity.setDeleted(Boolean.TRUE);
        return repo.save(entity);
    }

    @Override
    public Category changeStatus(int id, CategoryStatus status) {
        Category entity = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        entity.setStatus(status);
        return repo.save(entity);
    }

    @Override
    public List<Category> getByStatus(CategoryStatus status) {
        return repo.findByStatus(status);
    }


}
