package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_option_value")
public class OptionValue extends BaseEntity {
	
	@Id
	@Column(name = "option_value_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "option_id")
	private Option option;
	private String image;
	@Column(name = "sort_order")
	private int sortOrder;
		
	@Transient
	private Long optionId;
	
	public OptionValue() {}
	
	public OptionValue(Long id) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
		this.setOption(new Option(optionId));
	}
}
