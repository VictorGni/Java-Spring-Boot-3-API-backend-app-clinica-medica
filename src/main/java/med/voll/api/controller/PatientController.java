package med.voll.api.controller;


import med.voll.api.records.patient.PatientDataRegistration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registerPatient")
public class PatientController {


    @PostMapping
    public void registerPatientInDataBase(@RequestBody PatientDataRegistration patientDataRegistration){
        System.out.println(patientDataRegistration.toString());
    }
}
