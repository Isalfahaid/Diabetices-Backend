package com.example.Diabetics.Controllar;


import com.example.Diabetics.Model.Entities.User;
import com.example.Diabetics.Model.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins="https://diabeticasback.herokuapp.com/")

@RestController
@RequestMapping(path = "api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }


    @GetMapping(path = "{userId}")
    public Optional<User> getUsers(@PathVariable(name = "userId") Integer userId) {
        return userService.getUser(userId);
    }


    @GetMapping(path = "login")
    public String checkLogin(@RequestParam(name = "email") String email,
                             @RequestParam(name = "password") String password) {
        return userService.getCheck(email, password);

    }

    @PostMapping(path = "add")
    public void registerNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "delete/{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);
    }
}
