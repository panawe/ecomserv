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
@Table(name = "oc_return_reason_description")
public class ReturnReasonDescription extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "return_reason_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "return_reason_id")
	private ReturnReason returnReason;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	
	@Transient
	private Long returnReasonId;
	@Transient
	private Long languageId;
	
	
	public ReturnReasonDescription() {}
	
	public ReturnReasonDescription(Long id) {
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
	public ReturnReason getReturnReason() {
		return returnReason;
	}
	public void setReturnReason(ReturnReason returnReason) {
		this.returnReason = returnReason;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}

	
	
	public Long getReturnReasonId() {
		return returnReasonId;
	}
	public void setReturnReasonId(Long returnReasonId) {
		this.returnReasonId = returnReasonId;
		this.setReturnReason(new ReturnReason(returnReasonId));
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
