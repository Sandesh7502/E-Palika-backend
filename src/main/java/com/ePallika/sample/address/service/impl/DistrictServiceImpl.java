package com.ePallika.sample.address.service.impl;


import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.repository.DistrictRepository;
import com.ePallika.sample.address.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

	@Autowired
	private DistrictRepository districtRepository;

	@Override
	public List<District> getAll() {
		// TODO Auto-generated method stub
		return districtRepository.findAll();
	}

	@Override
	public District saveDistrict(District district) {
		// TODO Auto-generated method stub
		return districtRepository.save(district);
	}

	@Override
	public List<District> getByProvince(long id) {
		
		Province province = new Province();
		province.setId(id);
		
		return districtRepository.getByProvince(province);
	}

	public boolean deleteDistrict(long id){
		District district = districtRepository.getByDistrictId(id);
		districtRepository.delete(district);
		return true;
	}

	
}
