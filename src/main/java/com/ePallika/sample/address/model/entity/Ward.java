package com.ePallika.sample.address.model.entity;


import com.ePallika.sample.address.model.pk.WardPK;
import com.ePallika.sample.user.model.entity.UserAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Ward  {

	@EmbeddedId
	private WardPK wardPK;

	private String name;

	private String nameNep;

	@OneToMany(mappedBy = "ward")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Set<UserAddress> addresses;


	public WardPK getWardPK() {
		return wardPK;
	}

	public void setWardPK(WardPK wardPK) {
		this.wardPK = wardPK;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<UserAddress> addresses) {
		this.addresses = addresses;
	}

	//	public Set<AddressPerma> getAddressPerma() {
//		return addressPerma;
//	}
//
//	public void setAddressPerma(Set<AddressPerma> addressPerma) {
//		this.addressPerma = addressPerma;
//	}
//
//	public Set<AddressPermaLog> getAddressPermaLog() {
//		return addressPermaLog;
//	}
//
//	public void setAddressPermaLog(Set<AddressPermaLog> addressPermaLog) {
//		this.addressPermaLog = addressPermaLog;
//	}

	public String getNameNep() {
		return nameNep;
	}

	public void setNameNep(String nameNep) {
		this.nameNep = nameNep;
	}

}
