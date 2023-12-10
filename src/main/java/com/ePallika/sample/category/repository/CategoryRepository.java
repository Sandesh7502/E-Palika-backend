package com.ePallika.sample.category.repository;

import com.ePallika.sample.category.model.Category;
import com.ePallika.sample.category.model.CategoryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Query("select frc from Category frc where frc.level = :level order by frc.id desc")
    List<Category> getByLevel(@Param("level") int level);

    @Query("select frc from Category frc order by frc.id desc")
    List<Category> getAll();

    List<Category> findByStatus(CategoryStatus status);
}
