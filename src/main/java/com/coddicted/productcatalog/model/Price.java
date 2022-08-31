package com.coddicted.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Price {
    public BigDecimal value;
    public CurrencyCode currencyCode;
}
