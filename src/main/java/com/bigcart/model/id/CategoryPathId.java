package com.bigcart.model.id;

import java.io.Serializable;

public class CategoryPathId implements Serializable {

	private Long categoryId;
	private Long pathId;
	
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getPathId() {
		return pathId;
	}
	public void setPathId(Long pathId) {
		this.pathId = pathId;
	}
	
}
