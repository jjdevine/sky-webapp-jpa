package com.jjdevine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for sports products.
 * @author Jonathan
 *
 */
@Entity
@Table(name="sports_product")
public class SportsProduct {

	/**
	 * The primary key.
	 */
	@Id
	@Column(name="id")
	private long id;
	
	/**
	 * The name of the sports product.
	 */
	@Column(name="name")
	private String name;
	
	/**
	 * The location id associated with the product.
	 */
	@Column(name="location_id")
	private Long locationId;

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

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
}
