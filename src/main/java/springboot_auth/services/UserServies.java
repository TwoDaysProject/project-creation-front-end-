package springboot_auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot_auth.entities.User;
import springboot_auth.repositories.UserRepositories;

import java.util.Optional;

@Service
public class UserServies implements UserServiceInterface{
    @Autowired
    private UserRepositories userRepository;

    @Override
    public User findByEmailAndPassword(String email,String password) {
        return userRepository.findByEmailAndPassword(email,password);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }



}
