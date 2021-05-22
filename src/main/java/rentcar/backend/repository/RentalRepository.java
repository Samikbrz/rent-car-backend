package rentcar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental,Integer> {
}
