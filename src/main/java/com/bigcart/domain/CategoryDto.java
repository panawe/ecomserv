package com.bigcart.domain;

public class CategoryDto {

	private Long id;
	private String name;
	private String parent1;
	private String parent2;
	private String parent3;
	private String displayName;
	private Integer sortOrder;
	
	
	public CategoryDto(Long id, String name, String parent1, String parent2, String parent3, Integer sortOrder) {
		super();
		this.id = id;
		this.name = name;
		this.parent1 = parent1;
		this.parent2 = parent2;
		this.parent3 = parent3;
		this.sortOrder = sortOrder;
		this.displayName = (parent3 != null ? parent3 + " > " : "") 
				+ (parent2 != null ? parent2 + " > " : "")
				+ (parent1 != null ? parent1 + " > " : "")
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
	public String getParent1() {
		return parent1;
	}
	public void setParent1(String parent1) {
		this.parent1 = parent1;
	}
	public String getParent2() {
		return parent2;
	}
	public void setParent2(String parent2) {
		this.parent2 = parent2;
	}
	public String getParent3() {
		return parent3;
	}
	public void setParent3(String parent3) {
		this.parent3 = parent3;
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
