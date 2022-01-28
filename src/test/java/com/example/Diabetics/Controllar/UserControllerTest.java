package com.example.Diabetics.Controllar;

import com.example.Diabetics.Model.Entities.Doctor;
import com.example.Diabetics.Model.Entities.User;
import com.example.Diabetics.Model.Services.UserService;
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

class UserControllerTest {
    @Mock
    UserService userService;
    @InjectMocks
    UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        when(userService.getUsers()).thenReturn(Arrays.<User>asList(new User(0, "firstname", "lastname", 0, "patient_type", 0, "address", "email", "username", "password", Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization")))));

        List<User> result = userController.getUsers();
        Assertions.assertEquals(Arrays.<User>asList(new User(0, "firstname", "lastname", 0, "patient_type", 0, "address", "email", "username", "password", Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization")))), result);
    }

    @Test
    void testGetUsers2() {
        when(userService.getUser(anyInt())).thenReturn(null);

        Optional<User> result = userController.getUsers(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testCheckLogin() {
        when(userService.getCheck(anyString(), anyString())).thenReturn("getCheckResponse");

        String result = userController.checkLogin("email", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testRegisterNewUser() {
        userController.registerNewUser(new User(0, "firstname", "lastname", 0, "patient_type", 0, "address", "email", "username", "password", Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization"))));
    }

    @Test
    void testDeleteUser() {
        userController.deleteUser(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme