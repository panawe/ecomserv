package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oc_manufacturer_to_store")
public class ManufacturerStore extends BaseEntity {
	
	@Id
	@Column(name = "manufacturer_store_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
    @JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer;
	@Id
	@ManyToOne
    @JoinColumn(name = "store_id")
	private Store store;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}

}
