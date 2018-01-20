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
@Table(name = "oc_order_recurring_transaction")
public class OrderRecurringTransaction extends BaseEntity {
	
	@Id
	@Column(name = "order_recurring_transaction_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_recurring_id")
	private OrderRecurring orderRecurring;
	private String referencee;
	private String type;
	private BigDecimal amount;
	
	
	@Transient
	private Long orderRecurringId;
	
	
	public OrderRecurringTransaction(){}
	public OrderRecurringTransaction(Long id) {
		super();
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public OrderRecurring getOrderRecurring() {
		return orderRecurring;
	}
	public void setOrderRecurring(OrderRecurring orderRecurring) {
		this.orderRecurring = orderRecurring;
	}
	public String getReferencee() {
		return referencee;
	}
	public void setReferencee(String referencee) {
		this.referencee = referencee;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	
	public Long getOrderRecurringId() {
		return orderRecurringId;
	}
	public void setOrderRecurringId(Long orderRecurringId) {
		this.orderRecurringId = orderRecurringId;
		this.setOrderRecurring(new OrderRecurring(orderRecurringId));
	}

}
