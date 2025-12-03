package com.miempresa.orders;

import java.math.BigDecimal;

public class TaxCalculator {

    private final BigDecimal taxRate;

    public TaxCalculator(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal calculateTax(BigDecimal baseAmount) {
        if (baseAmount == null || baseAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Base amount must be positive");
        }
        return baseAmount.multiply(taxRate);
    }
}
