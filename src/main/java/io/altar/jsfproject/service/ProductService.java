package io.altar.jsfproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repository.ProductRepository;

@ManagedBean(name = "productService")
@ApplicationScoped
public class ProductService {
	private ProductRepository productList = ProductRepository.getInstance();
	
//	public List<Product> showProducts() {
//        List<Product> list = new ArrayList<Product>((Collection<Product>)productList);         
//        return list;
//    }
	
	public void addProduct(Product product){
		productList.addToList(product);
	}
}
