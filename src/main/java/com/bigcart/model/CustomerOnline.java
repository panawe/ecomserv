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
@Table(name = "oc_customer_online")
public class CustomerOnline extends BaseEntity {
	
	@Id
	@Column(name = "ip")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	private String url;
	private String referer;
	
	@Transient
	private Long customerId;
	
	public CustomerOnline() {}
	
	public CustomerOnline(Long id) {
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

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		this.setCustomer(new Customer(customerId));
	}
}
