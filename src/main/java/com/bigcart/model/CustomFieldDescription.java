package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_custom_field_description")
public class CustomFieldDescription extends BaseEntity {
	
	@Id
	@Column(name = "custom_field_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "custom_field_id")
	private CustomField customField;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
		
	@Transient
	private Long customFieldId;
	@Transient
	private Long languageId;
	
	public CustomFieldDescription() {}
	
	public CustomFieldDescription(Long id) {
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
