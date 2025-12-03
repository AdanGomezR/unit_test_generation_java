# Integración con el space de reportes (JUnit + JaCoCo)

Este space de unit tests está pensado para trabajar junto con el
space de reportes `qa-test-reports-junit-jacoco`.

Para aprovecharlo:

- Asegúrate de que:
  - Las pruebas se ejecutan con Maven (`mvn test` / `mvn verify`).
  - Se generan reportes JUnit en `target/surefire-reports`.
  - JaCoCo está configurado y genera `target/site/jacoco/jacoco.xml`.
- El space de reportes lee esos archivos y genera:
  - `test-report-*.md`
  - `coverage-summary-*.md`

Si pides a Copilot que agregue nuevos tests, menciónale que:
- Deben mantener o mejorar la cobertura.
- Deben integrarse con estos reportes.
