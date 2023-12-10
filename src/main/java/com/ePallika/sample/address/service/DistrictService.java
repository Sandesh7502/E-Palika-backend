package com.ePallika.sample.address.service;



import com.ePallika.sample.address.model.entity.District;

import java.util.List;

public interface DistrictService {
	
	List<District> getAll();
	
	District saveDistrict(District district);
	
	List<District> getByProvince(long id);
	boolean deleteDistrict(long id);
	
}
