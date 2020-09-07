package com.edu.currencyservice;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CurrencyRepository extends CrudRepository<Currency, String> {

    Optional<Currency> findByCurrencyFromAndCurrencyTo(String from, String to);

    void deleteByCurrencyFromAndCurrencyTo(String from, String to);
}
