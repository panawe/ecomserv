package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bigcart.model.id.FilterGroupDescriptionId;

@Entity
@Table(name = "oc_filter_group_description")
public class FilterGroupDescription extends BaseEntity {
	@Id
	@Column(name = "filter_group_description_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "filter_group_id")
	private FilterGroup filterGroup;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	
	private String name;
	
	@Transient
	private Long filterGroupId;	
	@Transient
	private Long languageId;
	
	
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
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getFilterGroupId() {
		return filterGroupId;
	}
	public void setFilterGroupId(Long filterGroupId) {
		this.filterGroupId = filterGroupId;
		this.setFilterGroup(new FilterGroup(filterGroupId));
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
