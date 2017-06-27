package io.altar.jsfproject.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.altar.jsfproject.model.Entity;
import io.altar.jsfproject.repository.EntityRepository;

public class EntityService<E extends Entity> {
	
	
	public List<E> showEntities(EntityRepository<E> entityList){
		List<E> list = new ArrayList<E>((Collection<E>)entityList.values());
		return list;
	}
	
	public void addEntity(EntityRepository<E> entityList, E entity){
		entityList.addToList(entity);
	}
	
	public void removeEntity(EntityRepository<E> entityList, E entity){
		entityList.remove(entity.getId());
	}
}
