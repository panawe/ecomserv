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
@Table(name = "oc_order_option")
public class OrderOption extends BaseEntity {
	
	@Id
	@Column(name = "order_option_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	@ManyToOne
	@JoinColumn(name = "order_product_id")
	private OrderProduct orderProduct;
	@ManyToOne
	@JoinColumn(name = "product_option_id")
	private ProductOption productOption;
	@ManyToOne
	@JoinColumn(name = "product_option_value_id")
	private ProductOptionValue productOptionValue;

	private String name;
	private String value;
	private String type;
		
	@Transient
	private Long orderId;
	@Transient
	private Long orderProductId;
	@Transient
	private Long productOptionId;
	@Transient
	private Long productOptionValueId;
	
	
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
	public OrderProduct getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}
	public ProductOption getProductOption() {
		return productOption;
	}
	public void setProductOption(ProductOption productOption) {
		this.productOption = productOption;
	}
	public ProductOptionValue getProductOptionValue() {
		return productOptionValue;
	}
	public void setProductOptionValue(ProductOptionValue productOptionValue) {
		this.productOptionValue = productOptionValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	// Transient properties
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		this.setOrder(new Order(orderId));
	}
	public Long getOrderProductId() {
		return orderProductId;
	}
	public void setOrderProductId(Long orderProductId) {
		this.orderProductId = orderProductId;
		this.setOrderProduct(new OrderProduct(orderProductId));
	}
	public Long getProductOptionId() {
		return productOptionId;
	}
	public void setProductOptionId(Long productOptionId) {
		this.productOptionId = productOptionId;
		this.setProductOption(new ProductOption(productOptionId));
	}
	public Long getProductOptionValueId() {
		return productOptionValueId;
	}
	public void setProductOptionValueId(Long productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
		this.setProductOptionValue(new ProductOptionValue());
	}
}
