package com.ePallika.sample.address.model.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;


import java.util.Set;

@Entity
public class Province extends DefaultEntityModel {

	private String name;

	private String nameNep;

	@OneToMany(mappedBy = "districtPK.province")
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	private Set<District> districts;

	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<District> getDistricts() {
		return districts;
	}

	public void setDistricts(Set<District> districts) {
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameNep() {
		return nameNep;
	}

	public void setNameNep(String nameNep) {
		this.nameNep = nameNep;
	}

}
