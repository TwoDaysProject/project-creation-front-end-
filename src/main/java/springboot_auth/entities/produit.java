package springboot_auth.entities;
import java.io.Serializable;
import org.springframework.data.annotation.Id;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class produit implements Serializable {
    @Id
    private  String id_pro;
    private String titre;
    private  String  categories;
    private String   descpription;
    private  int prix;
    private String soudescpription;
    private String image;
    private  User user;

    public produit( String titre, String categories, String descpription, int prix, String soudescpription, String image) {
        this.titre = titre;
        this.categories = categories;
        this.descpription = descpription;
        this.prix = prix;
        this.soudescpription = soudescpription;
        this.image = image;
    }

    public String getId_pro() {
        return id_pro;
    }

    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getDescpription() {
        return descpription;
    }

    public void setDescpription(String descpription) {
        this.descpription = descpription;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getSoudescpription() {
        return soudescpription;
    }

    public void setSoudescpription(String soudescpription) {
        this.soudescpription = soudescpription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
