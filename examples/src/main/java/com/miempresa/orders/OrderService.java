package com.miempresa.orders;

import java.math.BigDecimal;
import java.util.List;

public class OrderService {

    private final TaxCalculator taxCalculator;

    public OrderService(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public BigDecimal calculateTotal(List<BigDecimal> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Items list must not be empty");
        }

        BigDecimal subtotal = items.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal tax = taxCalculator.calculateTax(subtotal);

        return subtotal.add(tax);
    }
}
