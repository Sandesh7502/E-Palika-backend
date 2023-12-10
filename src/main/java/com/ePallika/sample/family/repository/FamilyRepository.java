package com.ePallika.sample.family.repository;

import com.ePallika.sample.family.model.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family,Integer> {
}
