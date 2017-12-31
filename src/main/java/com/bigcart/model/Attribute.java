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
@Table(name = "oc_attribute")
public class Attribute extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "attribute_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "attribute_group_id")
	private AttributeGroup attributeGroup;
	@Column(name="sort_order")
	private int sortOrder;
	
	@Transient
	private Long attributeGroupId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AttributeGroup getAttributeGroup() {
		return attributeGroup;
	}

	public void setAttributeGroup(AttributeGroup attributeGroup) {
		this.attributeGroup = attributeGroup;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	// Transient properties
	public Long getAttributeGroupId() {
		return attributeGroupId;
	}

	public void setAttributeGroupId(Long attributeGroupId) {
		this.attributeGroupId = attributeGroupId;
		this.setAttributeGroup(new AttributeGroup(attributeGroupId));
	}
}
