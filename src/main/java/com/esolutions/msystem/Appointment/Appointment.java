package com.esolutions.msystem.Appointment;


import com.esolutions.msystem.doctor.Doctor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Appointment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String patientId;

    @ManyToOne
    private Doctor doctor;
    private String startDate;
    private String endDate;
    private boolean valid;


    public Appointment(){

    }
    public Appointment(String id, String patientId, Doctor doctor, String startDate, String endDate, boolean valid) {
        this.id = id;
        this.patientId = patientId;
        this.doctor = doctor;
        this.startDate = startDate;
        this.endDate = endDate;
        this.valid = valid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
