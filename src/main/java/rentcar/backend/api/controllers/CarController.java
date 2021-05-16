package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentcar.backend.business.abstracts.CarService;
import rentcar.backend.entities.concrete.Car;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService=carService;
    }

    @GetMapping("getall")
    public List<Car> getAll(){
        return carService.getAll();
    }
}
