package com.example.multiple.repository.eximbay;

import com.example.multiple.domain.eximbay.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
