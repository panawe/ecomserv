package com.bigcart.model.id;

import java.io.Serializable;

public class CategoryStoreId implements Serializable {

	private Long categoryId;
	private Long storeId;
	
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
}
