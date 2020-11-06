package com.mmit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.TemporalType.DATE;

/**
 * Entity implementation class for Entity: Orders
 *
 */
@Entity

public class Orders implements Serializable {
	@Id
	private int id;
	private int totalQty;
	private int totalAmt;
	@Temporal(DATE)
	private Date order_date;
	@ManyToMany
	@JoinTable(name = "Orderdetail")
	private List<Item> item;
	
	
	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	private static final long serialVersionUID = 1L;

	public Orders() {
		super();
	}
   
}
