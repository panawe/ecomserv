package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.bigcart.model.id.CategoryStoreId;

@Entity
@Table(name = "oc_category_to_layout")
@IdClass(CategoryStoreId.class)
public class CategoryLayout extends BaseEntity {
	
	@Id
	@ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	@Id
	@ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "id")
	private Store store;
	@Column(name="layout_id")
	private Long layoutId;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Long getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
