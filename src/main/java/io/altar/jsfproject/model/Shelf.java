package io.altar.jsfproject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.altar.jsfproject.model.EntityModel;
import io.altar.jsfproject.repository.ShelfRepository;

	@Entity
	@Table(name="Shelves")
	public class Shelf extends EntityModel implements Serializable{

		private static final long serialVersionUID = 1L;
		@Column(name="Location")
		private Integer location = 0;
		@Column(name="Capacity")
		private Integer capacity = 0;
		@Column(name="Product ID", nullable = true)
		private Integer productID = null;
		@Column(name="Rental Price")
		private Double dailyPrice = 0.0;
	
	public void setLocation(Integer location){
		this.location = location;
	}
	
	public void setCapacity(Integer capacity){
		this.capacity = capacity;
	}
	
	public void setProductID(Integer productID){
		this.productID = productID;
	}
	
	public void setDailyPrice(Double dailyPrice){
		this.dailyPrice = dailyPrice;
	}
	
	public Integer getLocation(){
		return this.location;
	}
	
	public Integer getCapacity(){
		return this.capacity;
	}
	
	public Integer getProductID(){
		return this.productID;
	}
	
	public Double getDailyPrice(){
		return this.dailyPrice;
	}
	
	public Shelf(){

	}
	
	@Override
	public String toString(){
		return String.format("| ID: %d | Location: %d | Capacity: %d | Product's ID: %d | Daily Price: %.2f€|\n", getId(), location, capacity, productID, dailyPrice);
	}
}
