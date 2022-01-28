package com.example.Diabetics.Model.Services;

import com.example.Diabetics.Model.Entities.Doctor;
import com.example.Diabetics.Model.Entities.User;
import com.example.Diabetics.Model.Repositry.UserRepositry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class UserServiceTest {
    @Mock
    UserRepositry userRepository;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        List<User> result = userService.getUsers();
        Assertions.assertEquals(Arrays.<User>asList(new User(0, "firstname", "lastname", 0, "patient_type", 0, "address", "email", "username", "password", Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization")))), result);
    }

    @Test
    void testGetUser() {
        Optional<User> result = userService.getUser(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewUser() {
        userService.addNewUser(new User(0, "firstname", "lastname", 0, "patient_type", 0, "address", "email", "username", "password", Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization"))));
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser(Integer.valueOf(0));
    }

    @Test
    void testGetCheck() {
        when(userRepository.findPasswordByEmail(anyString())).thenReturn("findPasswordByEmailResponse");
        when(userRepository.existsByEmail(anyString())).thenReturn(Boolean.TRUE);

        String result = userService.getCheck("email", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme