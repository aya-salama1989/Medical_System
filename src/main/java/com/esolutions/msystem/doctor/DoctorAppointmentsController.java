package com.esolutions.msystem.doctor;


import com.esolutions.msystem.appointment.Appointment;
import com.esolutions.msystem.appointment.AppointmentService;
import com.esolutions.msystem.patient.Patient;
import com.esolutions.msystem.patient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors/{doctorId}/appointments")
public class DoctorAppointmentsController {

    @Autowired
    private DoctorService service;
    @Autowired
    private AppointmentService appointmentService;


    @GetMapping
    public Iterable<Appointment> all(@PathVariable Long doctorId) {
        return appointmentService.all(doctorId);
    }

    @PostMapping
    public Doctor add(@RequestBody Doctor doctor) throws Exception {
        return service.addDoctor(doctor);
    }



}
// resources/users POST (inserts new user)
// resources/users GET (returns all users)
// resources/users/{id} PUT
// resources/users/{id} PATCH
// resources/users/{id} DELETE
