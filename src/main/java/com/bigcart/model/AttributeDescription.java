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
@IdClass(AttributeDescriptionId.class)
public class AttributeDescription extends BaseEntity {
	
	@Id
	@Column(name = "attribute_id")
	private Long attributeId;
	@Id
	@Column(name = "language_id")
	private Long languageId;
	private String name;
	
	
	public Long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
