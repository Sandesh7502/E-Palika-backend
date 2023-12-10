package com.ePallika.sample.address.model.pk.dto;


import com.ePallika.sample.address.model.dto.MunicipalityDto;

public class WardPKDto {
	
	private long id;
	private MunicipalityDto municipality;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public MunicipalityDto getMunicipality() {
		return municipality;
	}
	public void setMunicipality(MunicipalityDto municipality) {
		this.municipality = municipality;
	}
	
	
	
}
