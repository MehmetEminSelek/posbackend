package com.example.pos.Response.Register;


import com.example.pos.Entity.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreateCompanyResponse {

    private String companyTitle;

    private String companyType;

    private String companyName;

    private String brandName;

    private String mersisNo;

    private String ticaretOdası;

    private String kepAddress;

    private String taxOffice;

    private String taxNumber;

    private String address;

    private String addressDetail;

    public CreateCompanyResponse(Company company) {
        this.companyTitle = company.getCompanyTitle();
        this.companyType = company.getCompanyType();
        this.companyName = company.getCompanyName();
        this.brandName = company.getBrandName();
        this.mersisNo = company.getMersisNo();
        this.ticaretOdası = company.getTicaretOdası();
        this.kepAddress = company.getKepAddress();
        this.taxOffice = company.getTaxOffice();
        this.taxNumber = company.getTaxOfficeNumber();
        this.address = company.getAddress();
        this.addressDetail = company.getAddressDetail();
    }
}
