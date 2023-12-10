package com.ePallika.sample.address.model.pk.dto;


import com.ePallika.sample.address.model.dto.DistrictDto;

public class MunicipalityPKDto {
	
	private long id;
	private DistrictDto district;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public DistrictDto getDistrict() {
		return district;
	}
	public void setDistrict(DistrictDto district) {
		this.district = district;
	}

	
	
}
