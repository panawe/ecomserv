package com.bigcart.model.id;

import java.io.Serializable;

public class AttributeDescriptionId implements Serializable {

	private Long attributeId;
	private Long languageId;
	
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
	
	
}
