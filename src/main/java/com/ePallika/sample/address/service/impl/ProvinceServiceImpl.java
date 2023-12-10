package com.ePallika.sample.address.service.impl;


import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.repository.ProvinceRepository;
import com.ePallika.sample.address.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
	
	@Autowired
	private ProvinceRepository provinceRepository;

	@Override
	public List<Province> getAll() {
		// TODO Auto-generated method stub
		return provinceRepository.findAll();
	}

	@Override
	public Province saveProvince(Province province) {
		// TODO Auto-generated method stub
		return provinceRepository.save(province);
	}

	@Override
	public boolean deleteById(long id){
		 provinceRepository.deleteById(id);
		 return true;
	}
	
}
