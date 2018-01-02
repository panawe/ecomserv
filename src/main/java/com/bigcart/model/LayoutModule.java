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
@Table(name = "oc_layout_module")
public class LayoutModule extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "layout_module_id")
	private Long id;
	@ManyToOne
    @JoinColumn(name = "layout_id")
	private Layout layout;
	private String code;
	private String position;
	@Column(name = "sort_order")
	private int sortOrder;
	
	@Transient
	private Long layoutId;
	
	public LayoutModule() {}
	
	public LayoutModule(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Layout getLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
		this.setLayout(new Layout(layoutId));
	}

}
