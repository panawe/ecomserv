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

@Entity
@Table(name = "oc_recurring_description")
public class RecurringDescription extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "recurring_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "recurring_id")
	private Recurring recurring;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
	
	@Transient
	private Long recurringId;
	@Transient
	private Long languageId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public Recurring getRecurring() {
		return recurring;
	}
	public void setRecurring(Recurring recurring) {
		this.recurring = recurring;
	}
	public Long getRecurringId() {
		return recurringId;
	}
	public void setRecurringId(Long recurringId) {
		this.recurringId = recurringId;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}

	
}
