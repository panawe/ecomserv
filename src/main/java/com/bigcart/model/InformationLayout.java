package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.bigcart.model.id.CategoryStoreId;

@Entity
@Table(name = "oc_information_to_layout")
public class InformationLayout extends BaseEntity {
	
	@Id
	@Column(name = "information_layout_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
    @JoinColumn(name = "information_id")
	private Information information;
	@Id
	@ManyToOne
    @JoinColumn(name = "store_id")
	private Store store;
	@Column(name="layout_id")
	private Long layoutId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Information getInformation() {
		return information;
	}
	public void setInformation(Information information) {
		this.information = information;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Long getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}
	
}
