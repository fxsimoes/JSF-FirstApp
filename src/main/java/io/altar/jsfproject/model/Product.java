package io.altar.jsfproject.model;

import io.altar.jsfproject.model.Entity;
import io.altar.jsfproject.repository.ProductRepository;

public class Product extends Entity {

	public int product_id;
	
	public Integer [] shelf_idLoc;
	
	public double discount;
	
	public int iva;
	
	public double price;
		
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount2) {
		this.discount = discount2;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(Double price2) {
		this.price = price2;
	}

	public Integer[] getShelf_idLoc() {
		return shelf_idLoc;
	}

	public void setShelf_idLoc(Integer[] shelf_idLoc) {
		this.shelf_idLoc = shelf_idLoc;
	}
	
	@Override
	public String toString(){
		return "ID  " + product_id + "  | PVP  " + price + "€  | Discount  " + discount + "€  | IVA  " + iva + "%";
	}
	
	public Product(int pId, double finalPrice, double DiscountValue, int ivaTax){
		
		product_id=pId;
		discount= DiscountValue;
		iva= ivaTax;
		price=finalPrice;
		ProductRepository.getInstance().addToList(this);
	}
}

