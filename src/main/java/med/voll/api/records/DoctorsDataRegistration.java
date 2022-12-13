package med.voll.api.records;

import com.fasterxml.jackson.annotation.JsonProperty;


import med.voll.api.enums.DoctorSpecialty;


public record DoctorsDataRegistration(
        String name,
        String email,
        String crm,
        DoctorSpecialty specialty,
        @JsonProperty("address")
        DataAddress dataAddress) {
}
