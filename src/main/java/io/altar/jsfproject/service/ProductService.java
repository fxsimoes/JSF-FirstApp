package io.altar.jsfproject.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repository.ProductRepository;

@Named("ProductService")
@RequestScoped
public class ProductService extends EntityService<Product> {
	@Inject
	private ProductRepository productList;

	public ProductRepository getProductRepository() {
		return productList;
	}

	public void editProduct(Product product) {
		productList.modifyEntity(product.getId(), product.getShelfLoc(), product.getName(),
				product.getDiscount(), product.getIva(), product.getPrice());
	}
}
