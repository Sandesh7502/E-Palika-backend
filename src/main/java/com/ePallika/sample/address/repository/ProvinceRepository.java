package com.ePallika.sample.address.repository;

import com.ePallika.sample.address.model.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long>{
	
}
