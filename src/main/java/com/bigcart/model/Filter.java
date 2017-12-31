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
@Table(name = "oc_filter")
public class Filter extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "filter_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "filter_group_id")
	private FilterGroup filterGroup;
	@Column(name="sort_order")
	private int sortOrder;
	
	@Transient
	private Long filterGroupId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public FilterGroup getFilterGroup() {
		return filterGroup;
	}

	public void setFilterGroup(FilterGroup filterGroup) {
		this.filterGroup = filterGroup;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	// Transient properties
	public Long getFilterGroupId() {
		return filterGroupId;
	}

	public void setFilterGroupId(Long filterGroupId) {
		this.filterGroupId = filterGroupId;
		this.setFilterGroup(new FilterGroup(filterGroupId));
	}
}
