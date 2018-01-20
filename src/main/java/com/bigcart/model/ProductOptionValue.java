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
@Table(name = "oc_product_option_value")
public class ProductOptionValue extends BaseEntity {
	
	@Id
	@Column(name = "product_option_value_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "product_option_id")
	private ProductOption productOption;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name = "option_id")
	private Option option;
	@ManyToOne
	@JoinColumn(name = "option_value_id")
	private OptionValue optionValue;
	private int quantity;
	private int subtract;
	private BigDecimal price;
	private String pricePrefix;
	private int points;
	private String pointsPrefix;
	private BigDecimal weight;
	private String weightPrefix;
	
		
	@Transient
	private Long productOptionId;
	@Transient
	private Long productId;
	@Transient
	private Long optionId;
	@Transient
	private Long optionValueId;
	
	
	public ProductOptionValue() {}
	public ProductOptionValue(Long id) {
		super();
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	public ProductOption getProductOption() {
		return productOption;
	}
	public void setProductOption(ProductOption productOption) {
		this.productOption = productOption;
	}
	public OptionValue getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(OptionValue optionValue) {
		this.optionValue = optionValue;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSubtract() {
		return subtract;
	}
	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getPricePrefix() {
		return pricePrefix;
	}
	public void setPricePrefix(String pricePrefix) {
		this.pricePrefix = pricePrefix;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getPointsPrefix() {
		return pointsPrefix;
	}
	public void setPointsPrefix(String pointsPrefix) {
		this.pointsPrefix = pointsPrefix;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public String getWeightPrefix() {
		return weightPrefix;
	}
	public void setWeightPrefix(String weightPrefix) {
		this.weightPrefix = weightPrefix;
	}
	
	
	// Transient properties
	public Long getProductOptionId() {
		return productOptionId;
	}
	public void setProductOptionId(Long productOptionId) {
		this.productOptionId = productOptionId;
		this.setProductOption(new ProductOption(productOptionId));
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
		this.setProduct(new Product(productId));
	}
	public Long getOptionId() {
		return optionId;
	}
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
		this.setOption(new Option(optionId));
	}
	public Long getOptionValueId() {
		return optionValueId;
	}
	public void setOptionValueId(Long optionValueId) {
		this.optionValueId = optionValueId;
		this.setOptionValue(new OptionValue(optionValueId));
	}
}
