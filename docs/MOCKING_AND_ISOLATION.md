# Mocking y aislamiento de dependencias

Las pruebas unitarias deben aislar la clase bajo prueba usando mocks.

## Herramientas

- **Mockito** para mocks y stubs.
- Anotaciones recomendadas:
  - `@ExtendWith(MockitoExtension.class)`
  - `@Mock`
  - `@InjectMocks`

## Ejemplo de patrón básico

1. **Arrange**: configurar mocks y datos de entrada.
2. **Act**: invocar el método a probar.
3. **Assert**: verificar el resultado y la interacción con dependencias.

Evita:

- Hacer asserts sobre muchas cosas a la vez.
- Probar varias responsabilidades en un solo test.
