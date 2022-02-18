package com.example.multiple.domain.eximgw;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class KICCTransact {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String amount;

    private String cardCode;

    @Builder
    public KICCTransact(String amount, String cardCode) {
        this.amount = amount;
        this.cardCode = cardCode;
    }
}
