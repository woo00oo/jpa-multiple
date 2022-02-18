package com.example.multiple.domain.eximbay;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Merchant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String merchantName;

    private String merchantType;

    @Builder
    public Merchant(String merchantName, String merchantType) {
        this.merchantName = merchantName;
        this.merchantType = merchantType;
    }
}
