package com.ePallika.sample.address.model.pk;


import com.ePallika.sample.address.model.entity.District;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class MunicipalityPK implements Serializable{
	
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name = "district_id", referencedColumnName = "id"),
		@JoinColumn(name = "province_id", referencedColumnName = "province_id")
	})
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private District district;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}
	
}

