package rentcar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
