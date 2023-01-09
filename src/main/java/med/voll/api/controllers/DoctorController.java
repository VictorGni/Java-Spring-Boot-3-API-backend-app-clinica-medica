package med.voll.api.controllers;


import jakarta.validation.Valid;
import med.voll.api.domain.Address;
import med.voll.api.domain.DoctorEntity;
import med.voll.api.records.doctors.DoctorsDataRegistration;
import med.voll.api.repositorys.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registerDoctor")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    @Transactional
    public void registerDoctorInDataBase(@RequestBody @Valid DoctorsDataRegistration doctorsDataRegistration){
        try {
            doctorRepository.save(new DoctorEntity(doctorsDataRegistration));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
