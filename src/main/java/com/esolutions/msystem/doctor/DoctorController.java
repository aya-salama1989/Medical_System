package com.esolutions.msystem.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping("/doctors")
    public List<Doctor> getAllDoctors()
    { return doctorService.getAllDoctors(); }

    //getSpecific dr +appointements


    @RequestMapping("/doctor/login")
    public Doctor logDoctor(@PathVariable String id){
        //find doctor by id, fake insecured login
        return doctorService.getDoctor(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/doctor/register")
    public void registerDoctor(@RequestBody Doctor doctor){
         doctorService.addDoctor(doctor);
    }
}
