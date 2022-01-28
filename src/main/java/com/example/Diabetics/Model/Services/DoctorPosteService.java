package com.example.Diabetics.Model.Services;

import com.example.Diabetics.Model.Entities.DoctorPoste;
import com.example.Diabetics.Model.Repositry.DoctorPosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorPosteService {


    private DoctorPosteRepository doctorPosteRepository;
@Autowired
    public DoctorPosteService(DoctorPosteRepository doctorPosteRepository) {
        this.doctorPosteRepository = doctorPosteRepository;
    }
    public List<DoctorPoste>getDoctorPostes(){
    return doctorPosteRepository.findAll();
    }
    public Optional<DoctorPoste>getDoctorPoste(Integer doctorPosteId){
    return doctorPosteRepository.findById(doctorPosteId);
    }
    public void addNewDoctorPoste(DoctorPoste doctorPoste){
    doctorPosteRepository.save(doctorPoste);
    }
    public void deleteDoctorPoste(Integer doctorPosteId){
    doctorPosteRepository.deleteById(doctorPosteId);
    }
}
