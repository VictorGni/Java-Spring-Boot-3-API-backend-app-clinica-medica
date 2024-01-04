package med.voll.api.controllers;


import jakarta.validation.Valid;
import med.voll.api.domain.DoctorEntity;
import med.voll.api.records.doctors.DoctorDataList;
import med.voll.api.records.doctors.DoctorDetails;
import med.voll.api.records.doctors.DoctorsDataRegistration;
import med.voll.api.records.doctors.UpdateDoctorData;
import med.voll.api.repositorys.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    @Transactional
    public ResponseEntity registerDoctorInDataBase(@RequestBody @Valid DoctorsDataRegistration doctorsDataRegistration){
        try {
            doctorRepository.save(new DoctorEntity(doctorsDataRegistration));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @GetMapping(path = "/list")
    public ResponseEntity<Page<DoctorDataList>> getListOfDoctorsData(@PageableDefault(size = 10, sort = {"name"}) Pageable pagination){
        var page =  doctorRepository.findAllByActiveTrue(pagination).map(DoctorDataList::new);
        return  ResponseEntity.ok(page);
    }

    @PutMapping(path = "/update")
    @Transactional
    public ResponseEntity updateDoctorData(@RequestBody @Valid UpdateDoctorData updateDoctorData){
        var doctorEntity = doctorRepository.getReferenceById(updateDoctorData.id());
        doctorEntity.updateData(updateDoctorData);

        return ResponseEntity.ok(new DoctorDetails(doctorEntity));
    }

    @DeleteMapping(path = "/delete/{id}")
    @Transactional
    public ResponseEntity deleteDoctorData(@PathVariable Long id ){
        var doctorEntity = doctorRepository.getReferenceById(id);
        doctorEntity.inactivate(id);

        return ResponseEntity.noContent().build();
    }

}
