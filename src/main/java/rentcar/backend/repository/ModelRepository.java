package rentcar.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.Model;

@Repository
public interface ModelRepository extends CrudRepository<Model,Integer> {
}
