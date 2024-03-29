package com.esolutions.msystem.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping
    public List<Doctor> all() {
        return service.getAllDoctors();
    }

    @PostMapping
    public Doctor add(@RequestBody Doctor doctor) throws Exception {
        return service.addDoctor(doctor);
    }
}
// resources/users POST (inserts new user)
// resources/users GET (returns all users)
// resources/users/{id} PUT
// resources/users/{id} PATCH
// resources/users/{id} DELETE
