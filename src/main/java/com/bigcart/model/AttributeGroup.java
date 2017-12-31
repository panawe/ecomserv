package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oc_attribute_group")
public class AttributeGroup extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "attribute_group_id")
	private Long id;
	@Column(name="sort_order")
	private int sortOrder;
	
	public AttributeGroup() {}
	
	public AttributeGroup(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
}
