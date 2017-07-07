package io.altar.jsfproject.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.service.ProductService;

@Named("ProductView")
@RequestScoped
public class ProductView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String shelfId;
	private int discount;
	private int iva;
	private double price;

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

	public String getShelfId() {
		return shelfId;
	}

	public void setShelfId(String shelfId) {
		this.shelfId = shelfId;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
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

	public void setPrice(double price) {
		this.price = price;
	}
	
	private Product newProduct = new Product();
	
	private Product activeProduct;

	public Product getActiveProduct() {
		return activeProduct;
	}

	public void setActiveProduct(Product activeProduct) {
		this.activeProduct = activeProduct;
	}
	
	public Product getNewProduct() {
		return newProduct;
	}

	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}

	@Inject
	private ProductService productService;

	public Collection<Product> getProducts() {
		return productService.showEntities(productService.getProductRepository());
	}

	public String addProduct() {
		productService.addEntity(productService.getProductRepository(), newProduct);
		return null;
	}

	public String editProduct() {
		System.out.println(activeProduct.toString());
		productService.editEntity(id, name, shelfId, discount, iva, price);
		return null;
	}

	public String deleteProduct() {
//		try{
		productService.removeEntity(productService.getProductRepository(), activeProduct);
//		}catch(NullPointerException e){
//			System.out.println("Exception Caught");
//		}
		return null;
	}
}
