package com.example.pos.Response.Register;


import com.example.pos.Entity.PersonalInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreatePersonalInfoResponse {

    private String name;

    private String surname;

    private String title;

    private String phoneNumber;

    private String phoneNumber2;

    private String email;

    private String address;

    private String postalCode;

    private Boolean isAuthorized;

    public CreatePersonalInfoResponse(PersonalInfo personalInfo) {
        this.name = personalInfo.getName();
        this.surname = personalInfo.getSurname();
        this.title = personalInfo.getTitle();
        this.phoneNumber = personalInfo.getPhoneNumber();
        this.phoneNumber2 = personalInfo.getPhoneNumber2();
        this.email = personalInfo.getEmail();
        this.address = personalInfo.getAddress();
        this.postalCode = personalInfo.getPostalCode();
        this.isAuthorized = personalInfo.getIsAuthorized();
    }
}
