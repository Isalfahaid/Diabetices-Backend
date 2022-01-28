package com.example.Diabetics.Model.Services;

import com.example.Diabetics.Model.Entities.Doctor;
import com.example.Diabetics.Model.Repositry.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private DoctorRepository doctorRepository;
    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }
    public List<Doctor>getDoctors(){
        return doctorRepository.findAll();
    }

    public Optional<Doctor>getDoctor(Integer id){
        return doctorRepository.findById(id);
    }
    public void addNewDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }
    public void deleteDoctor(Integer id){
        doctorRepository.deleteById(id);
    }
}
