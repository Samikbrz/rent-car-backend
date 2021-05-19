package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rentcar.backend.business.abstracts.CarService;
import rentcar.backend.entities.concrete.Car;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService=carService;
    }

    @GetMapping
    public Iterable<Car> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable int id){
        carService.deleteCar(id);
    }

    @PutMapping("/{id}")
    public Car updateCar(@RequestBody Car car,@PathVariable int id){
        car.setId(id);
        return carService.updateCar(car);
    }
}
