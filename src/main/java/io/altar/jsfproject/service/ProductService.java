package io.altar.jsfproject.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repository.ProductRepository;

@Named("ProductService")
@RequestScoped
public class ProductService extends EntityService<Product> {

	private ProductRepository productList = ProductRepository.getInstance();

	public void editProduct(Product product) {
		productList.modifyEntity(product.getId(), product.getShelfLoc(), product.getName(),
				product.getDiscount(), product.getIva(), product.getPrice());
	}

	public ProductRepository getProductList() {
		return productList;
	}

}


//rendered="#{not empty ProductView.activeProduct}"