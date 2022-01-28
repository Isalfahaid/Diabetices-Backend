package com.example.Diabetics.Controllar;

import com.example.Diabetics.Model.Entities.DoctorPoste;
import com.example.Diabetics.Model.Services.DoctorPosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/doctorPoste")
public class DoctorPosteControlle {

    private DoctorPosteService doctorPosteService;
@Autowired
    public DoctorPosteControlle(DoctorPosteService doctorPosteService) {
        this.doctorPosteService = doctorPosteService;
    }
    @GetMapping
    public List<DoctorPoste>getDoctorPostes(){
    return doctorPosteService.getDoctorPostes();
    }
    @GetMapping(path = "{doctorPosteId}")
    public Optional<DoctorPoste>getDoctorPoste(@PathVariable(name = "doctorPosteId") Integer doctorPosteId){
    return doctorPosteService.getDoctorPoste(doctorPosteId);
    }
    @PostMapping("add")
    public void registerNewDoctorPoste(@RequestBody DoctorPoste doctorPoste){
    doctorPosteService.addNewDoctorPoste(doctorPoste);
    }

    @DeleteMapping(path = "delete/{doctorPosteId}")
    public void deletedoctorposte(@PathVariable("doctorPosteId") Integer doctorPosteId){

        doctorPosteService.deleteDoctorPoste(doctorPosteId);
    }
}
