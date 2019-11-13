package com.esolutions.msystem.appointment;


import com.esolutions.msystem.doctor.Doctor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@Entity
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientId;

    @ManyToOne
    private Doctor doctor;
    private String startDate;
    private String endDate;
    private boolean valid;


}
