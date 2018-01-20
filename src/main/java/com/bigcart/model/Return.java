package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "oc_return")
public class Return extends BaseEntity {
	
	@Id
	@Column(name = "return_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_product_id")
	private OrderProduct orderProduct;	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;	
	private int quantity;
	private int opened;
	@ManyToOne
	@JoinColumn(name = "return_reason_id")
	private ReturnReason returnReason;	
	@ManyToOne
	@JoinColumn(name = "return_action_id")
	private ReturnAction returnAction;	
	@ManyToOne
	@JoinColumn(name = "return_status_id")
	private ReturnStatus returnStatus;	
	
	@Transient
	private Long orderProductId;
	@Transient
	private Long customerId;
	@Transient
	private Long returnReasonId;	
	@Transient
	private Long returnActionId;	
	@Transient
	private Long returnStatusId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOpened() {
		return opened;
	}
	public void setOpened(int opened) {
		this.opened = opened;
	}
	public ReturnReason getReturnReason() {
		return returnReason;
	}
	public void setReturnReason(ReturnReason returnReason) {
		this.returnReason = returnReason;
	}
	public ReturnAction getReturnAction() {
		return returnAction;
	}
	public void setReturnAction(ReturnAction returnAction) {
		this.returnAction = returnAction;
	}
	public ReturnStatus getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(ReturnStatus returnStatus) {
		this.returnStatus = returnStatus;
	}
	public OrderProduct getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}
	
	
	
	public Long getOrderProductId() {
		return orderProductId;
	}
	public void setOrderProductId(Long orderProductId) {
		this.orderProductId = orderProductId;
		this.setOrderProduct(new OrderProduct(orderProductId));
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		this.setCustomer(new Customer(customerId));
	}
	public Long getReturnReasonId() {
		return returnReasonId;
	}
	public void setReturnReasonId(Long returnReasonId) {
		this.returnReasonId = returnReasonId;
		this.setReturnReason(new ReturnReason(returnReasonId));
	}
	public Long getReturnActionId() {
		return returnActionId;
	}
	public void setReturnActionId(Long returnActionId) {
		this.returnActionId = returnActionId;
		this.setReturnAction(new ReturnAction(returnActionId));
	}
	public Long getReturnStatusId() {
		return returnStatusId;
	}
	public void setReturnStatusId(Long returnStatusId) {
		this.returnStatusId = returnStatusId;
		this.setReturnStatus(new ReturnStatus(returnStatusId));
	}
}
