package com.ePallika.sample.address.service.impl;



import com.ePallika.sample.address.model.entity.District;
import com.ePallika.sample.address.model.entity.Municipality;
import com.ePallika.sample.address.model.entity.Province;
import com.ePallika.sample.address.model.pk.DistrictPK;
import com.ePallika.sample.address.repository.MunicipalityRepository;
import com.ePallika.sample.address.service.MunicipalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicipalityServiceImpl implements MunicipalityService {
	
	@Autowired
	private MunicipalityRepository muncipalityRepository;

	@Override
	public List<Municipality> getAll() {
		// TODO Auto-generated method stub
		return muncipalityRepository.findAll();
	}

	@Override
	public Municipality saveMuncipality(Municipality municipality) {
		// TODO Auto-generated method stub
		return muncipalityRepository.save(municipality);
	}

	@Override
	public List<Municipality> getByDistrict(long provinceId, long districtId) {
		
		Province province = new Province();
		province.setId(provinceId);
		
		
		DistrictPK districtPK = new DistrictPK();
		districtPK.setProvince(province);
		districtPK.setId(districtId);
		
		District district = new District();
		district.setDistrictPK(districtPK);
		
		return muncipalityRepository.getByDistrict(district);
	}
	public boolean deleteByMunicipality(long id){
		Municipality municipality = muncipalityRepository.getByMunId(id);
		muncipalityRepository.delete(municipality);
		return true;
	}
	
}
