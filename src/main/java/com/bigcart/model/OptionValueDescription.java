package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_option_value_description")
public class OptionValueDescription extends BaseEntity {
	
	@Id
	@Column(name = "option_value_description_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "option_value_id")
	private OptionValue optionValue;
	@ManyToOne
	@JoinColumn(name = "option_id")
	private Option option;
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;
	private String name;
		
	@Transient
	private Long optionId;
	@Transient
	private Long optionValueId;
	@Transient
	private Long languageId;
	
	public OptionValueDescription() {}
	
	public OptionValueDescription(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public OptionValue getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(OptionValue optionValue) {
		this.optionValue = optionValue;
	}

	public Long getOptionValueId() {
		return optionValueId;
	}

	public void setOptionValueId(Long optionValueId) {
		this.optionValueId = optionValueId;
		this.setOptionValue(new OptionValue(optionValueId));
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
		this.setOption(new Option(optionId));
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
		this.setLanguage(new Language(languageId));
	}
}
