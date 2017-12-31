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
@Table(name = "oc_attribute_group_description")
@IdClass(AttributeGroupDescriptionId.class)
public class AttributeGroupDescription extends BaseEntity {
	
	@Id
	@Column(name = "attribute_group_id")
	private Long attributeGroupId;
	@Id
	@Column(name = "language_id")
	private Long languageId;
	private String name;
	
	
	public Long getAttributeGroupId() {
		return attributeGroupId;
	}
	public void setAttributeGroupId(Long attributeGroupId) {
		this.attributeGroupId = attributeGroupId;
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
