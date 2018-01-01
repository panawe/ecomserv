package com.bigcart.model.id;

import java.io.Serializable;

public class FilterDescriptionId implements Serializable {

	private Long filterId;
	private Long languageId;
	
	public Long getFilterId() {
		return filterId;
	}
	public void setFilterId(Long filterId) {
		this.filterId = filterId;
	}
	public Long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	
	
}
