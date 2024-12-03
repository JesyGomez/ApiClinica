# Proyecto Spring Boot con CRUD para Médicos

Este proyecto implementa un CRUD (Create, Read, Update, Delete) para la gestión de médicos utilizando **Spring Boot**. A continuación, se describen las principales tecnologías, herramientas y conceptos aplicados durante el desarrollo del proyecto.

---

## 🛠 Tecnologías Utilizadas

- **Spring Boot**: Framework principal para la creación del backend.
- **Spring Initializer**: Herramienta utilizada para la generación del proyecto.
- **Maven**: Gestor de dependencias.
- **JPA/Hibernate**: Implementación para el manejo de la persistencia de datos.
- **Insomnia**: Herramienta para probar servicios REST.
- **REST Services**: Arquitectura para la comunicación cliente-servidor.

---

## 📂 Estructura del Proyecto

El proyecto fue generado utilizando **Spring Initializer**, una herramienta que permite configurar el proyecto fácilmente, seleccionando el empaquetado, gestor de dependencias y las bibliotecas necesarias.

### Estructura generada:
- **`pom.xml`**: Archivo principal de Maven que contiene las dependencias, el `groupId`, el `artifactId` y otros datos del proyecto.
- **`src/main/java`**: Carpeta principal donde se encuentran las clases y paquetes del proyecto.
- **`src/test/java`**: Carpeta destinada para pruebas unitarias e integraciones (aunque no se cubrieron en este curso).

---

## 📝 Funcionalidades

### 1. CRUD de Médicos
- **Create**: Registro de médicos.
- **Read**: Consulta de médicos registrados.
- **Update**: Actualización de datos de médicos.
- **Delete**: Eliminación de registros de médicos.

> Implementado utilizando **JPA** y **Hibernate**, con soporte para datos avanzados relacionados con **HTTP** y **REST Services**.

---

## 🌐 REST Services y Testing con Insomnia

Durante el proyecto, aprendimos y utilizamos **Insomnia**, una herramienta clave para probar nuestras APIs.

### Características:
- Crear solicitudes **GET**, **POST**, **PUT**, y **DELETE**.
- Probar la API simulando un cliente (frontend o aplicación móvil).
- Manejo de:
    - **Query Params**: Parámetros que se envían como parte de la URL en solicitudes HTTP.
    - **Path Params**: Valores que forman parte de la ruta de la URL.
- Enviar cargas útiles (**payloads**) para probar las funcionalidades de creación y actualización.

---

## 🤝 Contribuciones
Si deseas contribuir o mejorar este proyecto, siéntete libre de realizar un `fork` y abrir un `pull request`.

---

## 💡 Próximos pasos
- Implementar **pruebas unitarias** y **pruebas de integración** para mejorar la calidad del proyecto.
- Incluir más funcionalidades avanzadas de **Spring Boot** y **REST Services**.

---

## 📌 Notas
Este proyecto es un excelente punto de partida para trabajar con **Spring Boot**, CRUDs, y probar servicios REST. Además, es adaptable para implementar nuevas tecnologías y conceptos avanzados según las necesidades del desarrollo.

