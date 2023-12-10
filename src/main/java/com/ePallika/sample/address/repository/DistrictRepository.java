package com.ePallika.sample.address.repository;


import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.model.pk.DistrictPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends JpaRepository<District, DistrictPK>{
	
	@Query("select d from District d where d.districtPK.province = :province")
	List<District> getByProvince(@Param("province") Province province);

	@Query("select d from District d where d.districtPK.id=:Id")
	District getByDistrictId(@Param("Id") long id);

}
