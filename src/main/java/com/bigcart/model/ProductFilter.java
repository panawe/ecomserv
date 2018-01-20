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
@Table(name = "oc_product_filter")
public class ProductFilter extends BaseEntity {
	
	@Id
	@Column(name = "product_filter_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "filter_id")
	private Filter filter;
	
	@Transient
	private Long produtId;
	@Transient
	private Long filterId;

	
	
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
	public Filter getFilter() {
		return filter;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
	public Long getProdutId() {
		return produtId;
	}
	public void setProdutId(Long produtId) {
		this.produtId = produtId;
		this.setProduct(new Product(produtId));
	}
	public Long getFilterId() {
		return filterId;
	}
	public void setFilterId(Long filterId) {
		this.filterId = filterId;
		this.setFilter(new Filter(filterId));
	}
}
