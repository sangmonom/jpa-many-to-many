package com.mmit.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import javassist.SerialVersionUID;
import javax.persistence.JoinColumn;
import javax.persistence.DiscriminatorColumn;

@Entity
public class Orderdetail implements Serializable {
	private static final long SerialVersionUID=1L;

	@EmbeddedId
	private OrderdetailPK id;
	private int subQty;
	private int subPrice;
	@ManyToOne
	@JoinColumn(name = "item_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Item item;
	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Orders order;
	
	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public OrderdetailPK getId() {
		return id;
	}
	public void setId(OrderdetailPK id) {
		this.id = id;
	}
	public int getSubQty() {
		return subQty;
	}
	public void setSubQty(int subQty) {
		this.subQty = subQty;
	}
	public int getSubPrice() {
		return subPrice;
	}
	public void setSubPrice(int subPrice) {
		this.subPrice = subPrice;
	}
	
}