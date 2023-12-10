package com.ePallika.sample.address.service;



import com.ePallika.sample.address.model.entity.Province;

import java.util.List;

public interface ProvinceService {
	List<Province> getAll();
	
	Province saveProvince(Province province);
	boolean deleteById(long id);
}
