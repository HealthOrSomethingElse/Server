package hello.repos;

import hello.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
    boolean existsUserByEmail(String email);
    User findUserById(Integer id);
}
