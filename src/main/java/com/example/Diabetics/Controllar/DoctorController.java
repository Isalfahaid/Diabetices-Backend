package com.example.Diabetics.Controllar;

import com.example.Diabetics.Model.Entities.Doctor;
import com.example.Diabetics.Model.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins="https://diabeticas.herokuapp.com")

@RestController
@RequestMapping(path = "api/doctor")
public class DoctorController {

    private DoctorService doctorService;
    @Autowired

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
    @GetMapping
    public List<Doctor>getDoctors(){
        return doctorService.getDoctors();
    }
    @GetMapping(path = "{id}")
    public Optional<Doctor> getDoctor(@PathVariable(name = "id") Integer id){
        return doctorService.getDoctor(id);
    }
    @PostMapping("add")
    public void registerNewDoctor(@RequestBody Doctor doctor){
        doctorService.addNewDoctor(doctor);
    }

    @DeleteMapping(path = "delete/{id}")
    public void deletedoctor(@PathVariable("id") Integer id){
        doctorService.deleteDoctor(id);
    }
}
