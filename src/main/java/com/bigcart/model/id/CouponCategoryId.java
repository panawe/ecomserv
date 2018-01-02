package com.bigcart.model.id;

import java.io.Serializable;

import com.bigcart.model.Category;
import com.bigcart.model.Coupon;

public class CouponCategoryId implements Serializable {

	private Coupon coupon;
	private Category category;
	
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
