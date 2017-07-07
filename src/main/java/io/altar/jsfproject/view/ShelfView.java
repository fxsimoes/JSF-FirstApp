package io.altar.jsfproject.view;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import io.altar.jsfproject.model.Shelf;
import io.altar.jsfproject.service.ShelfService;

@ManagedBean(name="ShelfView")
@RequestScoped
public class ShelfView implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int location;
	private int capacity;
	private int productID;
	private double rentalprice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public double getRentalprice() {
		return rentalprice;
	}

	public void setRentalprice(double rentalprice) {
		this.rentalprice = rentalprice;
	}

	private List<Shelf> shelves;
	private Shelf selectedShelf = new Shelf();
	private Shelf newShelf = new Shelf();
	private Shelf editedShelf = new Shelf();
	
	
	
	public Shelf getNewShelf() {
		return newShelf;
	}

	public void setNewShelf(Shelf newShelf) {
		this.newShelf = newShelf;
	}

	public Shelf getEditedShelf() {
		return editedShelf;
	}

	public void setEditedShelf(Shelf editedShelf) {
		this.editedShelf = editedShelf;
	}
	
    public Shelf getSelectedShelf() {
        return selectedShelf;
    }
 
    public void setSelectedShelf(Shelf selectedShelf) {
        this.selectedShelf = selectedShelf;
    }

    
	@Inject ShelfService shelfService;
    
    public ShelfService getShelfService() {
        return shelfService;
    }
 
    public void setShelfService(ShelfService shelfService) {
        this.shelfService = shelfService;
    }
    
    public List<Shelf> getShelves() {
        return shelfService.showEntities(shelfService.getShelfRepository());
    }
    
    public String addShelf(){
    	shelfService.addEntity(shelfService.getShelfRepository(), newShelf);
    	return null;
    }
    
//    public String editShelf(){
//		System.out.println(selectedShelf.toString());
//		shelfService.editEntity(shelfService.getShelfRepository(), selectedShelf);
//    	return null;
//    }
    
    public String editShelf(){
    	System.out.println(id);
    	System.out.println(location);
    	System.out.println(capacity);
    	System.out.println(productID);
    	System.out.println(rentalprice);
		shelfService.editEntity(id, location, capacity, productID, rentalprice);
    	return null;
    }
	
    
    public String deleteShelf(){
    	shelfService.removeEntity(shelfService.getShelfRepository(), selectedShelf);
    	return null;
    }
//    
//    public String addShelf(){
//    	Shelf shelf = new Shelf(1 ,2,null,5.0);
//    	shelves.add(shelf);
//    	return null;
//    }
//    
//    public String editShelf(){
//    	shelfService.addShelf();
//    	return null;
//    }
//    
//    public String deleteShelf(){
//    	shelfService.addShelf();
//    	return null;
//    }
}
