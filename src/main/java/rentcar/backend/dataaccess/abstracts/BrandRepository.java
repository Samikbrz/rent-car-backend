package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand,Integer> {
}
