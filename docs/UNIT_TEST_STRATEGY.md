# Estrategia de pruebas unitarias (Java + Spring Boot)

Esta guía define cómo deben plantearse las pruebas unitarias.

## Objetivos

- Validar la lógica de negocio de forma aislada.
- Detectar errores rápido (pipeline local / CI).
- Ser base de confianza para los reportes de pruebas (JUnit + JaCoCo).

## Alcance de las pruebas unitarias

Se deben cubrir principalmente:

- Servicios (clases con lógica de negocio).
- Componentes reutilizables.
- Mappers / transformadores.
- Reglas de negocio complejas.

Los tests NO deben:

- Depender de bases de datos reales.
- Invocar servicios externos reales.
- Tener lógica compleja dentro del propio test.

## Principios

- Rápidos: deben ejecutarse en segundos.
- Deterministas: mismo resultado ante misma entrada.
- Independientes: no dependen del orden de ejecución.
- Repetibles: idénticos resultados en cualquier entorno.

Usa esta guía como referencia al pedirle a Copilot que genere pruebas.
