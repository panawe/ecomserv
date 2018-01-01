package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oc_customer_group")
public class CustomerGroup extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "customer_group_id")
	private Long id;
	private int approval;
	@Column(name="sort_order")
	private int sortOrder;
	
	public CustomerGroup() {}
	
	public CustomerGroup(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getApproval() {
		return approval;
	}

	public void setApproval(int approval) {
		this.approval = approval;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
}
