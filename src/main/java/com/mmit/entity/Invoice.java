package com.mmit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import static javax.persistence.TemporalType.DATE;

/**
 * Entity implementation class for Entity: Invoice
 *
 */
@Entity

public class Invoice implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	@OneToOne
	private Orders order;
	@Temporal(DATE)
	private Date invoice_date;
	private String staffName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Date getInvoice_date() {
		return invoice_date;
	}

	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Invoice() {
		super();
	}
   
}
