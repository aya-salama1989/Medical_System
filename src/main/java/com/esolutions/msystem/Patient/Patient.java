package com.esolutions.msystem.Patient;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String patientId;

    @NotEmpty
    private String patientName;

    @NotEmpty
    private String patientPassword;

    private String diagnosis;

    public Patient() {
    }

    public Patient(String patientId, String patientName, String patientPassword, String diagnosis) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientPassword = patientPassword;
        this.diagnosis = diagnosis;
    }


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
