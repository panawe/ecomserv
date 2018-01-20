package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oc_voucher_theme")
public class VoucherTheme extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "voucher_theme_id")
	private Long id;
	private String image;
	
	
	public VoucherTheme() {}
	public VoucherTheme(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
