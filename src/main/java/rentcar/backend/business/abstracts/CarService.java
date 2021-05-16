package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Car;

import java.util.List;

public interface CarService {

    List<Car> getAll();
}
