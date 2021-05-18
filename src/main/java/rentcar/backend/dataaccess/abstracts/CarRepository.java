package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Car;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {
}
