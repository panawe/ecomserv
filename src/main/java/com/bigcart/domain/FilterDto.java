package com.bigcart.domain;

public class FilterDto {

	private Long id;
	private String name;
	private String groupName;
	private String displayName;
	private Integer sortOrder;
	
	
	public FilterDto(Long id, String name, String groupName, Integer sortOrder) {
		super();
		this.id = id;
		this.name = name;
		this.groupName = groupName;
		this.sortOrder = sortOrder;
		this.displayName = (groupName != null ? groupName + " > " : "") 
				+ name;
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
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
