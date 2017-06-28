package io.altar.jsfproject.model;

import io.altar.jsfproject.model.Entity;
import io.altar.jsfproject.repository.ShelfRepository;

public class Shelf extends Entity{
	private Integer location;
	private Integer capacity;
	private Integer productID;
	private Double dailyPrice;
	
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
	
	public Shelf(Integer location, Integer capacity, Integer productID, Double dailyPrice){
		this.location = location;
		this.capacity = capacity;
		this.productID = productID;
		this.dailyPrice = dailyPrice;
		ShelfRepository.getInstance().addToList(this);
	}
	
	@Override
	public String toString(){
		return String.format("| ID: %d | Location: %d | Capacity: %d | Product's ID: %d | Daily Price: %.2f€|\n", getId(), location, capacity, productID, dailyPrice);
	}
}
