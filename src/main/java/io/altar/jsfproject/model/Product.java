package io.altar.jsfproject.model;

import java.util.ArrayList;

import io.altar.jsfproject.repository.ProductRepository;

public class Product extends Entity{
	private ArrayList<Integer> shelfLoc;
	private String name;
	private Integer discount;
	private Integer iva;
	private Double price;
	
	public void setShelfLoc(ArrayList<Integer> shelfLoc){
		this.shelfLoc = shelfLoc;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setDiscount(Integer discount){
		this.discount = discount;
	}
	
	public void setIva(Integer iva){
		this.iva = iva;
	}
	
	public void setPrice(Double price){
		this.price = price;
	}
	
	public ArrayList<Integer> getShelfLoc(){
		return this.shelfLoc;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Integer getDiscount(){
		return this.discount;
	}
	
	public Integer getIva(){
		return this.iva;
	}
	
	public Double getPrice(){
		return this.price;
	}
	
	public Product(){
		
	}
	
//	public Product(ArrayList<Integer> shelfLoc, String name, Integer discount, Integer iva, Double price){
//		this.shelfLoc = shelfLoc;
//		this.iva = iva;
//		this.price = price;
//		this.name = name;
//		this.discount = discount;
//		ProductRepository.getInstance().addToList(this);
//	}
	
	@Override
	public String toString(){
		String shelfStr = null;
		if(!(shelfLoc.isEmpty())){
			shelfStr = shelfLoc.toString();
		}
		return String.format("| ID: %d | Name: %s | Shelves: %s | Discount: %d%% | IVA: %d%% | Price: %.2f€ |\n", getId(), name, shelfStr, discount, iva, price);
	}
	
}

