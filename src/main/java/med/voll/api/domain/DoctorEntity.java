package med.voll.api.domain;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.enums.DoctorSpecialty;
import med.voll.api.records.doctors.DoctorsDataRegistration;

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
    @Enumerated(EnumType.STRING)
    private DoctorSpecialty doctorSpecialty;

    @Embedded
    private Address address;

    public DoctorEntity(DoctorsDataRegistration doctorsDataRegistration) {
        this.name = doctorsDataRegistration.name();
        this.email = doctorsDataRegistration.email();
        this.crm = doctorsDataRegistration.crm();
        this.doctorSpecialty = doctorsDataRegistration.specialty();
        this.address = new Address(doctorsDataRegistration.dataAddress());
    }
}
