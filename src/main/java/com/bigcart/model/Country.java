package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_country")
public class Country extends BaseEntity {
	
	@Id
	@Column(name = "country_id")
	@GeneratedValue
	private Long id;
	@Column(name = "iso_code_2")
	private String isoCode2;
	@Column(name = "iso_code_3")
	private String isoCode3;
	@Column(name = "address_format")
	private String addressFormat;
	@Column(name = "postcode_required")
	private String postcodeRequired;
	private int status;
	
	public Country() {}
	
	public Country(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsoCode2() {
		return isoCode2;
	}
	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}
	public String getIsoCode3() {
		return isoCode3;
	}
	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}
	public String getAddressFormat() {
		return addressFormat;
	}
	public void setAddressFormat(String addressFormat) {
		this.addressFormat = addressFormat;
	}
	public String getPostcodeRequired() {
		return postcodeRequired;
	}
	public void setPostcodeRequired(String postcodeRequired) {
		this.postcodeRequired = postcodeRequired;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
