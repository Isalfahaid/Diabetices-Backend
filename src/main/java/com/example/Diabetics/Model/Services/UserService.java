package com.example.Diabetics.Model.Services;

import com.example.Diabetics.Model.Entities.User;
import com.example.Diabetics.Model.Repositry.UserRepositry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService  {

    private UserRepositry userRepository;

    @Autowired
    public UserService(UserRepositry userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }


    public Optional<User> getUser(Integer userId) {
        return userRepository.findById(userId);
    }

    public void addNewUser(User user) {
        userRepository.save(user);

    }
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
    public String getCheck(String email ,String password) {
        if( userRepository.existsByEmail(email) == true){
            String pass = userRepository.findPasswordByEmail(email);
            if (pass.equals(password)){
                return "authenticated" ;
            }
            else {
                return "Password does not match"; }
        }

        return "Username not found";
    }
}
