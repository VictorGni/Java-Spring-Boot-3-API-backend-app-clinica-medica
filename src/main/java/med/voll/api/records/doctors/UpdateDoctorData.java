package med.voll.api.records.doctors;

import jakarta.validation.constraints.NotNull;
import med.voll.api.records.AddressDto;

public record UpdateDoctorData(
        @NotNull
        Long id,
        String name,
        String cellPhone,
        AddressDto addressDto
) {
}
