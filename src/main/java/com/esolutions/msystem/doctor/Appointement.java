package com.esolutions.msystem.doctor;


import java.util.Date;

public class Appointement {
    private Date startDate;
    private Date endDate;
    private boolean valid;

    public Appointement(Date startDate, Date endDate, boolean valid) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.valid = valid;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
