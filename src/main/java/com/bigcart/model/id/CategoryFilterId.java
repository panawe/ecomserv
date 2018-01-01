package com.bigcart.model.id;

import java.io.Serializable;

public class CategoryFilterId implements Serializable {

	private Long categoryId;
	private Long filterId;
	
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getFilterId() {
		return filterId;
	}
	public void setFilterId(Long filterId) {
		this.filterId = filterId;
	}
}
