package com.esolutions.msystem.appointment;


import com.esolutions.msystem.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public Appointment addAppoinement(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }


    public Iterable<Appointment> all() {
        return appointmentRepository.findAll();
    }

    public Iterable<Appointment> all(Long id) {
        return appointmentRepository.findAllByDoctor(id);
    }

}
