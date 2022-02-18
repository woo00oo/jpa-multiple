package com.example.multiple.domain.eximbay;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Transact {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String amt;

    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    private Merchant merchant;

    @Builder
    public Transact(String amt, String currency, Merchant merchant) {
        this.amt = amt;
        this.currency = currency;
        this.merchant = merchant;
    }
}
