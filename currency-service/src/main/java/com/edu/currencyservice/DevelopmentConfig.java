package com.edu.currencyservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(CurrencyRepository repository) {
        return args -> {
            log.info("Start loading data to DB.");
            repository.save(new Currency(1L, "USD", 0.5, "EUR"));
            repository.save(new Currency(2L, "EUR", 1.5, "USD"));
            repository.save(new Currency(3L, "PLN", 1.5, "USD"));
            repository.save(new Currency(4L, "USD", 1.5, "PLN"));
            repository.save(new Currency(5L, "PLN", 1.5, "EUR"));
            repository.save(new Currency(6L, "EUR", 1.5, "PLN"));
            log.info("End loading data to DB.");
        };
    }
}
