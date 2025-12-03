# Plantilla para tests de controladores

Dos enfoques:

1. **Unit test puro del controlador**:
   - Mockear servicios.
   - Instanciar el controlador y probar métodos directamente.

2. **Test MVC con `@WebMvcTest`**:
   - Arranca un slice de Spring MVC.
   - Usa `MockMvc` para simular peticiones HTTP.

Recomendación:
- Para lógica sencilla en controladores, preferir unit test puro.
- Usar `@WebMvcTest` cuando se requiera validar mapeo de rutas, status codes, etc.
