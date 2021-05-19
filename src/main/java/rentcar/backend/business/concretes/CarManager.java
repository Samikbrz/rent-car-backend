package rentcar.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.CarService;
import rentcar.backend.dataaccess.abstracts.CarRepository;
import rentcar.backend.entities.concrete.Car;

@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarManager(CarRepository carRepository){
        this.carRepository=carRepository;
    }

    @Override
    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }

}
