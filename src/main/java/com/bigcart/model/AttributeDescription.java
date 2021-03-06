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

@Entity
@Table(name = "oc_attribute_description")
public class AttributeDescription extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "attribute_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "attribute_id")
	private Attribute attribute;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	
	@Transient
	private Long attributeId;
	@Transient
	private Long languageId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Attribute getAttribute() {
		return attribute;
	}
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
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
	
	
	// Transient properties
	public Long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
		this.setAttribute(new Attribute(attributeId));
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}

	
}
