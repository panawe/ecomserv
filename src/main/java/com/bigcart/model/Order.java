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
@Table(name = "oc_order")
public class Order extends BaseEntity {
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue
	private Long id;
	@Column(name = "invoice_no")
	private int invoiceNo;
	@Column(name = "invoice_prefix")
	private int invoicePrefix;
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	@Column(name = "store_name")
	private String storeName;
	@Column(name = "store_url")
	private String storeUrl;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "customer_group_id")
	private CustomerGroup CustomerGroup;
	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	private String fax;
	private String customField;
	@Column(name = "payment_firstname")
	private String paymentFirstName;
	@Column(name = "payment_lastname")
	private String paymentLastName;
	@Column(name = "payment_company")
	private String paymentCompany;
	@Column(name = "payment_address_1")
	private String paymentAddress1;
	@Column(name = "payment_address_2")
	private String paymentAddress2;
	@Column(name = "payment_city")
	private String paymentCity;
	@Column(name = "payment_postcode")
	private String paymentPostcode;
	@Column(name = "payment_country")
	private String paymentCountry;
	@Column(name = "payment_country_id")
	private Long paymentCountryId;
	@Column(name = "payment_zone")
	private String paymentZone;
	@Column(name = "payment_zone_id")
	private Long paymentZoneId;
	@Column(name = "payment_address_format")
	private String paymentAddressFormat;
	@Column(name = "payment_custom_field")
	private String paymentCustomField;
	@Column(name = "payment_method")
	private String paymentMethod;
	@Column(name = "payment_code")
	private String paymentCode;
	@Column(name = "shipping_firstname")
	private String shippingFirstName;
	@Column(name = "shipping_lastname")
	private String shippingLastName;
	@Column(name = "shipping_company")
	private String shippingCompany;
	@Column(name = "shipping_address_1")
	private String shippingAddress1;
	@Column(name = "shipping_address_2")
	private String shippingAddress2;
	@Column(name = "shipping_city")
	private String shippingCity;
	@Column(name = "shipping_postcode")
	private String shippingPostcode;
	@Column(name = "shipping_country")
	private String shippingCountry;
	@Column(name = "shipping_country_id")
	private Long shippingCountryId;
	@Column(name = "shipping_zone")
	private String shippingZone;
	@Column(name = "shipping_zone_id")
	private Long shippingZoneId;
	@Column(name = "shipping_address_format")
	private String shippingAddressFormat;
	@Column(name = "shipping_custom_field")
	private String shippingCustomField;
	@Column(name = "shipping_method")
	private String shippingMethod;
	@Column(name = "shipping_code")
	private String shippingCode;
	private String comment;
	private BigDecimal total;
	@ManyToOne
	@JoinColumn(name = "order_status_id")
	private OrderStatus orderStatus;
	@ManyToOne
	@JoinColumn(name = "affiliate_id")
	private CustomerAffiliate affiliate;
	private BigDecimal commission;
	@ManyToOne
	@JoinColumn(name = "marketing_id")
	private Marketing marketing;
	private String tracking;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	@ManyToOne
	@JoinColumn(name = "currency_id")
	private Currency currency;
	@Column(name = "currency_code")
	private String currencyCode;
	@Column(name = "currency_value")
	private BigDecimal currencyValue;
	private String ip;
	@Column(name = "forwarded_ip")
	private String forwardedIp;
	@Column(name = "user_agent")
	private String userAgent;
	@Column(name = "accept_language")
	private String acceptLanguage;
	
	
	// Transient
	@Transient
	private Long storeId;
	@Transient
	private Long customerId;
	@Transient
	private Long customerGroupId;
	@Transient
	private Long orderStatusId;
	@Transient
	private Long affiliateId;
	@Transient
	private Long marketingId;
	@Transient
	private Long languageId;
	@Transient
	private Long currencyId;
	
	public Order() {}
	
	public Order(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public int getInvoicePrefix() {
		return invoicePrefix;
	}

	public void setInvoicePrefix(int invoicePrefix) {
		this.invoicePrefix = invoicePrefix;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreUrl() {
		return storeUrl;
	}

	public void setStoreUrl(String storeUrl) {
		this.storeUrl = storeUrl;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerGroup getCustomerGroup() {
		return CustomerGroup;
	}

	public void setCustomerGroup(CustomerGroup customerGroup) {
		CustomerGroup = customerGroup;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCustomField() {
		return customField;
	}

	public void setCustomField(String customField) {
		this.customField = customField;
	}

	public String getPaymentFirstName() {
		return paymentFirstName;
	}

	public void setPaymentFirstName(String paymentFirstName) {
		this.paymentFirstName = paymentFirstName;
	}

	public String getPaymentLastName() {
		return paymentLastName;
	}

	public void setPaymentLastName(String paymentLastName) {
		this.paymentLastName = paymentLastName;
	}

	public String getPaymentCompany() {
		return paymentCompany;
	}

	public void setPaymentCompany(String paymentCompany) {
		this.paymentCompany = paymentCompany;
	}

	public String getPaymentAddress1() {
		return paymentAddress1;
	}

	public void setPaymentAddress1(String paymentAddress1) {
		this.paymentAddress1 = paymentAddress1;
	}

	public String getPaymentAddress2() {
		return paymentAddress2;
	}

	public void setPaymentAddress2(String paymentAddress2) {
		this.paymentAddress2 = paymentAddress2;
	}

	public String getPaymentCity() {
		return paymentCity;
	}

	public void setPaymentCity(String paymentCity) {
		this.paymentCity = paymentCity;
	}

	public String getPaymentPostcode() {
		return paymentPostcode;
	}

	public void setPaymentPostcode(String paymentPostcode) {
		this.paymentPostcode = paymentPostcode;
	}

	public String getPaymentCountry() {
		return paymentCountry;
	}

	public void setPaymentCountry(String paymentCountry) {
		this.paymentCountry = paymentCountry;
	}

	public Long getPaymentCountryId() {
		return paymentCountryId;
	}

	public void setPaymentCountryId(Long paymentCountryId) {
		this.paymentCountryId = paymentCountryId;
	}

	public String getPaymentZone() {
		return paymentZone;
	}

	public void setPaymentZone(String paymentZone) {
		this.paymentZone = paymentZone;
	}

	public Long getPaymentZoneId() {
		return paymentZoneId;
	}

	public void setPaymentZoneId(Long paymentZoneId) {
		this.paymentZoneId = paymentZoneId;
	}

	public String getPaymentAddressFormat() {
		return paymentAddressFormat;
	}

	public void setPaymentAddressFormat(String paymentAddressFormat) {
		this.paymentAddressFormat = paymentAddressFormat;
	}

	public String getPaymentCustomField() {
		return paymentCustomField;
	}

	public void setPaymentCustomField(String paymentCustomField) {
		this.paymentCustomField = paymentCustomField;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getShippingFirstName() {
		return shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public String getShippingCompany() {
		return shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public String getShippingAddress1() {
		return shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingPostcode() {
		return shippingPostcode;
	}

	public void setShippingPostcode(String shippingPostcode) {
		this.shippingPostcode = shippingPostcode;
	}

	public String getShippingCountry() {
		return shippingCountry;
	}

	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}

	public Long getShippingCountryId() {
		return shippingCountryId;
	}

	public void setShippingCountryId(Long shippingCountryId) {
		this.shippingCountryId = shippingCountryId;
	}

	public String getShippingZone() {
		return shippingZone;
	}

	public void setShippingZone(String shippingZone) {
		this.shippingZone = shippingZone;
	}

	public Long getShippingZoneId() {
		return shippingZoneId;
	}

	public void setShippingZoneId(Long shippingZoneId) {
		this.shippingZoneId = shippingZoneId;
	}

	public String getShippingAddressFormat() {
		return shippingAddressFormat;
	}

	public void setShippingAddressFormat(String shippingAddressFormat) {
		this.shippingAddressFormat = shippingAddressFormat;
	}

	public String getShippingCustomField() {
		return shippingCustomField;
	}

	public void setShippingCustomField(String shippingCustomField) {
		this.shippingCustomField = shippingCustomField;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getShippingCode() {
		return shippingCode;
	}

	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public CustomerAffiliate getAffiliate() {
		return affiliate;
	}

	public void setAffiliate(CustomerAffiliate affiliate) {
		this.affiliate = affiliate;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public Marketing getMarketing() {
		return marketing;
	}

	public void setMarketing(Marketing marketing) {
		this.marketing = marketing;
	}

	public String getTracking() {
		return tracking;
	}

	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getForwardedIp() {
		return forwardedIp;
	}

	public void setForwardedIp(String forwardedIp) {
		this.forwardedIp = forwardedIp;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	
	// Transient fields

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		this.setStore(new Store(storeId));
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		this.setCustomer(new Customer(customerId));
	}

	public Long getCustomerGroupId() {
		return customerGroupId;
	}

	public void setCustomerGroupId(Long customerGroupId) {
		this.customerGroupId = customerGroupId;
		this.setCustomerGroup(new CustomerGroup(customerGroupId));
	}

	public Long getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(Long orderStatusId) {
		this.orderStatusId = orderStatusId;
		this.setOrderStatus(new OrderStatus(orderStatusId));
	}

	public Long getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(Long affiliateId) {
		this.affiliateId = affiliateId;
		this.setAffiliate(new CustomerAffiliate(affiliateId));
	}

	public Long getMarketingId() {
		return marketingId;
	}

	public void setMarketingId(Long marketingId) {
		this.marketingId = marketingId;
		this.setMarketing(new Marketing(marketingId));
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
		this.setCurrency(new Currency(currencyId));
	}	
}
