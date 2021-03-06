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
@Table(name = "oc_api_ip")
public class ApiIp extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "api_ip_id")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "api_id")
	private Api api;
	private String ip;
	
	@Transient
	private Long apiId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Api getApi() {
		return api;
	}

	public void setApi(Api api) {
		this.api = api;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	// Transient properties
	public Long getApiId() {
		return apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
		this.setApi(new Api(apiId));
	}
}
