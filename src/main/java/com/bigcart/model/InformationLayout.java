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

import com.bigcart.model.id.CategoryStoreId;

@Entity
@Table(name = "oc_information_layout")
public class InformationLayout extends BaseEntity {
	
	@Id
	@Column(name = "information_layout_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
    @JoinColumn(name = "information_store_id")
	private InformationStore informationStore;
	@ManyToOne
    @JoinColumn(name="layout_id")
	private Layout layout;
	
	@Transient
	private Long informationStoreId;
	@Transient
	private Long layoutId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public InformationStore getInformationStore() {
		return informationStore;
	}
	public void setInformationStore(InformationStore informationStore) {
		this.informationStore = informationStore;
	}
	public Layout getLayout() {
		return layout;
	}
	public void setLayout(Layout layout) {
		this.layout = layout;
	}
	public Long getInformationStoreId() {
		return informationStoreId;
	}
	public void setInformationStoreId(Long informationStoreId) {
		this.informationStoreId = informationStoreId;
		this.setInformationStore(new InformationStore(informationStoreId));
	}
	public Long getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
		this.setLayout(new Layout(layoutId));
	}
	
	
}
