package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.bigcart.model.id.CategoryPathId;

@Entity
@Table(name = "oc_category_pathr")
@IdClass(CategoryPathId.class)
public class CategoryPath extends BaseEntity {
	
	@Id
	@Column(name = "category_id")
	private Long categoryId;
	@Id
	@Column(name = "path_id")
	private Long pathId;
	private String level;
	
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
