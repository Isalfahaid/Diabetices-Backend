package com.example.Diabetics.Model.Services;

import com.example.Diabetics.Model.Entities.Doctor;
import com.example.Diabetics.Model.Repositry.DoctorRepository;
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

class DoctorServiceTest {
    @Mock
    DoctorRepository doctorRepository;
    @InjectMocks
    DoctorService doctorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDoctors() {
        List<Doctor> result = doctorService.getDoctors();
        Assertions.assertEquals(Arrays.<Doctor>asList(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization")), result);
    }

    @Test
    void testGetDoctor() {
        Optional<Doctor> result = doctorService.getDoctor(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewDoctor() {
        doctorService.addNewDoctor(new Doctor(0, "fname", "lname", 0, 0, "doctoraddress", "specialization"));
    }

    @Test
    void testDeleteDoctor() {
        doctorService.deleteDoctor(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme