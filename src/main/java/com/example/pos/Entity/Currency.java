package com.example.pos.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CURRENCIES")
@Getter
@Setter
@RequiredArgsConstructor
public class Currency {

    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_CURRENCY", sequenceName = "SEQ_CURRENCY", allocationSize = 1)
    @GeneratedValue(generator = "GEN_CURRENCY", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "CURRENCY_VALUE_LONG", nullable = false)
    private String currencyValueLong;

    @Column(name = "CURRENCY_VALUE", nullable = false)
    private String currencyValue;

}