package med.voll.api.domain;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.records.DataAddress;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String publicPlace;
    private String district;
    private String zipCode;
    private String city;
    private String uf;
    private String number;
    private String complementAddress;

    public Address(DataAddress dataAddress) {
        this.publicPlace = dataAddress.publicPlace();
        this.district = dataAddress.district();
        this.zipCode = dataAddress.zipCode();
        this.city = dataAddress.city();
        this.uf = dataAddress.uf();
        this.number = dataAddress.number();
        this.complementAddress = dataAddress.complementAddress();
    }
}
