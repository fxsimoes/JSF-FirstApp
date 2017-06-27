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
	
	@Inject static ProductService productService;

//	private static final List<Product> products = productService.showProducts();
	private static final List<Product> products = new ArrayList<>();
     
    public List<Product> getProducts() {
        return products;
    }
    
    public ProductService getProductService() {
        return productService;
    }
 
    public void setProductService(ProductService productService) {
        ProductView.productService = productService;
    }
    
    public Product getSelectedProduct() {
        return selectedProduct;
    }
 
    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
    
    public String addProduct(){
    	Product product = new Product(null,"teste",1,6,5.0);
    	productService.addProduct(product);
    	products.add(product);
    	return null;
    }
    
    public String editProduct(){
    	return null;
    }
    
    public String deleteProduct(){
    	products.remove(selectedProduct);
    	return null;
    }
}
