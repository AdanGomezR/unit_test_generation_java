# Convenciones de nombres para pruebas unitarias

## Nombres de clases de test

- Para `OrderService` → `OrderServiceTest`
- Para `OrderController` → `OrderControllerTest`

Ubicación:

- `src/test/java/.../OrderServiceTest.java`

## Nombres de métodos de test

Se recomienda usar formato:

- `shouldDoSomething_whenCondition`
- `shouldCalculateTotal_whenItemsAreValid`
- `shouldThrowException_whenInputIsNull`

Reglas:

- Iniciar con `should`.
- Incluir la acción principal.
- Incluir la condición relevante (`when...`).

## Nombres de mocks y datos

- Mocks: `orderRepository`, `paymentClient`.
- Datos: `order`, `customer`, `request`.

Copilot debe seguir estas convenciones al crear nuevos tests.
