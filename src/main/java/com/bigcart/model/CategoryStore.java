package com.bigcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.bigcart.model.id.CategoryStoreId;

@Entity
@Table(name = "oc_category_to_store")
@IdClass(CategoryStoreId.class)
public class CategoryStore extends BaseEntity {
	
	@Id
	@ManyToOne
    @JoinColumn(name = "category_id")
	private Category category;
	@Id
	@ManyToOne
    @JoinColumn(name = "store_id")
	private Store store;
	
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



	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
