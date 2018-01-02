package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_coupon_product")
public class CouponProduct extends BaseEntity {
	
	@Id
	@Column(name = "coupon_product_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "coupon_id")
	private Coupon coupon;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@Transient
	private Long couponId;
	@Transient
	private Long productId;
	
	public CouponProduct() {}
	
	public CouponProduct(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
		this.setCoupon(new Coupon(couponId));
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		this.setProduct(new Product(productId));
	}
	

}
