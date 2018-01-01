package com.bigcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bigcart.model.id.CategoryStoreId;
import com.bigcart.model.id.CouponCategoryId;

@Entity
@Table(name = "oc_coupon_category")
@IdClass(CouponCategoryId.class)
public class CouponCategory extends BaseEntity {
	
	@Id
	@ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
	@Id
	@ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "id")
	private Coupon coupon;
	
	@Transient
	private Long couponId;
	@Transient
	private Long categoryId;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
	
	public Long getCouponId() {
		return couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
		this.setCoupon(new Coupon(couponId));
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		this.setCategory(new Category(categoryId));
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
