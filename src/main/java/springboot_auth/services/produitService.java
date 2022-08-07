package springboot_auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot_auth.entities.produit;
import springboot_auth.entities.User;
import springboot_auth.repositories.produitRepositories;

import java.util.List;
import java.util.Optional;

@Service
public class produitService  implements  produitServieInterface{

    @Autowired
    private produitRepositories produitRepositories;


    @Override
    public List<produit> getProduitsByUser(User user) {
        return produitRepositories.findProduitsByUser(user);
    }

    @Override
    public produit getProduits(Long id) {
        return produitRepositories.findById(id).get();
    }

    @Override
    public List<produit> getAllProduit() {
        return produitRepositories.findAll();
    }

    @Override
    public produit saveProduit(produit produit) {
        return produitRepositories.save(produit);
    }

    @Override
    public produit updateProduit(produit produit) {
        return produitRepositories.save(produit);
    }

    @Override
    public void deleteProduit(Long id){
        produitRepositories.deleteById(id);
    }

    @Override
    public List<produit> getEventsBycategories(String categories) {
        return produitRepositories.findEventsBycategories(categories);
    }


}
