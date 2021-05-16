package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
