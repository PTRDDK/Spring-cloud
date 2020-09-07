package com.edu.currencyservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyDTO {

    private Long id;

    private String currencyFrom;

    private Double rate;

    private String currencyTo;

    public CurrencyDTO getCurrency(Currency currency) {
        CurrencyDTO currencyDTO = new CurrencyDTO();
        currencyDTO.setId(currency.getId());
        currencyDTO.setCurrencyFrom(currency.getCurrencyFrom());
        currencyDTO.setCurrencyTo(currency.getCurrencyTo());
        currencyDTO.setRate(currency.getRate());
        return currencyDTO;
    }
}
