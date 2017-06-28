package io.altar.jsfproject.service;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repository.ProductRepository;
import net.bootsfaces.render.E;

@Named("ProductService")
@RequestScoped
public class ProductService extends EntityService<Product> {

	private ProductRepository productList = ProductRepository.getInstance();

	public ProductRepository getProductRepository() {
		return productList;
	}

	public void editProduct(Product product) {
		productList.modifyEntity(product.getId(), product.getShelfLoc(), product.getName(),
				product.getDiscount(), product.getIva(), product.getPrice());
	}
}
