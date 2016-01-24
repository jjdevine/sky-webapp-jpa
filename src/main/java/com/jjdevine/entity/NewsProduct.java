package com.jjdevine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for news products.
 * @author Jonathan
 *
 */
@Entity
@Table(name="news_product")
public class NewsProduct {

	/**
	 * The primary key
	 */
	@Id
	@Column(name="id")
	private long id;
	
	/**
	 * The news product name.
	 */
	@Column(name="name")
	private String name;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
