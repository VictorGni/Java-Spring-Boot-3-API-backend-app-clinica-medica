package med.voll.api.records.doctors;

import med.voll.api.domain.DoctorEntity;
import med.voll.api.enums.DoctorSpecialty;

public record DoctorDataList(
        String name,
        String email,
        String crm,
        DoctorSpecialty specialty,
        Long id) {

    public DoctorDataList (DoctorEntity doctorEntity){
        this(doctorEntity.getName(),
            doctorEntity.getEmail(),
            doctorEntity.getCrm(),
            doctorEntity.getDoctorSpecialty(),
            doctorEntity.getId());
    }
}


