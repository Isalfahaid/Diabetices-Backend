package com.example.Diabetics.Model.Configuration;

import com.example.Diabetics.Model.Entities.DoctorPoste;
import com.example.Diabetics.Model.Repositry.DoctorPosteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DoctorPosteConfig {
    @Bean
    CommandLineRunner ccc(DoctorPosteRepository repository) {
        return args -> {
            DoctorPoste salma = new DoctorPoste(1,"https://media.istockphoto.com/photos/pediatrician-talks-with-patients-mother-picture-id1293681788?b=1&k=20&m=1293681788&s=170667a&w=0&h=86FIfZB_E9W0-1olORv2I6P5Fvd6EUMZUVPyiMfVrAY=" ,"Doctor","Diabeties");
            DoctorPoste s = new DoctorPoste(2,"https://media.istockphoto.com/photos/pediatrician-talks-with-patients-mother-picture-id1293681788?b=1&k=20&m=1293681788&s=170667a&w=0&h=86FIfZB_E9W0-1olORv2I6P5Fvd6EUMZUVPyiMfVrAY=" ,"Doctor","Diabeties");

            repository.saveAll(List.of(salma,s));
        };
        }
}
