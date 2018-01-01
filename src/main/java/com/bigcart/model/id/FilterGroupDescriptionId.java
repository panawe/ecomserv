package com.bigcart.model.id;

import java.io.Serializable;

public class FilterGroupDescriptionId implements Serializable {

	private Long filterGroupId;
	private Long languageId;
	
	public Long getFilterGroupId() {
		return filterGroupId;
	}
	public void setFilterGroupId(Long filterGroupId) {
		this.filterGroupId = filterGroupId;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	
	
}
