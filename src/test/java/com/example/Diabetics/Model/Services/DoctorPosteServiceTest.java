package com.example.Diabetics.Model.Services;

import com.example.Diabetics.Model.Entities.DoctorPoste;
import com.example.Diabetics.Model.Repositry.DoctorPosteRepository;
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

class DoctorPosteServiceTest {
    @Mock
    DoctorPosteRepository doctorPosteRepository;
    @InjectMocks
    DoctorPosteService doctorPosteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDoctorPostes() {
        List<DoctorPoste> result = doctorPosteService.getDoctorPostes();
        Assertions.assertEquals(Arrays.<DoctorPoste>asList(new DoctorPoste(0, "img", "title", "subject")), result);
    }

    @Test
    void testGetDoctorPoste() {
        Optional<DoctorPoste> result = doctorPosteService.getDoctorPoste(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewDoctorPoste() {
        doctorPosteService.addNewDoctorPoste(new DoctorPoste(0, "img", "title", "subject"));
    }

    @Test
    void testDeleteDoctorPoste() {
        doctorPosteService.deleteDoctorPoste(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme