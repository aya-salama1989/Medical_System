package com.esolutions.msystem.doctor;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private ObjectMapper objectMapper;


//    @RequestMapping("/doctor/login")
//    public Doctor logDoctor(@PathVariable String id) {
//        //find doctor by id, fake insecured login
//        return doctorService.getDoctor(id);
//    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Doctor add(@RequestBody Doctor doctor) throws Exception {
        return doctor;
    }
}
