package rentcar.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rentcar.backend.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    @Query(value = "SELECT * FROM users WHERE name=:name",nativeQuery = true)
    Optional<User> findByName(@Param("name") String name);

}
