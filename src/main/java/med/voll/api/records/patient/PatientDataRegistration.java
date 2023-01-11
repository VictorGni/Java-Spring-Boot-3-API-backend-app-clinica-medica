package med.voll.api.records.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import med.voll.api.records.AddressDto;

public record PatientDataRegistration(
        String name,
        String email,
        @JsonProperty("phone_number")
        String phoneNumber,
        String cpf,
        @JsonProperty("address")
        AddressDto address
) {

}
