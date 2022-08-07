package springboot_auth.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import springboot_auth.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springboot_auth.entities.User;

@Repository
public interface UserRepositories  extends MongoRepository<User,Long> {
    public User  findByEmailAndPassword(String email,String password);

}
