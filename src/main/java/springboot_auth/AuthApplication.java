package springboot_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot_auth.repositories.produitRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import springboot_auth.entities.produit;


@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {

		SpringApplication.run(AuthApplication.class, args);
	}

/*
@Bean
	CommandLineRunner runner(produitRepositories repository){
		return args -> {
			produit produit = new produit(
				"titre","categories","descpription",12,"soudescpription","image"
			);
			repository.insert(produit);
		};
}
*/
}
