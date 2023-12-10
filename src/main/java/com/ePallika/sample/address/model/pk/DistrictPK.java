package com.ePallika.sample.address.model.pk;


import com.ePallika.sample.address.model.entity.Province;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class DistrictPK implements Serializable {
	
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "province_id", referencedColumnName = "id")
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Province province;
	
	

	public DistrictPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DistrictPK(long id, Province province) {
		super();
		this.id = id;
		this.province = province;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

}
