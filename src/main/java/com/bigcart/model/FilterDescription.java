package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bigcart.model.id.AttributeDescriptionId;
import com.bigcart.model.id.FilterDescriptionId;

@Entity
@Table(name = "oc_filter_description")
@IdClass(FilterDescriptionId.class)
public class FilterDescription extends BaseEntity {
	
	@Id
	@Column(name = "filter_id")
	private Long filterId;
	@Id
	@Column(name = "language_id")
	private Long languageId;
	
	@Column(name = "filter_group_id")
	private Long filterGroupId;
	private String name;
	

	public Long getFilterId() {
		return filterId;
	}
	public void setFilterId(Long filterId) {
		this.filterId = filterId;
	}
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
