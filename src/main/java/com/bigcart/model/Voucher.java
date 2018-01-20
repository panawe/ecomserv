package com.bigcart.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_voucher")
public class Voucher extends BaseEntity {
	
	@Id
	@Column(name = "voucher_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	private String code;
	private String fromName;
	private String fromEmail;
	private String toName;
	private String toEmail;
	@ManyToOne
	@JoinColumn(name = "voucher_theme_id")
	private VoucherTheme voucherTheme;
	private String message;
	private BigDecimal amount;
	private int status;
	
	@Transient
	private Long orderId;
	@Transient
	private Long voucherThemeId;
	
	
	public Voucher() {}
	public Voucher(Long id) {
		super();
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public VoucherTheme getVoucherTheme() {
		return voucherTheme;
	}
	public void setVoucherTheme(VoucherTheme voucherTheme) {
		this.voucherTheme = voucherTheme;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		this.setOrder(new Order(orderId));
	}
	public Long getVoucherThemeId() {
		return voucherThemeId;
	}
	public void setVoucherThemeId(Long voucherThemeId) {
		this.voucherThemeId = voucherThemeId;
		this.setVoucherTheme(new VoucherTheme(voucherThemeId));
	}
	
}
