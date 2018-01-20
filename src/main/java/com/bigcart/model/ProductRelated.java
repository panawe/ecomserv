package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "oc_product_related")
public class ProductRelated extends BaseEntity {
	
	@Id
	@Column(name = "product_related_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "related_id")
	private Product related;
	
	
	@Transient
	private Long productId;
	@Transient
	private Long relatedId;
	
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
	public Product getRelated() {
		return related;
	}
	public void setRelated(Product related) {
		this.related = related;
	}
	
	
	
	public Long getRelatedId() {
		return relatedId;
	}
	public void setRelatedId(Long relatedId) {
		this.relatedId = relatedId;
		this.setRelated(new Product(relatedId));
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
		this.setProduct(new Product(productId));
	}
}
