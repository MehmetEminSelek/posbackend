package com.example.pos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "PERSONAL_INFO")
@Getter
@Setter
@RequiredArgsConstructor
public class PersonalInfo {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_PERSONAL_INFO", sequenceName = "SEQ_PERSONAL_INFO", allocationSize = 1)
    @GeneratedValue(generator = "GEN_PERSONAL_INFO", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @Column(name = "PHONE_NUMBER_2", nullable = false)
    private String phoneNumber2;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "DISTRICT", nullable = false)
    private String district;

    @Column(name = "POSTAL_CODE", nullable = false)
    private String postalCode;

    @Column(name = "TITLE", nullable = false)
    private String title;

}
