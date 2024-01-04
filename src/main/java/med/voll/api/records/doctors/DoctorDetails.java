package med.voll.api.records.doctors;

import med.voll.api.domain.Address;
import med.voll.api.domain.DoctorEntity;
import med.voll.api.enums.DoctorSpecialty;

public record DoctorDetails(Long id, String name, String email, String crm, String cellphone, DoctorSpecialty specialty, Address address) {

    public DoctorDetails(DoctorEntity doctor){
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getCellphone(), doctor.getDoctorSpecialty(), doctor.getAddress());
    }
}
