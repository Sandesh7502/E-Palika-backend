package com.ePallika.sample.address.model.entity;


import com.ePallika.sample.address.model.pk.MunicipalityPK;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;


import java.util.Set;

@Entity
public class Municipality {

	@EmbeddedId
	private MunicipalityPK municipalityPK;

	private String name;

	private String nameNep;

	@OneToMany(mappedBy = "wardPK.municipality")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Set<Ward> wards;

	public MunicipalityPK getMunicipalityPK() {
		return municipalityPK;
	}

	public void setMunicipalityPK(MunicipalityPK municipalityPK) {
		this.municipalityPK = municipalityPK;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Ward> getWards() {
		return wards;
	}

	public void setWards(Set<Ward> wards) {
		this.wards = wards;
	}

	public String getNameNep() {
		return nameNep;
	}

	public void setNameNep(String nameNep) {
		this.nameNep = nameNep;
	}

}
