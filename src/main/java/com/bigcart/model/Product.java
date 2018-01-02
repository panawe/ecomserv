package com.bigcart.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_product")
public class Product extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private Long id;
	private String model;
	private String userName;
	private String sku;
	private String upc;
	private String ean;
	private String jan;
	private String isbn;
	private String mpn;
	private String location;
	private int quantity;
	@ManyToOne
	@JoinColumn(name = "stock_status_id")
	private StockStatus stockStatus;
	private String image;
	@ManyToOne
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer;
	private int shipping;
	private BigDecimal price;
	private int points;
	@ManyToOne
	@JoinColumn(name = "tax_class_id")
	private TaxClass taxClass;
	private Date dateAvailable;
	private BigDecimal weight;
	@ManyToOne
	@JoinColumn(name = "weight_class_id")
	private WeightClass weightClass;
	private BigDecimal length;
	private BigDecimal width;
	private BigDecimal height;
	@ManyToOne
	@JoinColumn(name = "length_class_id")
	private LengthClass lengthClass;
	private int subtract;
	private int minimum;
	@Column(name="sort_order")
	private int sortOrder;
	private int status;
	private int viewed;
	
	@Transient
	private Long stockStatusId;
	@Transient
	private Long manufacturerId;
	@Transient
	private Long taxClassId;
	@Transient
	private Long weightClassId;
	@Transient
	private Long lengthClassId;
	
	public Product() {}
	
	public Product(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getJan() {
		return jan;
	}

	public void setJan(String jan) {
		this.jan = jan;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getShipping() {
		return shipping;
	}

	public void setShipping(int shipping) {
		this.shipping = shipping;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public TaxClass getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
	}

	public Date getDateAvailable() {
		return dateAvailable;
	}

	public void setDateAvailable(Date dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public WeightClass getWeightClass() {
		return weightClass;
	}

	public void setWeightClass(WeightClass weightClass) {
		this.weightClass = weightClass;
	}

	public BigDecimal getLength() {
		return length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public BigDecimal getWidth() {
		return width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public LengthClass getLengthClass() {
		return lengthClass;
	}

	public void setLengthClass(LengthClass lengthClass) {
		this.lengthClass = lengthClass;
	}

	public int getSubtract() {
		return subtract;
	}

	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getViewed() {
		return viewed;
	}

	public void setViewed(int viewed) {
		this.viewed = viewed;
	}

	
	// Transient properties
	public Long getStockStatusId() {
		return stockStatusId;
	}

	public void setStockStatusId(Long stockStatusId) {
		this.stockStatusId = stockStatusId;
		this.setStockStatus(new StockStatus(stockStatusId));
	}

	public Long getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
		this.setManufacturer(new Manufacturer(manufacturerId));
	}

	public Long getTaxClassId() {
		return taxClassId;
	}

	public void setTaxClassId(Long taxClassId) {
		this.taxClassId = taxClassId;
		this.setTaxClass(new TaxClass(taxClassId));
	}

	public Long getWeightClassId() {
		return weightClassId;
	}

	public void setWeightClassId(Long weightClassId) {
		this.weightClassId = weightClassId;
		this.setWeightClass(new WeightClass(weightClassId));
	}

	public Long getLengthClassId() {
		return lengthClassId;
	}

	public void setLengthClassId(Long lengthClassId) {
		this.lengthClassId = lengthClassId;
		this.setLengthClass(new LengthClass(lengthClassId));
	}
}
