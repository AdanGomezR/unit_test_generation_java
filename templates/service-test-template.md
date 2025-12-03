# Plantilla para tests de servicios

Objetivo: servir de guía para que Copilot genere tests para servicios
de negocio (clases `@Service` de Spring).

Reglas principales:
- Usar `@ExtendWith(MockitoExtension.class)`.
- Mockear repositorios y clientes externos.
- Probar solo la lógica de negocio del servicio.
- Usar nombres de métodos tipo `shouldX_whenY`.

Usa esta plantilla como referencia textual dentro de tus prompts.
