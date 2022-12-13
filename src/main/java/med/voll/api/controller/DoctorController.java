package med.voll.api.controller;


import med.voll.api.records.DoctorsDataRegistration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RegisterDoctor")
public class DoctorController {

    @PostMapping
    public void registerDoctorInDataBase(@RequestBody DoctorsDataRegistration doctorsDataRegistration){

    }
}
