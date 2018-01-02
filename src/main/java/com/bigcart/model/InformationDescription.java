package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_information_description")
public class InformationDescription extends BaseEntity {
	
	@Id
	@Column(name = "information_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "information_id")
	private Information information;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String title;
	private String description;
	@Column(name = "meta_title")
	private String metaTitle;
	@Column(name = "meta_description")
	private String metaDescription;
	@Column(name = "meta_keyword")
	private String metaKeyword;
		
	@Transient
	private Long informationId;
	@Transient
	private Long languageId;
	
	public InformationDescription() {}
	
	public InformationDescription(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Long getInformationId() {
		return informationId;
	}

	public void setInformationId(Long informationId) {
		this.informationId = informationId;
		this.setInformation(new Information(informationId));
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
