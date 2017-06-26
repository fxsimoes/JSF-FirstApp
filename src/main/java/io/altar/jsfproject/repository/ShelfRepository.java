package io.altar.jsfproject.repository;

import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.repository.EntityRepository;
import io.altar.jsfproject.repository.ShelfRepository;

public class ShelfRepository extends EntityRepository<Shelf> {
	private static final ShelfRepository INSTANCE = new ShelfRepository();

	private ShelfRepository() {}

	public static ShelfRepository getInstance() {
		return INSTANCE;
	}

	public static void editElement(Integer id, Double location, Integer capacity, Double dailyPrice) {
		((Shelf)ShelfRepository.getInstance().get(id)).setLocation(location);
		((Shelf)ShelfRepository.getInstance().get(id)).setCapacity(capacity);
		((Shelf)ShelfRepository.getInstance().get(id)).setDailyPrice(dailyPrice);
	}
}
