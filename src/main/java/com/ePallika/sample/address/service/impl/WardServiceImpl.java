package com.ePallika.sample.address.service.impl;


import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.model.entity.Ward;
import com.ePallika.sample.address.model.pk.DistrictPK;
import com.ePallika.sample.address.model.pk.MunicipalityPK;
import com.ePallika.sample.address.repository.WardRepository;
import com.ePallika.sample.address.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardServiceImpl implements WardService {

	@Autowired
	private WardRepository wardRepository;
	
	@Override
	public List<Ward> getAll() {
		// TODO Auto-generated method stub
		return wardRepository.findAll();
		
	}

	@Override
	public Ward saveWard(Ward ward) {
		// TODO Auto-generated method stub
		return wardRepository.save(ward);
	}

	@Override
	public List<Ward> getByMunicipality(long provinceId, long districtId, long municipalityId) {
		Province province = new Province();
		province.setId(provinceId);
		
		
		DistrictPK districtPK = new DistrictPK();
		districtPK.setProvince(province);
		districtPK.setId(districtId);
		
		District district = new District();
		district.setDistrictPK(districtPK);
		
		MunicipalityPK municipalityPK = new MunicipalityPK();
		municipalityPK.setDistrict(district);
		municipalityPK.setId(municipalityId);
		
		Municipality municipality = new Municipality();
		municipality.setMunicipalityPK(municipalityPK);
		
		return wardRepository.getByMunicipality(municipality);
	}

	@Override
	public boolean deleteById(long id){
		wardRepository.delete(wardRepository.getById(id));
		return true;
	}

}
