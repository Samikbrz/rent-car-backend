package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model,Integer> {
}
