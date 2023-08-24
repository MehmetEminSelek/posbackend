package com.example.pos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "COMPANY")
@Getter
@Setter
@RequiredArgsConstructor
public class Company {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_COMPANY", sequenceName = "SEQ_BANK", allocationSize = 1)
    @GeneratedValue(generator = "GEN_BANK", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "COMPANY_NAME", nullable = false)
    private String companyName;

    @Column(name = "COMPANY_TYPE", nullable = false)
    private String companyType;

    @Column(name = "BUSSINESS_NAME", nullable = false)
    private String bussinessName;

    @Column(name = "BRAND_NAME", nullable = false)
    private String brandName;

    @Column(name = "MERSIS_NO", nullable = false)
    private String mersisNo;

    @Column(name = "TAX_OFFICE", nullable = false)
    private String tradeBranch;

    @Column(name = "TAX_OFFICE_NUMBER", nullable = false)
    private String taxOfficeNumber;

    @Column(name = "KEP_ADDRESS", nullable = false)
    private String kepAddress;


}
