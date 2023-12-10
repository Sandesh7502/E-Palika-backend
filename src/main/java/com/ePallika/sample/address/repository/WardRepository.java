package com.ePallika.sample.address.repository;


import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.entity.Ward;
import com.ePallika.sample.address.model.pk.WardPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WardRepository extends JpaRepository<Ward, WardPK>{

	@Query("select w from Ward w where w.wardPK.municipality = :municipality")
	List<Ward> getByMunicipality(@Param("municipality") Municipality municipality);

	@Query("select w from Ward w where w.wardPK.id=:id")
	Ward getById(@Param("id") long id);
	
}
