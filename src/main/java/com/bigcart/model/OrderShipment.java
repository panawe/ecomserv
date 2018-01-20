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
@Table(name = "oc_order_shipment")
public class OrderShipment extends BaseEntity {
	
	@Id
	@Column(name = "order_shipment_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	@ManyToOne
	@JoinColumn(name = "shipping_courier_id")
	private ShippingCourier shippingCourier;
	@Column(name = "tracking_number")
	private String trackingNumber;

	@Transient
	private Long orderId;
	@Transient
	private Long shippingCourierId;
	
	
	public OrderShipment(){}
	public OrderShipment(Long id) {
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
	public ShippingCourier getShippingCourier() {
		return shippingCourier;
	}
	public void setShippingCourier(ShippingCourier shippingCourier) {
		this.shippingCourier = shippingCourier;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		this.setOrder(new Order(orderId));
	}
	public Long getShippingCourierId() {
		return shippingCourierId;
	}
	public void setShippingCourierId(Long shippingCourierId) {
		this.shippingCourierId = shippingCourierId;
		this.setShippingCourier(new ShippingCourier(shippingCourierId));
	}
	
}
