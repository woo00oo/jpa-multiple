package com.example.multiple.repository.eximbay;

import com.example.multiple.domain.eximbay.Merchant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class MerchantRepositoryTest {

    @Autowired
    MerchantRepository merchantRepository;

    @Test
    void merchantInsert() {

        Merchant merchant = Merchant.builder()
                .merchantName("name")
                .merchantType("C000")
                .build();

        merchantRepository.save(merchant);
    }

}