package com.esolutions.msystem.appointment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public Appointment addAppoinement(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment book(Appointment appointment) {
        Appointment app = appointmentRepository.findById(appointment.getId()).get();
        if (app.isValid() && app.getPatient() != null) {
            return appointmentRepository.save(appointment);
        } else {
            return app;
        }
    }


    public Iterable<Appointment> all() {
        return appointmentRepository.findAll();
    }

    public Iterable<Appointment> all(Long id) {
        return appointmentRepository.findAllByDoctor(id);
    }

}
