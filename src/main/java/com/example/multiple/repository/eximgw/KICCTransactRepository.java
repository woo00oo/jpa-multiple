package com.example.multiple.repository.eximgw;

import com.example.multiple.domain.eximgw.KICCTransact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KICCTransactRepository extends JpaRepository<KICCTransact, Long> {
}
