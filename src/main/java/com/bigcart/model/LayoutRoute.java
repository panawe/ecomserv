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
@Table(name = "oc_layout_route")
public class LayoutRoute extends BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "layout_route_id")
	private Long id;
	@ManyToOne
    @JoinColumn(name = "layout_id")
	private Layout layout;
	@ManyToOne
    @JoinColumn(name = "store_id")
	private Store store;
	private String route;
	
	@Transient
	private Long layoutId;
	@Transient
	private Long storeId;
	
	public LayoutRoute() {}
	
	public LayoutRoute(Long id) {
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		this.setStore(new Store(storeId));
	}

	public Long getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
		this.setLayout(new Layout(layoutId));
	}

}
