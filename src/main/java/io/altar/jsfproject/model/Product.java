package io.altar.jsfproject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

	@Entity
	@Table(name="Products")
	public class Product extends EntityModel implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Column(name="Shelves", nullable = true)
//		private ArrayList<Integer> shelfLoc = new ArrayList<>();
		private String shelfLoc ="shelfId";

		private String name = "Name";
		@Column(name="Discount")
		private Integer discount = 0;
		@Column(name="IVA")
		private Integer iva = 0;
		@Column(name="Price")
		private Double price = 0.0;

	public void setShelfLoc(String shelfLoc) {
		this.shelfLoc = shelfLoc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public void setIva(Integer iva) {
		this.iva = iva;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getShelfLoc() {
		return this.shelfLoc;
	}

	public String getName() {
		return this.name;
	}

	public Integer getDiscount() {
		return this.discount;
	}

	public Integer getIva() {
		return this.iva;
	}

	public Double getPrice() {
		return this.price;
	}

	public Product() {

	}

	// public Product(ArrayList<Integer> shelfLoc, String name, Integer
	// discount, Integer iva, Double price){
	// this.shelfLoc = shelfLoc;
	// this.iva = iva;
	// this.price = price;
	// this.name = name;
	// this.discount = discount;
	// ProductRepository.getInstance().addToList(this);
	// }

	@Override
	public String toString() {
		String shelfStr = null;
		if (!(shelfLoc.isEmpty())) {
			shelfStr = shelfLoc.toString();
		}
		return String.format("| ID: %d | Name: %s | Shelves: %s | Discount: %d%% | IVA: %d%% | Price: %.2f€ |\n",
				getId(), name, shelfStr, discount, iva, price);
	}

}
