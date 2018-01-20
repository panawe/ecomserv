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
@Table(name = "oc_order_recurring")
public class OrderRecurring extends BaseEntity {
	
	@Id
	@Column(name = "order_recurring_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	private String referencee;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "product_quantity")
	private int productQuantity;
	@ManyToOne
	@JoinColumn(name = "recurring_id")
	private Recurring recurring;
	@Column(name = "recurring_name")
	private String recurringName;
	@Column(name = "recurring_description")
	private String recurringDescription;
	@Column(name = "recurring_frequency")
	private String recurringFrequency;
	@Column(name = "recurring_cycle")
	private int recurringCycle;
	@Column(name = "recurring_duration")
	private int recuringDuration;
	@Column(name = "recurring_price")
	private BigDecimal recurringPrice;
	private int trial;
	@Column(name = "trial_frequency")
	private String trialFrequency;
	@Column(name = "trial_cycle")
	private int trialCycle;
	@Column(name = "trial_duration")
	private int trialDuration;
	@Column(name = "trial_price")
	private BigDecimal trialPrice;
	private int status;

	@Transient
	private Long orderId;
	@Transient
	private Long productId;
	@Transient
	private Long recurringId;
	
	
	public OrderRecurring(){}
	public OrderRecurring(Long id) {
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getReferencee() {
		return referencee;
	}
	public void setReferencee(String referencee) {
		this.referencee = referencee;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Recurring getRecurring() {
		return recurring;
	}
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}
	public String getRecurringName() {
		return recurringName;
	}
	public void setRecurringName(String recurringName) {
		this.recurringName = recurringName;
	}
	public String getRecurringDescription() {
		return recurringDescription;
	}
	public void setRecurringDescription(String recurringDescription) {
		this.recurringDescription = recurringDescription;
	}
	public String getRecurringFrequency() {
		return recurringFrequency;
	}
	public void setRecurringFrequency(String recurringFrequency) {
		this.recurringFrequency = recurringFrequency;
	}
	public int getRecurringCycle() {
		return recurringCycle;
	}
	public void setRecurringCycle(int recurringCycle) {
		this.recurringCycle = recurringCycle;
	}
	public int getRecuringDuration() {
		return recuringDuration;
	}
	public void setRecuringDuration(int recuringDuration) {
		this.recuringDuration = recuringDuration;
	}
	public BigDecimal getRecurringPrice() {
		return recurringPrice;
	}
	public void setRecurringPrice(BigDecimal recurringPrice) {
		this.recurringPrice = recurringPrice;
	}
	public int getTrial() {
		return trial;
	}
	public void setTrial(int trial) {
		this.trial = trial;
	}
	public String getTrialFrequency() {
		return trialFrequency;
	}
	public void setTrialFrequency(String trialFrequency) {
		this.trialFrequency = trialFrequency;
	}
	public int getTrialCycle() {
		return trialCycle;
	}
	public void setTrialCycle(int trialCycle) {
		this.trialCycle = trialCycle;
	}
	public int getTrialDuration() {
		return trialDuration;
	}
	public void setTrialDuration(int trialDuration) {
		this.trialDuration = trialDuration;
	}
	public BigDecimal getTrialPrice() {
		return trialPrice;
	}
	public void setTrialPrice(BigDecimal trialPrice) {
		this.trialPrice = trialPrice;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Long getRecurringId() {
		return recurringId;
	}
	public void setRecurringId(Long recurringId) {
		this.recurringId = recurringId;
		this.setRecurring(new Recurring(recurringId));
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		this.setOrder(new Order(orderId));
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
		this.setProduct(new Product(productId));
	}
}
