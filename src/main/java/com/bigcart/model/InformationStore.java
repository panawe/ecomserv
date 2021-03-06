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
@Table(name = "oc_information_store")
public class InformationStore extends BaseEntity {
	
	@Id
	@Column(name = "information_store_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
    @JoinColumn(name = "information_id")
	private Information information;
	@ManyToOne
    @JoinColumn(name = "store_id")
	private Store store;
	
	@Transient
	private Long informationId;
	@Transient
	private Long storeId;
	
	
	public InformationStore() {}
	public InformationStore(Long id) {
		super();
		this.id = id;
	}
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
	public Long getInformationId() {
		return informationId;
	}
	public void setInformationId(Long informationId) {
		this.informationId = informationId;
		this.setInformation(new Information(informationId));
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		this.setStore(new Store(storeId));
	}
}
