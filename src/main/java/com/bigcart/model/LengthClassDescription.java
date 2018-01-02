package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_length_class_description")
public class LengthClassDescription extends BaseEntity {
	
	@Id
	@Column(name = "length_class_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "length_class_id")
	private LengthClass lengthClass;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String title;
	private String unit;
		
	@Transient
	private Long lengthClassId;
	@Transient
	private Long languageId;
	
	public LengthClassDescription() {}
	
	public LengthClassDescription(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LengthClass getLengthClass() {
		return lengthClass;
	}

	public void setLengthClass(LengthClass lengthClass) {
		this.lengthClass = lengthClass;
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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getLengthClassId() {
		return lengthClassId;
	}

	public void setLengthClassId(Long lengthClassId) {
		this.lengthClassId = lengthClassId;
		this.setLengthClass(new LengthClass(lengthClassId));
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
