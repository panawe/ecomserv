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
@Table(name = "oc_return_status_description")
public class ReturnStatusDescription extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "return_status_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "return_status_id")
	private ReturnStatus returnStatus;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	
	@Transient
	private Long returnStatusId;
	@Transient
	private Long languageId;
	
	
	public ReturnStatusDescription() {}
	
	public ReturnStatusDescription(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ReturnStatus getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(ReturnStatus returnStatus) {
		this.returnStatus = returnStatus;
	}

	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}

	
	
	
	public Long getReturnStatusId() {
		return returnStatusId;
	}

	public void setReturnStatusId(Long returnStatusId) {
		this.returnStatusId = returnStatusId;
		this.setReturnStatus(new ReturnStatus(returnStatusId));
	}

	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
