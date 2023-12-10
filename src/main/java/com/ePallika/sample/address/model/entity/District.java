package com.ePallika.sample.address.model.entity;


import com.ePallika.sample.address.model.pk.DistrictPK;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class District{

	@EmbeddedId
	private DistrictPK districtPK;

	private String name;

	private String nameNep;

	@OneToMany(mappedBy = "municipalityPK.district")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Set<Municipality> municipalities;

	public DistrictPK getDistrictPK() {
		return districtPK;
	}

	public void setDistrictPK(DistrictPK districtPK) {
		this.districtPK = districtPK;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Municipality> getMunicipalities() {
		return municipalities;
	}

	public void setMunicipalities(Set<Municipality> municipalities) {
		this.municipalities = municipalities;
	}

	public String getNameNep() {
		return nameNep;
	}

	public void setNameNep(String nameNep) {
		this.nameNep = nameNep;
	}

}
