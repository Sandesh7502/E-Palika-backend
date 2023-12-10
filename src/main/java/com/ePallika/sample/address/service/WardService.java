package com.ePallika.sample.address.service;



import com.ePallika.sample.address.model.entity.Ward;

import java.util.List;

public interface WardService {
	List<Ward> getAll();
	
	Ward saveWard(Ward ward);
	
	List<Ward> getByMunicipality(long provinceId, long districtId, long municipalityId);
	boolean deleteById(long id);
}
