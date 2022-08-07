package springboot_auth.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot_auth.entities.produit;
import springboot_auth.services.produitService;

@RestController
public class produitController {
    private Logger log =  LoggerFactory.getLogger(produitController.class);

    @Autowired
    private produitService produitService;

    @PostMapping("/regist")
    public ResponseEntity<produit> register(@RequestBody produit produit){
        produit tempProduit=produitService.saveProduit(produit);
        if(tempProduit.equals(null)){
            log.error("register error");
        }
        log.info("register successful");
        return new ResponseEntity<produit>(tempProduit, HttpStatus.CREATED);
    }

}
