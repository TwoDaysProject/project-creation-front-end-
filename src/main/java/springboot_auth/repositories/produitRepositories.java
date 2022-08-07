package springboot_auth.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springboot_auth.entities.produit;
import springboot_auth.entities.User;

import java.util.List;
@Repository
public interface produitRepositories extends MongoRepository<produit,Long> {
    public List<produit> findProduitsByUser(User user);
    public List<produit> findEventsBycategories(String categories);
}
