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
import com.bigcart.model.id.CategoryDescriptionId;

@Entity
@Table(name = "oc_category_description")
@IdClass(CategoryDescriptionId.class)
public class CategoryDescription extends BaseEntity {
	
	@Id
	@Column(name = "category_id")
	private Long categoryId;
	@Id
	@Column(name = "language_id")
	private Long languageId;
	private String name;
	private String description;
	@Column(name = "meta_title")
	private String metaTitle;
	@Column(name = "meta_description")
	private String metaDescription;
	@Column(name = "meta_keyword")
	private String metaKeyword;
	
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMetaTitle() {
		return metaTitle;
	}
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	public String getMetaKeyword() {
		return metaKeyword;
	}
	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
