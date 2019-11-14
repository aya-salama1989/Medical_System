package com.esolutions.msystem.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")

public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping
    public Patient registerPatient(@RequestBody Patient patient){
        return patientService.add(patient);
    }

}
