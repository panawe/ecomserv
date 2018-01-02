package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_customer_activity")
public class CustomerActivity extends BaseEntity {
	
	@Id
	@Column(name = "customer_activity_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	private int akey;
	private String data;
	private String ip;
		
	@Transient
	private Long customerId;
	
	public CustomerActivity() {}
	
	public CustomerActivity(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAkey() {
		return akey;
	}

	public void setAkey(int akey) {
		this.akey = akey;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		this.setCustomer(new Customer(customerId));
	}

}
