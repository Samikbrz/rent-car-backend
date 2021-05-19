package rentcar.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.CarService;
import rentcar.backend.core.exception.AlreadyExistsException;
import rentcar.backend.core.exception.NotFoundException;
import rentcar.backend.dataaccess.abstracts.CarRepository;
import rentcar.backend.entities.concrete.Car;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;

    private Optional<Car> optionalCar;

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
        if (!carIsPresent(car.getId())){
            throw new AlreadyExistsException("This car already exist!");
        }
        return carRepository.save(car);
    }

    @Override
    @Transactional
    public void deleteCar(int id) {
        if(!carIsPresent(id)){
           throw new NotFoundException("Car is not found");
        }
        carRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Car updateCar(Car car) {
        if (!carIsPresent(car.getId())){
            throw new NotFoundException("Car is not found!");
        }
        return carRepository.save(car);
    }

    private boolean carIsPresent(int id){
        optionalCar= carRepository.findById(id);
        if (!optionalCar.isPresent()){
            return true;
        }
        return false;
    }
}
