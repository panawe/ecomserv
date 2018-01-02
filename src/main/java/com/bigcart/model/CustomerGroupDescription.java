package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bigcart.model.id.AttributeDescriptionId;
import com.bigcart.model.id.AttributeGroupDescriptionId;

@Entity
@Table(name = "oc_customer_group_description")
public class CustomerGroupDescription extends BaseEntity {
	
	@Id
	@Column(name = "customer_group_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "customer_group_id")
	private CustomerGroup customerGroup;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	private String description;
	
	@Transient
	private Long customerGroupId;
	@Transient
	private Long languageId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CustomerGroup getCustomerGroup() {
		return customerGroup;
	}
	public void setCustomerGroup(CustomerGroup customerGroup) {
		this.customerGroup = customerGroup;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Transient properties
	public Long getCustomerGroupId() {
		return customerGroupId;
	}
	public void setCustomerGroupId(Long customerGroupId) {
		this.customerGroupId = customerGroupId;
		this.setCustomerGroup(new CustomerGroup(customerGroupId));
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
