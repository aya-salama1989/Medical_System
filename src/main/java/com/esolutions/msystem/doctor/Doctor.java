package com.esolutions.msystem.doctor;


import com.esolutions.msystem.register.User;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {

    private String specialization;
    private List<Appointement> validDates;

    public Doctor(String specialization) {
        this.specialization = specialization;
    }

    public Doctor(String userId, String userName, String password, String specialization, List<Appointement> validDates) {
        super(userId, userName, password, UserType.Doctor);
        this.specialization = specialization;
        this.validDates = validDates;
    }


    public List<Appointement> getValidDates() {
        return validDates;
    }

    public void setValidDates(List<Appointement> validDates) {
        this.validDates = validDates;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

