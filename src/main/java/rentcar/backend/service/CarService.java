package rentcar.backend.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.Car;
import rentcar.backend.exception.NotFoundException;
import rentcar.backend.repository.CarRepository;

@Service
public class CarService {

    private final CarRepository carRepository;

    private Optional<Car> optionalCar;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Transactional
    public void deleteCar(int id) {
        if (carIsPresent(id)) {
            throw new NotFoundException("Car is not found");
        }
        carRepository.deleteById(id);
    }

    @Transactional
    public Car updateCar(Car car) {
        if (!carIsPresent(car.getId())) {
            throw new NotFoundException("Car is not found!");
        }
        return carRepository.save(car);
    }

    private boolean carIsPresent(int id) {
        optionalCar = carRepository.findById(id);
        return !optionalCar.isPresent();
    }
}
