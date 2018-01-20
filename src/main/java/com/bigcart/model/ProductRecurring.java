package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "oc_product_recurring")
public class ProductRecurring extends BaseEntity {
	
	@Id
	@Column(name = "product_recurring_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "recurring_id")
	private Recurring recurring;
	@ManyToOne
	@JoinColumn(name = "customer_group_id")
	private CustomerGroup customerGroup;
	
	
	@Transient
	private Long productId;
	@Transient
	private Long recurringId;
	@Transient
	private Long customerGroupId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public CustomerGroup getCustomerGroup() {
		return customerGroup;
	}
	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
		this.setCustomerGroup(new CustomerGroup(customerGroupId));
	}
	public Recurring getRecurring() {
		return recurring;
	}
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}
	public Long getCustomerGroupId() {
		return customerGroupId;
	}
	public void setCustomerGroupId(Long customerGroupId) {
		this.customerGroupId = customerGroupId;
	}
	public Long getRecurringId() {
		return recurringId;
	}
	public void setRecurringId(Long recurringId) {
		this.recurringId = recurringId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
		this.setProduct(new Product(productId));
	}
}
