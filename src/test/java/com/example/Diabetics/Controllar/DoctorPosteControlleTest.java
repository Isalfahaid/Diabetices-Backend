package com.example.Diabetics.Controllar;

import com.example.Diabetics.Model.Entities.DoctorPoste;
import com.example.Diabetics.Model.Services.DoctorPosteService;
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

class DoctorPosteControlleTest {
    @Mock
    DoctorPosteService doctorPosteService;
    @InjectMocks
    DoctorPosteControlle doctorPosteControlle;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDoctorPostes() {
        when(doctorPosteService.getDoctorPostes()).thenReturn(Arrays.<DoctorPoste>asList(new DoctorPoste(0, "img", "title", "subject")));

        List<DoctorPoste> result = doctorPosteControlle.getDoctorPostes();
        Assertions.assertEquals(Arrays.<DoctorPoste>asList(new DoctorPoste(0, "img", "title", "subject")), result);
    }

    @Test
    void testGetDoctorPoste() {
        when(doctorPosteService.getDoctorPoste(anyInt())).thenReturn(null);

        Optional<DoctorPoste> result = doctorPosteControlle.getDoctorPoste(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewDoctorPoste() {
        doctorPosteControlle.registerNewDoctorPoste(new DoctorPoste(0, "img", "title", "subject"));
    }

    @Test
    void testDeletedoctorposte() {
        doctorPosteControlle.deletedoctorposte(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme