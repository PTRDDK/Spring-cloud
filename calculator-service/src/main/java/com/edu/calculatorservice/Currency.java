package com.edu.calculatorservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Currency {

    private Long id;
    private String currencyFrom;
    private Double rate;
    private String currencyTo;
}
