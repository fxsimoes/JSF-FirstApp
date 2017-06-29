package io.altar.jsfproject.view;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.service.ProductService;

@ManagedBean(name="ProductView")
@RequestScoped
public class ProductView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
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
		return productService.showEntities(productService.getProductList());
	}

	public String addProduct() {
		productService.addEntity(productService.getProductList(), newProduct);
		return null;
	}

	public String editProduct() {
		System.out.println(activeProduct.toString());
		productService.editProduct(activeProduct);
		return null;
	}

	public String deleteProduct() {
//		try{
		productService.removeEntity(productService.getProductList(), activeProduct);
//		}catch(NullPointerException e){
//			System.out.println("Exception Caught");
//		}
		return null;
	}
}
