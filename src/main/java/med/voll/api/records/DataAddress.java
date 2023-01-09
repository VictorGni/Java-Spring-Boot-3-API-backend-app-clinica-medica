package med.voll.api.records;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DataAddress(

        String publicPlace,
        String district,
        String zipCode,
        String city,
        String uf,
        String number,
        String complementAddress) {
}
