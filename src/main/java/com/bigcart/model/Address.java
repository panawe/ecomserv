package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_address")
public class Address extends BaseEntity {
	
	@Id
	@Column(name = "address_id")
	@GeneratedValue
	private Long id;
	@Column(name = "customer_id")
	private Long customerId;
	private String firstName;
	private String lastName;
	private String company;
	@Column(name = "address_1")
	private String addess1;
	@Column(name = "address_2")
	private String address2;
	private String city;
	private String postcode;
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	@ManyToOne
	@JoinColumn(name = "zone_id")
	private Zone zone;
	private String customfield;
	
	@Transient
	private Long countryId;
	@Transient
	private Long zoneId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddess1() {
		return addess1;
	}
	public void setAddess1(String addess1) {
		this.addess1 = addess1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public String getCustomfield() {
		return customfield;
	}
	public void setCustomfield(String customfield) {
		this.customfield = customfield;
	}
	
	
	// Transient properties
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
		this.setCountry(new Country(countryId));
	}
	public Long getZoneId() {
		return zoneId;
	}
	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
		this.setZone(new Zone(zoneId));
	}
	
	
}
