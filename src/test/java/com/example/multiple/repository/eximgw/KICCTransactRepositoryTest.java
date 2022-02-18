package com.example.multiple.repository.eximgw;

import com.example.multiple.domain.eximgw.KICCTransact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(value = false)
class KICCTransactRepositoryTest {

    @Autowired
    KICCTransactRepository kiccTransactRepository;

    @Test
    void KICCInsert() {

        kiccTransactRepository.save(KICCTransact.builder()
                        .amount("100")
                        .cardCode("cc")
                        .build());
    }

}