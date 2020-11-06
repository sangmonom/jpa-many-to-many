package com.mmit.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Column;
@Embeddable
public class OrderdetailPK implements Serializable {
	private int order_id;
	private int item_id;
	public int getOrder_ID() {
		return order_id;
	}
	public void setOrder_ID(int order_ID) {
		this.order_id = order_ID;
	}
	public int getItem_ID() {
		return item_id;
	}
	public void setItem_ID(int item_ID) {
		this.item_id = item_ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item_id;
		result = prime * result + order_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderdetailPK other = (OrderdetailPK) obj;
		if (item_id != other.item_id)
			return false;
		if (order_id != other.order_id)
			return false;
		return true;
	}
	
	
}
