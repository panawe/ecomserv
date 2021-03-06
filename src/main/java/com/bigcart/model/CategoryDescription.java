package com.bigcart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_category_description")
public class CategoryDescription extends BaseEntity {
	

	@Id
	@Column(name = "category_description_id")
	@GeneratedValue
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category category;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	private String description;
	@Column(name = "meta_title")
	private String metaTitle;
	@Column(name = "meta_description")
	private String metaDescription;
	@Column(name = "meta_keyword")
	private String metaKeyword;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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
	
	
}
