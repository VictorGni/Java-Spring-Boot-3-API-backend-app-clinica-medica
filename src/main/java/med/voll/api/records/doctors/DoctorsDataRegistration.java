package med.voll.api.records.doctors;

import com.fasterxml.jackson.annotation.JsonProperty;


import med.voll.api.enums.DoctorSpecialty;
import med.voll.api.records.DataAddress;


public record DoctorsDataRegistration(
        String name,
        String email,
        String crm,
        DoctorSpecialty specialty,
        DataAddress dataAddress){

    @Override
    public String toString() {
        return "DoctorsDataRegistration{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", crm='" + crm + '\'' +
                ", specialty=" + specialty +
                ", dataAddress=" + dataAddress +
                '}';
    }
}




