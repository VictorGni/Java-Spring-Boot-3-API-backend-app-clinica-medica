package med.voll.api.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDto(
        @NotBlank
        String publicPlace,

        @NotBlank
        String district,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String zipCode,

        @NotBlank
        String city,

        @NotBlank
        String uf,

        String number,

        String complementAddress) {
}
