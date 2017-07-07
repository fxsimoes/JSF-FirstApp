package io.altar.jsfproject.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.Query;
import javax.transaction.Transactional;

import io.altar.jsfproject.model.Shelf;

@Named("shelfRepository")
@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> {
	
	public List<Shelf> getDbElements() {
		Query query = getDb().createQuery("FROM Shelf");
		List<Shelf> dbElements = (List<Shelf>) query.getResultList();
		return dbElements;
	}
	
	@Override
	@Transactional
	public void removeFromDb(Shelf shelf){
		Shelf shelfToRemove = getDb().find(Shelf.class, shelf.getId());
		getDb().remove(shelfToRemove);
	}
	
	@Transactional
	public void modifyDb(int id, int location, int capacity, int productID, double rentalPrice){
		Shelf dbShelf = getDb().find(Shelf.class, id);
		dbShelf.setLocation(location);
		dbShelf.setCapacity(capacity);
		dbShelf.setProductID(productID);
		dbShelf.setDailyPrice(rentalPrice);
	}
	
//	private static final ShelfRepository INSTANCE = new ShelfRepository();
//
//	private ShelfRepository() {}
//
//	public static ShelfRepository getInstance() {
//		return INSTANCE;
//	}
//
//	public void modifyEntity(Integer id, Integer location, Integer capacity, Integer productID, Double price) {
//		((Shelf) ShelfRepository.getInstance().get(id)).setLocation(location);
//		((Shelf) ShelfRepository.getInstance().get(id)).setCapacity(capacity);
//		((Shelf) ShelfRepository.getInstance().get(id)).setProductID(productID);
//		((Shelf) ShelfRepository.getInstance().get(id)).setDailyPrice(price);
//	}
//	
//	public void showProduct(Integer id, Integer productID) {
//		if(((Shelf) ShelfRepository.getInstance().get(id)).getProductID()==null){
//			((Shelf) ShelfRepository.getInstance().get(id)).setProductID(productID);
//		}else{
//			((Shelf) ShelfRepository.getInstance().get(id)).setProductID(null);
//		}
//	}
}
