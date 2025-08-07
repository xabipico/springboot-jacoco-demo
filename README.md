# 🧪 Spring Boot JaCoCo Base

Este es un proyecto de ejemplo con **Spring Boot**, que incluye:

- Pruebas **unitarias** (`JUnit 5`)
- Pruebas **de integración** usando `@SpringBootTest`
- Generación de **reportes de cobertura de código** con `JaCoCo`
- Separación de pruebas de integración mediante un perfil Maven (`integration-tests`)

---


## 🚀 Cómo ejecutar

### 1. Ejecutar pruebas unitarias

    mvn clean verify

### 2. Ejecutar también pruebas de integración

    mvn clean verify -P integration-tests


## Reportes de cobertura

Después de ejecutar los tests, JaCoCo generará los reportes en:

    target/site/jacoco/index.html

Ábrelo en tu navegador para ver la cobertura de clases, métodos, líneas e instrucciones.

## Dependencias

Este proyecto usa:

- Java 21
- Spring Boot Starter
- Spring Boot Starter Test
- JaCoCo (v0.8.11)
- Maven Failsafe Plugin para pruebas de integración