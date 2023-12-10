package com.ePallika.sample.address.service;


import com.ePallika.sample.address.model.entity.Municipality;

import java.util.List;

public interface MunicipalityService {
	List<Municipality> getAll();
	
	Municipality saveMuncipality(Municipality municipality);
	
	List<Municipality> getByDistrict(long provinceId, long districtId);
	boolean deleteByMunicipality(long id);
}
