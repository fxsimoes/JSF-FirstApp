package io.altar.jsfproject.service;

import java.util.Collection;

import io.altar.jsfproject.model.Entity;
import io.altar.jsfproject.repository.EntityRepository;

public class EntityService<E extends Entity> {
	
	
	public Collection<E> showEntities(EntityRepository<E> entityList){
//		Collection<E> list = new ArrayList<E>(entityList.values());
		return entityList.values();
	}
	
	public void addEntity(EntityRepository<E> entityList, E entity){
		entityList.addToList(entity);
	}
	
	public void removeEntity(EntityRepository<E> entityList, E entity){
		entityList.remove(entity.getId());
	}
}
