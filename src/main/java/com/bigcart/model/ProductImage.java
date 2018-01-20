package com.bigcart.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "oc_product_image")
public class ProductImage extends BaseEntity {
	
	@Id
	@Column(name = "product_image_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	private String image;
	@Column(name = "sort_order")
	private int sortOrder;
	
	@Transient
	private Long produtId;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	
	
	
	public Long getProdutId() {
		return produtId;
	}
	public void setProdutId(Long produtId) {
		this.produtId = produtId;
		this.setProduct(new Product(produtId));
	}

}
