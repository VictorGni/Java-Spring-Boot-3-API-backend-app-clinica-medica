package med.voll.api.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DataAddress(

        @JsonProperty("public_place")
        String publicPlace,
        String district,
        @JsonProperty("zip_code")
        String zipCode,
        String city,
        String uf,
        String number,
        @JsonProperty("complement_address")
        String complementAddress) {
}
