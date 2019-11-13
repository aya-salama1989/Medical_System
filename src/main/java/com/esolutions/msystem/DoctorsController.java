package com.esolutions.msystem;

import com.esolutions.msystem.doctor.Doctor;
import com.esolutions.msystem.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorsController {




    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Doctor add(@RequestBody Doctor obj) {
//        return doctorService.addDoctor(obj);
        return obj;
    }

}
