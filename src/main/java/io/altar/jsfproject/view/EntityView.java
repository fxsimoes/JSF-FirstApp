//package io.altar.jsfproject.view;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedProperty;
//
//import io.altar.jsfproject.model.Entity;
//import io.altar.jsfproject.service.EntityService;
//
//public class EntityView<E extends Entity> implements Serializable{
//
//	private static final long serialVersionUID = 1L;
//	private List<E> entities;
//	private Entity selectedEntity;
//
//	@ManagedProperty(value = "#{entityService}")
//	// @Inject
//	private EntityService<E> entityService;
//
//	@PostConstruct
//	public void init() {
//		entities = entityService.createEntities();
//
//	}
//
//	public List<E> getProducts() {
//		return entities;
//	}
//
//	public EntityService<E> getProductService() {
//		return entityService;
//	}
//
//	public void setProductService(EntityService<E> entityService) {
//		this.entityService = entityService;
//	}
//
//	public Entity getSelectedProduct() {
//		return selectedEntity;
//	}
//
//	public void setSelectedProduct(Entity selectedEntity) {
//		this.selectedEntity = selectedEntity;
//	}
//}
