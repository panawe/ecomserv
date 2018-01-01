package com.bigcart.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "oc_currency")
public class Currency extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "currency_id")
	private Long id;
	private String title;
	private String code;
	@Column(name = "symbol_left")
	private String symbolLeft;
	@Column(name = "symbol_right")
	private String symbolRight;
	@Column(name = "decimal_place")
	private char decimalPlace;
	private BigDecimal value;
	private int status;
	
	public Currency() {}
	
	public Currency(Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSymbolLeft() {
		return symbolLeft;
	}

	public void setSymbolLeft(String symbolLeft) {
		this.symbolLeft = symbolLeft;
	}

	public String getSymbolRight() {
		return symbolRight;
	}

	public void setSymbolRight(String symbolRight) {
		this.symbolRight = symbolRight;
	}

	public char getDecimalPlace() {
		return decimalPlace;
	}

	public void setDecimalPlace(char decimalPlace) {
		this.decimalPlace = decimalPlace;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
