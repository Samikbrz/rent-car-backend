package rentcar.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
