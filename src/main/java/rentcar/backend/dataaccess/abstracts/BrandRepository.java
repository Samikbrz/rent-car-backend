package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
