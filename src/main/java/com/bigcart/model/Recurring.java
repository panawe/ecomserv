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

import com.bigcart.model.enums.RecurringFrequency;

@Entity
@Table(name = "oc_recurring")
public class Recurring extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "recurring_id")
	private Long id;
	private BigDecimal price;
	private RecurringFrequency frequency;
	private int duration;
	private int cycle;
	@Column(name="trial_status")
	private int trialStatus;
	@Column(name="trial_price")
	private BigDecimal trialPrice;
	@Column(name="trial_frequency")
	private RecurringFrequency trialFrequency;
	@Column(name="trial_duration")
	private int trialDuration;
	@Column(name="trial_cycle")
	private int trialCycle;
	private int status;
	@Column(name="sort_order")
	private int sortOrder;
	

	public Recurring() {}
	public Recurring(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public RecurringFrequency getFrequency() {
		return frequency;
	}
	public void setFrequency(RecurringFrequency frequency) {
		this.frequency = frequency;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCycle() {
		return cycle;
	}
	public void setCycle(int cycle) {
		this.cycle = cycle;
	}
	public int getTrialStatus() {
		return trialStatus;
	}
	public void setTrialStatus(int trialStatus) {
		this.trialStatus = trialStatus;
	}
	public BigDecimal getTrialPrice() {
		return trialPrice;
	}
	public void setTrialPrice(BigDecimal trialPrice) {
		this.trialPrice = trialPrice;
	}
	public RecurringFrequency getTrialFrequency() {
		return trialFrequency;
	}
	public void setTrialFrequency(RecurringFrequency trialFrequency) {
		this.trialFrequency = trialFrequency;
	}
	public int getTrialDuration() {
		return trialDuration;
	}
	public void setTrialDuration(int trialDuration) {
		this.trialDuration = trialDuration;
	}
	public int getTrialCycle() {
		return trialCycle;
	}
	public void setTrialCycle(int trialCycle) {
		this.trialCycle = trialCycle;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

}
