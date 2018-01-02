package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "oc_information_to_store")
public class InformationStore extends BaseEntity {
	
	@Id
	@Column(name = "information_store_id")
	@GeneratedValue
	private Long id;
	@ManyToOne
    @JoinColumn(name = "information_id")
	private Information information;
	@Id
	@ManyToOne
    @JoinColumn(name = "store_id")
	private Store store;
	
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

}
