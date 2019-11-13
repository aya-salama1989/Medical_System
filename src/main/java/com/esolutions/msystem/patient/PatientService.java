package com.esolutions.msystem.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;


//    private List<Patient> patientList = Arrays.asList(new Patient("1", "Abbass", "123", "3yan"),
//            new Patient("2", "Fernass", "123", "3yan awee"),
//            new Patient("3", "Abbass ibn fernass", "123", "3yan gedan"));

    public void addPatient(Patient patient){
        patientRepository.save(patient);
    }

}
