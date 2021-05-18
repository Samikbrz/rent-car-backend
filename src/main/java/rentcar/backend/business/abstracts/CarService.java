package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Car;

public interface CarService {

    Iterable<Car> getAllCars();
}
