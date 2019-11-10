package com.esolutions.msystem.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping("/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }


    @RequestMapping("/doctors/{id}")
    public Doctor getDoctor(@PathVariable String id){
        return doctorService.getDoctor(id);
    }
}
