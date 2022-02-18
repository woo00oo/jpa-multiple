package com.example.multiple.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ChainedTransactDBConfig {

    @Bean
    @Primary
    public PlatformTransactionManager transactionManager(PlatformTransactionManager txManager1, PlatformTransactionManager txManger2) {
        return new ChainedTransactionManager(txManager1, txManger2);
    }
}
