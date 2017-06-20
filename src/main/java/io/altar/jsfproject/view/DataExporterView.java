package io.altar.jsfproject.view;


import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import io.altar.jsfproject.model.Car;
import io.altar.jsfproject.service.CarService;

@ManagedBean
public class DataExporterView implements Serializable {
    
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private List<Car> cars;
        
   @ManagedProperty("#{carService}")
   private CarService service;
    
   @PostConstruct
   public void init() {
       cars = service.createCars(10);
   }

   public List<Car> getCars() {
       return cars;
   }

   public void setService(CarService service) {
       this.service = service;
   }
}
