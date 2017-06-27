package io.altar.jsfproject.repository;

import java.util.ArrayList;
import java.util.Collections;

import io.altar.jsfproject.model.Product;


public class ProductRepository extends EntityRepository<Product> {
	private static final ProductRepository INSTANCE = new ProductRepository();

	private ProductRepository() {}

	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	public void modifyEntity(Integer id, ArrayList<Integer> shelf, String name, Integer discount, Integer Iva, Double price) {
		((Product) ProductRepository.getInstance().get(id)).setShelfLoc(shelf);
		((Product) ProductRepository.getInstance().get(id)).setName(name);		
		((Product) ProductRepository.getInstance().get(id)).setDiscount(discount);
		((Product) ProductRepository.getInstance().get(id)).setIva(Iva);
		((Product) ProductRepository.getInstance().get(id)).setPrice(price);
	}
	
	public void addShelfLoc(Integer id, Integer shelf) {
		ArrayList<Integer> shelfLoc = ((Product) ProductRepository.getInstance().get(id)).getShelfLoc();
		if(shelfLoc != null){
			shelfLoc.add(shelf);
		}		
		((Product) ProductRepository.getInstance().get(id)).setShelfLoc(shelfLoc);
	}
	
	public void changeShelfLoc(Integer oldId, Integer newId, Integer shelfId) {
		if(oldId!=newId){

			if (oldId != null) {
				ArrayList<Integer> oldList = ((Product)  ProductRepository.getInstance().get(oldId)).getShelfLoc();
				oldList.remove(shelfId);
				((Product)  ProductRepository.getInstance().get(oldId))
						.setShelfLoc(oldList);
			}
			
			if (newId != null) {
			ArrayList<Integer> newList = ((Product)  ProductRepository.getInstance().get(newId))
					.getShelfLoc();
				newList.add(shelfId);
				Collections.sort(newList);
				((Product)  ProductRepository.getInstance().get(newId))
						.setShelfLoc(newList);
			}	
		}
	}
}