package com.bigcart.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oc_coupon")
public class Coupon extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "coupon_id")
	private Long id;
	private String name;
	private String code;
	private String type;
	private BigDecimal discount;
	private int logged;
	private int shipping;
	private BigDecimal total;
	@Column(name = "date_start")
	private Date startDate;
	@Column(name = "date_end")
	private Date endDate;
	@Column(name = "uses_total")
	private int usesTotal;
	@Column(name = "uses_customer")
	private String usesCustomer;
	private int status;
	
	public Coupon() {}
	
	public Coupon(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public int getLogged() {
		return logged;
	}

	public void setLogged(int logged) {
		this.logged = logged;
	}

	public int getShipping() {
		return shipping;
	}

	public void setShipping(int shipping) {
		this.shipping = shipping;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getUsesTotal() {
		return usesTotal;
	}

	public void setUsesTotal(int usesTotal) {
		this.usesTotal = usesTotal;
	}

	public String getUsesCustomer() {
		return usesCustomer;
	}

	public void setUsesCustomer(String usesCustomer) {
		this.usesCustomer = usesCustomer;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
