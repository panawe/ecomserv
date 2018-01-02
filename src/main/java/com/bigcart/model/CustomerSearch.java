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
@Table(name = "oc_customer_search")
public class CustomerSearch extends BaseEntity {
	
	@Id
	@Column(name = "customer_search_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	private String keyword;
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	@Column(name = "sub_category")
	private int subCategory;
	private String description;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	private String ip;
	
	
	@Transient
	private Long storeId;
	@Transient
	private Long languageId;
	@Transient
	private Long customerId;
	@Transient
	private Long categoryId;
	@Transient
	private Long productId;

	
	public CustomerSearch() {}
	
	public CustomerSearch(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(int subCategory) {
		this.subCategory = subCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		this.setStore(new Store(storeId));
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		this.setCustomer(new Customer(customerId));
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		this.setCategory(new Category(categoryId));
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		this.setProduct(new Product(productId));
	}

}
