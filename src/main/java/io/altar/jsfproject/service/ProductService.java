package io.altar.jsfproject.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repository.ProductRepository;


@Named("ProductService")
@RequestScoped
public class ProductService extends EntityService<Product>{
	@Inject
	private ProductRepository productList;
	
	public ProductRepository getProductRepository(){
		return productList;
	}
	
	public List<Product> showEntities(ProductRepository productList){
		List<Product> list = productList.getDbElements();
		return list;
	}
	
	public void editEntity(int id, String name, String shelfId, int discount, int iva, double price){
		productList.modifyDb(id, name, shelfId, discount, iva, price);
	}
	
//@Named("ProductService")
//@RequestScoped
//public class ProductService extends EntityService<Product> {
//
//	private ProductRepository productList = ProductRepository.getInstance();
//
//	public void editProduct(Product product) {
//		productList.modifyEntity(product.getId(), product.getShelfLoc(), product.getName(),
//				product.getDiscount(), product.getIva(), product.getPrice());
//	}
//
//	public ProductRepository getProductList() {
//		return productList;
//	}

}


//rendered="#{not empty ProductView.activeProduct}"