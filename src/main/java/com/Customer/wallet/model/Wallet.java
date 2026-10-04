package com.Customer.wallet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "wallet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Wallet
{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name="userId",nullable = false)
    private Long userId;

    @Column(name = "balance",precision = 5,scale = 2,nullable = false)
    private BigDecimal balance=BigDecimal.ZERO;

    @Column(name = "currency",nullable = false)
    @Enumerated(EnumType.STRING)
    private String currency;

    @Column(name = "createdDate",nullable = false)
    private LocalDateTime localDateTime;

    @Column(name = "updatedDate",nullable = false)
    private LocalDateTime updatedTime;

    @Column(name = "walletStatus",nullable = false)
    @Enumerated(EnumType.STRING)
    private String walletStatus;

}
