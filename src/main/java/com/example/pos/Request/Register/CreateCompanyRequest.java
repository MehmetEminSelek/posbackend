package com.example.pos.Request.Register;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreateCompanyRequest {

    private String companyName;

    private String companyTitle;

    private String companyType;

    private String brandName;

    private String mersisNo;

    private String ticaretOdası;

    private String kepAddress;

    private String taxOffice;

    private String taxNumber;

    private String address;

    private String addressDetail;
}
