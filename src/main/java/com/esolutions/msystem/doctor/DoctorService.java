package com.esolutions.msystem.doctor;


import com.esolutions.msystem.Appointment.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    private List<Appointment> appointments = Arrays.asList(new Appointment("ss", "1","1","1","2", true));

    private List<Doctor> doctorsList = Arrays.asList(new Doctor("1", "Abbass", "123", "radiology", appointments),
            new Doctor("2", "Fernass", "123", "dermatology", appointments),
            new Doctor("3", "Abbass ibn fernass", "123", "gastro", appointments));

    public List<Doctor> getAllDoctors(){
        List<Doctor> doctors = new ArrayList<>();
        doctorRepository.findAll().forEach(doctors::add);
        return doctors;
    }

    public Doctor getDoctor(String id){
        //get doctor by name or id
        return doctorsList.stream().filter(doctor -> doctor.getDoctorId().equals(id)).findAny().get();
    }

    public void addDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }

}
