package com.bigcart.model.id;

import java.io.Serializable;

import com.bigcart.model.Category;
import com.bigcart.model.Store;

public class CategoryStoreId implements Serializable {

	private Category category;
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
}
