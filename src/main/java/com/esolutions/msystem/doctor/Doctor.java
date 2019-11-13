package com.esolutions.msystem.doctor;


import com.esolutions.msystem.Appointment.Appointment;

import javax.persistence.*;
import java.util.List;


@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String doctorId;
    private String doctorName;
    private String password;
    private String specialization;

    @ManyToMany
    private List<Appointment> validDates;

    public Doctor() {
    }

    public Doctor(String doctorId, String doctorName, String password, String specialization, List<Appointment> validDates) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.password = password;
        this.specialization = specialization;
        this.validDates = validDates;
    }


    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Appointment> getValidDates() {
        return validDates;
    }

    public void setValidDates(List<Appointment> validDates) {
        this.validDates = validDates;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

