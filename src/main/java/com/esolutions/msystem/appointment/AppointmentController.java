package com.esolutions.msystem.appointment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @PostMapping
    public Appointment add(@RequestBody Appointment appointment) {
        return appointmentService.addAppoinement(appointment);
    }

}
