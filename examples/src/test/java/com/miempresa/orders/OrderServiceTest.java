package com.miempresa.orders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    private TaxCalculator taxCalculator;

    @InjectMocks
    private OrderService orderService;

    @Test
    void shouldCalculateTotal_whenItemsAreValid() {
        // Arrange
        List<BigDecimal> items = Arrays.asList(
                new BigDecimal("100.00"),
                new BigDecimal("50.00")
        );
        BigDecimal subtotal = new BigDecimal("150.00");
        BigDecimal expectedTax = new BigDecimal("24.00"); // 16% de IVA
        BigDecimal expectedTotal = subtotal.add(expectedTax);

        when(taxCalculator.calculateTax(subtotal)).thenReturn(expectedTax);

        // Act
        BigDecimal total = orderService.calculateTotal(items);

        // Assert
        assertThat(total).isEqualByComparingTo(expectedTotal);
    }

    @Test
    void shouldThrowException_whenItemsListIsEmpty() {
        // Arrange
        List<BigDecimal> items = List.of();

        // Act & Assert
        assertThatThrownBy(() -> orderService.calculateTotal(items))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Items list must not be empty");
    }
}
