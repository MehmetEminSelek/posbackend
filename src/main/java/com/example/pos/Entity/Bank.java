package com.example.pos.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BANK")
@Getter
@Setter
@RequiredArgsConstructor
public class Bank {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_BANK", sequenceName = "SEQ_BANK", allocationSize = 1)
    @GeneratedValue(generator = "GEN_BANK", strategy = GenerationType.SEQUENCE)
    private Integer id;
}
