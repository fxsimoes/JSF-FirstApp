package io.altar.jsfproject.repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import io.altar.jsfproject.model.EntityModel;

public class EntityRepository<E extends EntityModel> {
	@PersistenceContext(unitName="database")
	private EntityManager em;
	
	@Resource
    private UserTransaction userTransaction;
	
	public EntityManager getDb() {
		return em;
	}

	public void setDb(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void addToDb(E entity){
		em.persist(entity);
	}
	
	@Transactional
	public void removeFromDb(E entity){}
	
	@Transactional
	public void modifyDb(E newEntity){
		em.merge(newEntity);
	}
}

//public class EntityRepository<E extends EntityModel> {
//	private Integer id = 0;
//	private LinkedHashMap<Integer, E> entityList = new LinkedHashMap<>();
//
//	public Integer getNextId() {
//		return ++id;
//	}
//	
//	public Collection<E> values(){
//		return entityList.values();
//	}
//
//	public void addToList(E entity) {
//		entity.setId(getNextId());
//		entityList.put(entity.getId(), entity);
//	}
//
//	public void remove(Integer id) {
//		entityList.remove(id);
//	}
//
//	public E get(Integer id) {
//		return entityList.get(id);
//	}
//
//	public boolean isEmpty() {
//		return entityList.isEmpty();
//	}
//
//	public Set<Integer> keySet() {
//		return entityList.keySet();
//	}
//
//	public boolean containsKey(Integer key) {
//		return entityList.containsKey(key);
//	}
//
//	public void display(Integer key) {
//		System.out.println(entityList.get(key).toString() + "\n");
//	}
//
//	public void getList() {
//
//		System.out.println("List of entities:\n");
//		for (Integer id : entityList.keySet()) {
//			System.out.println(entityList.get(id));	
//		} 
//		System.out.println("\n");
//
//	}
//}

