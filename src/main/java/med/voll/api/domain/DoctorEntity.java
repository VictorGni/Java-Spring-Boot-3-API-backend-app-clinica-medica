package med.voll.api.domain;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.enums.DoctorSpecialty;
import med.voll.api.records.doctors.DoctorsDataRegistration;
import med.voll.api.records.doctors.UpdateDoctorData;

@ToString
@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    private String cellphone;
    @Enumerated(EnumType.STRING)
    private DoctorSpecialty doctorSpecialty;

    @Embedded
    private Address address;

    public DoctorEntity(DoctorsDataRegistration doctorsDataRegistration) {
        this.name = doctorsDataRegistration.name();
        this.email = doctorsDataRegistration.email();
        this.crm = doctorsDataRegistration.crm();
        this.cellphone = doctorsDataRegistration.cellphone();
        this.doctorSpecialty = doctorsDataRegistration.specialty();
        this.address = new Address(doctorsDataRegistration.addressDto());
    }

    public void updateData(UpdateDoctorData updateDoctorData) {
        if(updateDoctorData.name() != null){
            this.name = updateDoctorData.name();
        }
        if(updateDoctorData.cellPhone() != null){
            this.cellphone = updateDoctorData.cellPhone();
        }
        if(updateDoctorData.addressDto() != null){
            this.address.updateAdsressData(updateDoctorData.addressDto());
        }
    }
}
