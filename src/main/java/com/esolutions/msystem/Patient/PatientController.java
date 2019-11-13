package com.esolutions.msystem.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @RequestMapping(method = RequestMethod.POST, value = "/patient/register")
    public void registerPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }
}
