package com.esolutions.msystem.patient;

import com.esolutions.msystem.appointment.Appointment;
import com.esolutions.msystem.appointment.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/patients")
    public Patient registerPatient(@RequestBody Patient patient){
        return patientService.add(patient);
    }

    @PostMapping("/patients/setAppointment")
    public Appointment setAppointment(@RequestBody Appointment appointment){
        return appointmentService.book(appointment);
    }


}
