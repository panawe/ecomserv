package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_custom_field_value")
public class CustomFieldValue extends BaseEntity {
	
	@Id
	@Column(name = "custom_field_value_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "custom_field_id")
	private CustomField customField;
	@Column(name = "sort_order")
	private int sortOrder;
		
	@Transient
	private Long customFieldId;
	
	public CustomFieldValue() {}
	
	public CustomFieldValue(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomField getCustomField() {
		return customField;
	}

	public void setCustomField(CustomField customField) {
		this.customField = customField;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Long customFieldId) {
		this.customFieldId = customFieldId;
		this.setCustomField(new CustomField(customFieldId));
	}

	
}
