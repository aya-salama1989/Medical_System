package com.esolutions.msystem.Appointment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public void addAppoinement(Appointment appointment){
        appointmentRepository.save(appointment);
    }


    public void getAppoitment(){

    }
}
