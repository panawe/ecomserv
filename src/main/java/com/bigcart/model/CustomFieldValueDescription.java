package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_custom_field_value_description")
public class CustomFieldValueDescription extends BaseEntity {
	
	@Id
	@Column(name = "custom_f_value_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "custom_field_value_id")
	private CustomFieldValue customFieldValue;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	@ManyToOne
	@JoinColumn(name = "custom_field_id")
	private CustomField customField;
	private String name;
		
	@Transient
	private Long customFieldId;
	@Transient
	private Long languageId;
	@Transient
	private Long customFieldValueId;
	
	
	public CustomFieldValueDescription() {}
	
	public CustomFieldValueDescription(Long id) {
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

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public CustomFieldValue getCustomFieldValue() {
		return customFieldValue;
	}

	public void setCustomFieldValue(CustomFieldValue customFieldValue) {
		this.customFieldValue = customFieldValue;
	}

	public Long getCustomFieldValueId() {
		return customFieldValueId;
	}

	public void setCustomFieldValueId(Long customFieldValueId) {
		this.customFieldValueId = customFieldValueId;
		this.setCustomFieldValue(new CustomFieldValue(customFieldValueId));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}

	public Long getCustomFieldId() {
		return customFieldId;
	}

	public void setCustomFieldId(Long customFieldId) {
		this.customFieldId = customFieldId;
		this.setCustomField(new CustomField(customFieldId));
	}

	
}
