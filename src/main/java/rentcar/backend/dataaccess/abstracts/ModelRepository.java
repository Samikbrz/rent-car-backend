package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Model;

@Repository
public interface ModelRepository extends CrudRepository<Model,Integer> {
}
