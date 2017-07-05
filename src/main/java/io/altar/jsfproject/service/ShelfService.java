package io.altar.jsfproject.service;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.repository.ShelfRepository;

@ManagedBean(name = "shelfService")
@ApplicationScoped
public class ShelfService {
	private ShelfRepository shelfList = ShelfRepository.getInstance();

//	public List<Shelf> showShelves() {
//		List<Shelf> list = new ArrayList<Shelf>((Collection<Shelf>) shelfList);
//		return list;
//	}

	public void addShelf() {
		shelfList.addToList(new Shelf(1, 2, null, 5.0));
	}
}
