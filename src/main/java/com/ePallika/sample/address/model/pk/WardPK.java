package com.ePallika.sample.address.model.pk;


import com.ePallika.sample.address.model.entity.Municipality;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class WardPK implements Serializable {

	private long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name = "municipality_id", referencedColumnName = "id"),
		@JoinColumn(name = "district_id", referencedColumnName = "district_id"),
		@JoinColumn(name = "province_id", referencedColumnName = "province_id")
	})
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Municipality municipality;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Municipality getMunicipality() {
		return municipality;
	}

	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}
}
