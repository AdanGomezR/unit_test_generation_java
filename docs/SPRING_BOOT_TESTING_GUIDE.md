# Guía de pruebas unitarias en Spring Boot

Aunque Spring Boot ofrece anotaciones como `@SpringBootTest`, para pruebas
unitarias preferimos **no levantar el contexto completo**.

Recomendaciones:

- Para servicios: usar pruebas puramente unitarias con Mockito.
- Para controladores:
  - Usar `@WebMvcTest` cuando se requiera probar el controlador con MVC.
  - O pruebas puramente unitarias del controlador con mocks de servicios.

Ejemplo de librerías típicas:

- `spring-boot-starter-test`
- `org.junit.jupiter:junit-jupiter`
- `org.mockito:mockito-core`
