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
@Table(name = "oc_return_action_description")
public class ReturnActionDescription extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "return_action_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "return_action_id")
	private ReturnAction returnAction;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	
	@Transient
	private Long returnActionId;
	@Transient
	private Long languageId;
	
	
	public ReturnActionDescription() {}
	
	public ReturnActionDescription(Long id) {
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
	public ReturnAction getReturnAction() {
		return returnAction;
	}
	public void setReturnAction(ReturnAction returnAction) {
		this.returnAction = returnAction;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}

	
	
	public Long getReturnActionId() {
		return returnActionId;
	}
	public void setReturnActionId(Long returnActionId) {
		this.returnActionId = returnActionId;
		this.setReturnAction(new ReturnAction(returnActionId));
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
