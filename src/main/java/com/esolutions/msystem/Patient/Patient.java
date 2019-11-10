package com.esolutions.msystem.Patient;

import com.esolutions.msystem.register.User;

public class Patient extends User {
    private String diagnosis;

    public Patient() {
    }

    public Patient(String userId, String userName, String password, String diagnosis) {
        super(userId, userName, password, UserType.Patient);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
