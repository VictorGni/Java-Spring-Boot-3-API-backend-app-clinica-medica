package med.voll.api.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DoctorSpecialty {

    @JsonProperty("orthopedics")
    ORTHOPEDICS,
    @JsonProperty("cardiology")
    CARDIOLOGY,
    @JsonProperty("gynecology")
    GYNECOLOGY,
    @JsonProperty("dermatology")
    DERMATOLOGY;
}
