package com.Customer.wallet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction
{
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name = "walletId", nullable = false)
    private Long walletId;

    @Column(name = "transactionType", nullable = false)
    @Enumerated(EnumType.STRING)
    private String transactionType;

    @Column(name = "amount",precision =5,scale = 2, nullable = false)
    private BigDecimal amount=BigDecimal.ZERO;


    @Column(name = "reference_id", length = 100, nullable = false)
    private Long referenceId;


    @Column(name = "balance_after", nullable = false, precision = 5, scale = 2)
    private BigDecimal balanceAfter;

    @Column(name = "remarks", length = 255)
    private String remarks;

    @Column(name = "timeStamp", nullable = false)
    private LocalDateTime timestamp;
}
