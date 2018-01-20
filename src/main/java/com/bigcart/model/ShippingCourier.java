package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oc_shipping_courier")
public class ShippingCourier extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "shipping_courier_id")
	private Long id;
	private String shippingCourierCode;
	private String shippingCourierName;
	

	public ShippingCourier() {}
	public ShippingCourier(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShippingCourierCode() {
		return shippingCourierCode;
	}
	public void setShippingCourierCode(String shippingCourierCode) {
		this.shippingCourierCode = shippingCourierCode;
	}
	public String getShippingCourierName() {
		return shippingCourierName;
	}
	public void setShippingCourierName(String shippingCourierName) {
		this.shippingCourierName = shippingCourierName;
	}

}
