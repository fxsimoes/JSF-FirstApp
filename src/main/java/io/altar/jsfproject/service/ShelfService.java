package io.altar.jsfproject.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jsfproject.service.EntityService;
import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.repository.ShelfRepository;


@Named("ShelfService")
@ApplicationScoped
public class ShelfService extends EntityService<Shelf>{
	@Inject
	private ShelfRepository shelfList;
	
	public ShelfRepository getShelfRepository(){
		return shelfList;
	}
	
	public List<Shelf> showEntities(ShelfRepository shelfList){
		List<Shelf> list = shelfList.getDbElements();
		return list;
	}
	
	public void editEntity(int id, int location, int capacity, int productID, double rentalPrice){
		shelfList.modifyDb(id, location, capacity, productID, rentalPrice);
	}

}
