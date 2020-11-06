package com.mmit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.AccessType.FIELD;
import static javax.persistence.AccessType.PROPERTY;
import static javax.persistence.DiscriminatorType.CHAR;
import static javax.persistence.DiscriminatorType.INTEGER;
import static javax.persistence.DiscriminatorType.STRING;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity

@Access(PROPERTY)
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "category")
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Category() {
		super();
	}
   
}
