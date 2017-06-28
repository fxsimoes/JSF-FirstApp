package io.altar.jsfproject.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.service.ProductService;

@ManagedBean(name="ProductView")
@RequestScoped
public class ProductView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Product selectedProduct;
	
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	
	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	
	private Product newProduct = new Product();

	public Product getNewProduct() {
		return newProduct;
	}

	public void setNewProduct(Product newProduct) {
		this.newProduct = newProduct;
	}

	@Inject
	private ProductService productService;

	public List<Product> getProducts() {
		return productService.showEntities(productService.getProductRepository());
	}

	public String addProduct() {
		productService.addEntity(productService.getProductRepository(), newProduct);
		return null;
	}

	public String editProduct() {
		System.out.println(selectedProduct.toString());
		productService.editProduct(selectedProduct);
		return null;
	}

	public String deleteProduct() {
		productService.removeEntity(productService.getProductRepository(), selectedProduct);
		return null;
	}
}
