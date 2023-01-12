package med.voll.api.domain;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.records.AddressDto;


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

    public Address(AddressDto addressDto) {
        this.publicPlace = addressDto.publicPlace();
        this.district = addressDto.district();
        this.zipCode = addressDto.zipCode();
        this.city = addressDto.city();
        this.uf = addressDto.uf();
        this.number = addressDto.number();
        this.complementAddress = addressDto.complementAddress();
    }

    public void updateAdsressData(AddressDto addressDto) {
        if(addressDto.publicPlace() != null){
            this.publicPlace = addressDto.publicPlace();
        }
        if(addressDto.district() != null){
            this.district = addressDto.district();
        }
        if(addressDto.zipCode() != null){
            this.zipCode = addressDto.zipCode();
        }
        if(addressDto.city() != null){
            this.city = addressDto.city();
        }
        if(addressDto.uf() != null){
            this.uf = addressDto.uf();
        }
        if(addressDto.number() != null){
            this.number = addressDto.number();
        }
        if(addressDto.complementAddress() != null){
            this.complementAddress = addressDto.complementAddress();
        }
    }
}
