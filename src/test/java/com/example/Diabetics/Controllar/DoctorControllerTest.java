package com.example.Diabetics.Controllar;

import com.example.Diabetics.Model.Entities.Doctor;
import com.example.Diabetics.Model.Services.DoctorService;
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

class DoctorControllerTest {
    @Mock
    DoctorService doctorService;
    @InjectMocks
    DoctorController doctorController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDoctors() {
        when(doctorService.getDoctors()).thenReturn(Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization")));

        List<Doctor> result = doctorController.getDoctors();
        Assertions.assertEquals(Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization")), result);
    }

    @Test
    void testGetDoctor() {
        when(doctorService.getDoctor(anyInt())).thenReturn(null);

        Optional<Doctor> result = doctorController.getDoctor(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewDoctor() {
        doctorController.registerNewDoctor(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization"));
    }

    @Test
    void testDeletedoctor() {
        doctorController.deletedoctor(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme