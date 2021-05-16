package rentcar.backend.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entities.concrete.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color,Integer> {
}
