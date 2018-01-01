package com.bigcart.model.id;

import java.io.Serializable;

public class CouponCategoryId implements Serializable {

	private Long couponId;
	private Long categoryId;
	
	
	public Long getCouponId() {
		return couponId;
	}
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
}
