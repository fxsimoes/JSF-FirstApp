package io.altar.jsfproject.repository;

import io.altar.jsfproject.model.Product;
import io.altar.jsfproject.repository.EntityRepository;
import io.altar.jsfproject.repository.ProductRepository;

public class ProductRepository extends EntityRepository<Product> {
	private static final ProductRepository INSTANCE = new ProductRepository();

	private ProductRepository() {}

	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	public static void editElement(Integer id, Integer[] shelf, Double discount, Integer tax, Double price) {
		((Product)ProductRepository.getInstance().get(id)).setShelf_idLoc(shelf);
		((Product)ProductRepository.getInstance().get(id)).setDiscount(discount);
		((Product)ProductRepository.getInstance().get(id)).setIva(tax);
		((Product)ProductRepository.getInstance().get(id)).setPrice(price);
	}
}
