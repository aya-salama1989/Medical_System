package com.esolutions.msystem.doctor;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class DoctorService {

    private List<Appointement> appointements = Arrays.asList(new Appointement(new Date(System.currentTimeMillis()),
                    new Date(System.currentTimeMillis()), true),
            new Appointement(new Date(System.currentTimeMillis()),
                    new Date(System.currentTimeMillis()), true));

    private List<Doctor> doctorsList = Arrays.asList(new Doctor("1", "Abbass", "123", "radiology", appointements),
            new Doctor("2", "Fernass", "123", "dermatology", appointements),
            new Doctor("3", "Abbass ibn fernass", "123", "gastro", appointements));

    public List<Doctor> getAllDoctors(){
        return doctorsList;
    }

    public Doctor getDoctor(String id){
        //get doctor by name or id
        return doctorsList.stream().filter(doctor -> doctor.getUserId().equals(id)).findAny().get();
    }

}
