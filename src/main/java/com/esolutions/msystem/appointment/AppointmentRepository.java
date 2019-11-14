package com.esolutions.msystem.appointment;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AppointmentRepository extends CrudRepository<Appointment, String> {

    @Query("select a from appointments a where a.doctor.id=:id")
    Iterable<Appointment> findAllByDoctor(@Param("id") Long doctorId);



}
