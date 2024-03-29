package med.voll.api.records.doctors;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.enums.DoctorSpecialty;
import med.voll.api.records.AddressDto;


public record DoctorsDataRegistration(
        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotBlank
        String cellphone,

        @NotNull
        DoctorSpecialty specialty,

        @NotNull
        @Valid
        AddressDto addressDto){

}




