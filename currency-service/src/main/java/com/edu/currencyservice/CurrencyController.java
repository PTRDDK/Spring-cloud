package com.edu.currencyservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/currency-rate", produces = "application/json")
@Slf4j
public class CurrencyController {

    private CurrencyRepository repository;
    private CurrencyService service;

    @Autowired
    public CurrencyController(CurrencyRepository repository, CurrencyService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/{from}/{to}")
    public ResponseEntity<Currency> getCurrencyRate(@PathVariable("from") String from, @PathVariable("to") String to) {
        log.info("Request for rate from {} to {}", from, to);
        service.sendMessage(repository.findByCurrencyFromAndCurrencyTo(from, to).get());
        return new ResponseEntity<Currency>(repository.findByCurrencyFromAndCurrencyTo(from, to).get(), HttpStatus.OK);
    }

    @PostMapping("/{from}/{to}/{rate}")
    public ResponseEntity postCurrencyRate(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("rate") Double rate) {
        log.info("Request to add currencyFrom {} rate {} currnecyTo {}", from, rate, to);
        service.sendMessage(new Currency(5L, "PLN", 12.0, "KOR"));
        repository.save(new Currency(5L, "PLN", 12.0, "KOR"));
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{from}/{to}")
    public ResponseEntity deleteCurrencyRate(@PathVariable("from") String from, @PathVariable("to") String to) {
        log.info("Request to delete currencyFrom {} and currencyTo {}", from, to);
        service.sendMessage(repository.findByCurrencyFromAndCurrencyTo(from, to).get());
        repository.deleteByCurrencyFromAndCurrencyTo(from, to);
        return new ResponseEntity(HttpStatus.OK);
    }
}
