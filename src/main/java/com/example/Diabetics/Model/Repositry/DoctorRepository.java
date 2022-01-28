package com.example.Diabetics.Model.Repositry;

import com.example.Diabetics.Model.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
