package com.example.pos.Request.Register;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreatePersonalInfoRequest {

private String name;

    private String surname;

    private String title;

    private String phoneNumber;

    private String phoneNumber2;

    private String email;

    private String address;

    private String postalCode;

    private Boolean isAuthorized;
}
