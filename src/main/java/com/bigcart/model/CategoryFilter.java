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
import com.bigcart.model.id.CategoryDescriptionId;
import com.bigcart.model.id.CategoryFilterId;

//@Entity
//@Table(name = "oc_category_filter")
//@IdClass(CategoryFilterId.class)
public class CategoryFilter extends BaseEntity {
	
	@Id
	@Column(name = "category_id")
	private Long categoryId;
	@Id
	@Column(name = "filter_id")
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
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
