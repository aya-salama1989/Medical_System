package com.esolutions.msystem.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;


    public Patient add(Patient patient){
      return   patientRepository.save(patient);
    }

}
