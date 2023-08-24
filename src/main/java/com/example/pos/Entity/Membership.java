package com.example.pos.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "MEMBERSHIP")
@Getter
@Setter
@RequiredArgsConstructor
public class Membership {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_MEMBERSHIP", sequenceName = "SEQ_MEMBERSHIP", allocationSize = 1)
    @GeneratedValue(generator = "GEN_MEMBERSHIP", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "MEMBERSHIP_NAME", nullable = false)
    private String membershipName;

    @OneToMany(mappedBy = "membership")
    private Set<UserInfo> userInfoSet;
}
