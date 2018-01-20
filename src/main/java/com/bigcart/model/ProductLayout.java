package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "oc_product_layout")
public class ProductLayout extends BaseEntity {
	
	@Id
	@Column(name = "product_layout_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_store_id")
	private ProductStore productStore;	
	@ManyToOne
	@JoinColumn(name = "layout_id")
	private Layout layout;	
	
	@Transient
	private Long productStoreId;
	@Transient
	private Long layoutId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ProductStore getProductStore() {
		return productStore;
	}
	public void setProductStore(ProductStore productStore) {
		this.productStore = productStore;
	}
	public Layout getLayout() {
		return layout;
	}
	public void setLayout(Layout layout) {
		this.layout = layout;
	}
	
	
	
	public Long getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(Long productStoreId) {
		this.productStoreId = productStoreId;
		this.setProductStore(new ProductStore(productStoreId));
	}
	public Long getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
		this.setLayout(new Layout(layoutId));
	}

}
