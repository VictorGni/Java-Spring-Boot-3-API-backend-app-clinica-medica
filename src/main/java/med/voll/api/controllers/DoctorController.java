package med.voll.api.controllers;


import med.voll.api.records.doctors.DoctorsDataRegistration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registerDoctor")
public class DoctorController {

    @PostMapping
    public void registerDoctorInDataBase(@RequestBody DoctorsDataRegistration doctorsDataRegistration){

    }
}
