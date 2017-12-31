package com.bigcart.model.id;

import java.io.Serializable;

public class AttributeGroupDescriptionId implements Serializable {

	private Long attributeGroupId;
	private Long languageId;
	
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
	
	
}
