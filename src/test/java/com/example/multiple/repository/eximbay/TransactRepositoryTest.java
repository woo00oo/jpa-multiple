package com.example.multiple.repository.eximbay;

import com.example.multiple.domain.eximbay.Merchant;
import com.example.multiple.domain.eximbay.Transact;
import com.example.multiple.domain.eximgw.KICCTransact;
import com.example.multiple.repository.eximgw.KICCTransactRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class TransactRepositoryTest {

    @Autowired
    private TransactRepository transactRepository;

    @Autowired
    private MerchantRepository merchantRepository;

    @Autowired
    private KICCTransactRepository kiccTransactRepository;

    @Autowired
    private EntityManager em;

    @Test
    void transactInsert() {

        Merchant mer = Merchant.builder()
                .merchantName("가맹점1")
                .merchantType("쇼핑몰")
                .build();
        merchantRepository.save(mer);

        transactRepository.save(Transact.builder()
                .amt("3000")
                .currency("USA")
                .merchant(mer)
                .build());

        kiccTransactRepository.save(KICCTransact.builder()
                .amount("33")
                .cardCode("CC")
                .build());

    }

}