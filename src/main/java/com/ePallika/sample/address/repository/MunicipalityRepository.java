package com.ePallika.sample.address.repository;

import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.pk.MunicipalityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, MunicipalityPK> {

	@Query("select m from Municipality m where m.municipalityPK.district = :district")
	List<Municipality> getByDistrict(@Param("district") District district);

	@Query("select m from Municipality m where m.municipalityPK.id=:mId")
	Municipality getByMunId(@Param("mId") long id);

	@Query("select m from Municipality m where m.municipalityPK=:mId")
	Municipality getByMunicipalityPk(@Param("mId") MunicipalityPK id);

}
