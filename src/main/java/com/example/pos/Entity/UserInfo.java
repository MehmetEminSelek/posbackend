package com.example.pos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "USER_INFO")
@Getter
@Setter
@RequiredArgsConstructor
public class UserInfo {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_PERSONAL_INFO", sequenceName = "SEQ_PERSONAL_INFO", allocationSize = 1)
    @GeneratedValue(generator = "GEN_PERSONAL_INFO", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "USERNAME", nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "SHOP_NAME", nullable = false)
    private String shopName;

    @Column(name = "SHOP_URL", nullable = false)
    private String shopUrl;

    @ManyToOne()
    @JoinColumn(name = "MEMBERSHIP_ID")
    private Membership membership;

}
