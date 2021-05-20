package rentcar.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.Car;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {
}
