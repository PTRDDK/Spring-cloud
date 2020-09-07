package com.edu.currencyservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Currency {

    @Id
    private Long id;

    private String currencyFrom;

    private Double rate;

    private String currencyTo;
}
