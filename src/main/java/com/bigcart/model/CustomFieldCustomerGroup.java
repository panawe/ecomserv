package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_custom_field_customer_group")
public class CustomFieldCustomerGroup extends BaseEntity {
	
	@Id
	@Column(name = "custom_fld_customer_group_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "custom_field_id")
	private CustomField customField;
	@ManyToOne
	@JoinColumn(name = "customer_group_id")
	private CustomerGroup customerGroup;
	private int required;
		
	@Transient
	private Long customFieldId;
	@Transient
	private Long customerGroupId;
	
	public CustomFieldCustomerGroup() {}
	
	public CustomFieldCustomerGroup(Long id) {
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

	public CustomerGroup getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}

	public int getRequired() {
		return required;
	}

	public void setRequired(int required) {
		this.required = required;
	}

	public Long getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Long customFieldId) {
		this.customFieldId = customFieldId;
		this.setCustomField(new CustomField(customFieldId));
	}

	public Long getCustomerGroupId() {
		return customerGroupId;
	}

	public void setCustomerGroupId(Long customerGroupId) {
		this.customerGroupId = customerGroupId;
		this.setCustomerGroup(new CustomerGroup(customerGroupId));
	}
}
