# 🧪 Spring Boot JaCoCo Base

Este es un proyecto de ejemplo con **Spring Boot**, que incluye:

- Pruebas **unitarias** (`JUnit 5`)
- Pruebas **de integración** usando `@SpringBootTest`
- Generación de **reportes de cobertura de código** con `JaCoCo`
- Separación de pruebas de integración mediante un perfil Maven (`integration-tests`)

---

## 🚀 Jacoco report con comentario en PR

[Action Jacoco report](https://github.com/marketplace/actions/jacoco-report)

Si se sube un commit a un PR abierta. Pasa los test y genera un comentario con el reporte.
Se puede elegir si crear un nuevo comentario por cada commit o si editar el anterior comentario.
El reporte muestra el coverage total del proyecto y el coverage de cada archivo modificado.