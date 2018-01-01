package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.bigcart.model.id.FilterGroupDescriptionId;

@Entity
@Table(name = "oc_filter_group_description")
@IdClass(FilterGroupDescriptionId.class)
public class FilterGroupDescription extends BaseEntity {
	
	@Id
	@Column(name = "filter_group_id")
	private Long filterGroupId;
	@Id
	@Column(name = "language_id")
	private Long languageId;
	
	private String name;
	
	public Long getFilterGroupId() {
		return filterGroupId;
	}
	public void setFilterGroupId(Long filterGroupId) {
		this.filterGroupId = filterGroupId;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
