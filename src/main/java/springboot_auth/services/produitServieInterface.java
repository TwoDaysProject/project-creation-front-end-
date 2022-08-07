package springboot_auth.services;

import springboot_auth.entities.produit;
import springboot_auth.entities.User;

import java.util.List;
import java.util.Optional;

public interface produitServieInterface {
    public List<produit> getProduitsByUser(User user);
    public produit getProduits(Long id);
    public List<produit> getAllProduit();
    public produit saveProduit(produit produit);
    public produit updateProduit(produit produit);
    public void deleteProduit(Long id);
    public List<produit> getEventsBycategories(String categories);
}
