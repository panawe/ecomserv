package com.bigcart.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "oc_category")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "id")
public class Category extends BaseEntity {
	
	@Id
	@Column(name = "category_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Category parent;
	private String image;
	private int top;
	@Column(name = "col")
	private int column;
	@Column(name = "sort_order")
	private int sortOrder;
	private int status;
	
	@ManyToMany
	@JoinTable(name = "oc_category_store",
	    joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"),
	    inverseJoinColumns = @JoinColumn(name = "store_id", referencedColumnName = "store_id")
	)
	private Set<Store> stores;
	
	@ManyToMany
	@JoinTable(name = "oc_category_filter",
	    joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"),
	    inverseJoinColumns = @JoinColumn(name = "filter_id", referencedColumnName = "filter_id")
	)
	private Set<Filter> filters;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Set<CategoryDescription> categoryDescriptions;
	
	@Transient
	private Long parentId;

	public Category() {}
	
	public Category(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
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

	public Set<Store> getStores() {
		return stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}

	public Set<Filter> getFilters() {
		return filters;
	}

	public void setFilters(Set<Filter> filters) {
		this.filters = filters;
	}

	public Set<CategoryDescription> getCategoryDescriptions() {
		return categoryDescriptions;
	}

	public void setCategoryDescriptions(Set<CategoryDescription> categoryDescriptions) {
		this.categoryDescriptions = categoryDescriptions;
	}

	// Transient properties
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		this.setParent(new Category(parentId));
	}
}
