package com.miempresa.orders;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TaxCalculatorTest {

    @Test
    void shouldCalculateTax_whenBaseAmountIsPositive() {
        // Arrange
        BigDecimal taxRate = new BigDecimal("0.16");
        TaxCalculator calculator = new TaxCalculator(taxRate);

        BigDecimal baseAmount = new BigDecimal("100.00");

        // Act
        BigDecimal tax = calculator.calculateTax(baseAmount);

        // Assert
        assertThat(tax).isEqualByComparingTo("16.00");
    }

    @Test
    void shouldThrowException_whenBaseAmountIsNegative() {
        // Arrange
        BigDecimal taxRate = new BigDecimal("0.16");
        TaxCalculator calculator = new TaxCalculator(taxRate);

        BigDecimal baseAmount = new BigDecimal("-1.00");

        // Act & Assert
        assertThatThrownBy(() -> calculator.calculateTax(baseAmount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Base amount must be positive");
    }
}
