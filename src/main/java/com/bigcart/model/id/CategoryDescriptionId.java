package com.bigcart.model.id;

import java.io.Serializable;

public class CategoryDescriptionId implements Serializable {

	private Long categoryId;
	private Long languageId;
	
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	
	
}
