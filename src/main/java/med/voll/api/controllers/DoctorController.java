package med.voll.api.controllers;


import jakarta.validation.Valid;
import med.voll.api.domain.Address;
import med.voll.api.domain.DoctorEntity;
import med.voll.api.records.doctors.DoctorDataList;
import med.voll.api.records.doctors.DoctorsDataRegistration;
import med.voll.api.records.doctors.UpdateDoctorData;
import med.voll.api.repositorys.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
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

    @GetMapping(path = "/list")
    public Page<DoctorDataList> getListOfDoctorsData(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination){
        return doctorRepository.findAll(pagination).map(DoctorDataList::new);
    }

    @PutMapping(path = "/update")
    @Transactional
    public void updateDoctorData(@RequestBody @Valid UpdateDoctorData updateDoctorData){
        var doctorEntity = doctorRepository.getReferenceById(updateDoctorData.id());
        doctorEntity.updateData(updateDoctorData);
    }

}
