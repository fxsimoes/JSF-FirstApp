package io.altar.jsfproject.service;

import io.altar.jsfproject.model.EntityModel;
import io.altar.jsfproject.repository.EntityRepository;

public class EntityService<E extends EntityModel> {
	
	
	public void addEntity(EntityRepository<E> entityList, E entity){
//		Collection<E> list = new ArrayList<E>(entityList.values());
		entityList.addToDb(entity);
	}
	
	public void editEntity(EntityRepository<E> entityList, E entity){
		entityList.modifyDb(entity);
	}
	
	public void removeEntity(EntityRepository<E> entityList, E entity){
		entityList.removeFromDb(entity);
	}
}
