package com.example.multiple.repository.eximbay;

import com.example.multiple.domain.eximbay.Transact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactRepository extends JpaRepository<Transact, Long> {
}
