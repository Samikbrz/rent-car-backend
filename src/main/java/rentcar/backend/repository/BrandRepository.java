package rentcar.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.Brand;

import java.util.Optional;

@Repository
public interface BrandRepository extends CrudRepository<Brand,Integer> {

    @Query(value = "SELECT * FROM brands WHERE name=:name",nativeQuery = true)
    Optional<Brand> findByName(@Param("name") String name);
}
