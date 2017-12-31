package com.bigcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oc_api")
public class Api extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "api_id")
	private Long id;
	@Column(name="username")
	private String userName;
	private String akey;
	private int status;
	
	
	public Api() {}
	
	public Api(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAkey() {
		return akey;
	}
	public void setAkey(String akey) {
		this.akey = akey;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
