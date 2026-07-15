# Spring Boot Web Application

![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.0-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Maven](https://img.shields.io/badge/Maven-Build-orange.svg)

Una aplicación web desarrollada con Spring Boot y Thymeleaf. Este proyecto sirve como base para construir aplicaciones web robustas utilizando el ecosistema de Spring y renderizado de plantillas del lado del servidor.

## 🚀 Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 4.1.0**
- **Spring Web MVC** - Para la creación de controladores y manejo de peticiones HTTP.
- **Thymeleaf** - Motor de plantillas para la capa de vistas.
- **Spring Boot DevTools** - Herramientas para desarrollo ágil (recarga automática).
- **Maven** - Gestor de dependencias y construcción del proyecto.

## 📋 Requisitos Previos

Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

- [Java Development Kit (JDK) 17](https://jdk.java.net/17/) o superior.
- [Maven](https://maven.apache.org/) (opcional, el proyecto incluye un Maven Wrapper `mvnw`).
- Un IDE como Visual Studio Code, IntelliJ IDEA o Eclipse.

## ⚙️ Instalación y Ejecución

Sigue estos pasos para levantar el entorno de desarrollo local:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/peteraraya/curso_spring_boot.git
   cd springboot-web
   ```

2. **Compilar el proyecto:**
   Utilizando el wrapper de Maven incluido:
   - En Linux/macOS:
     ```bash
     ./mvnw clean install
     ```
   - En Windows:
     ```cmd
     mvnw.cmd clean install
     ```

3. **Ejecutar la aplicación:**
   Puedes iniciar la aplicación con el siguiente comando:
   - En Linux/macOS:
     ```bash
     ./mvnw spring-boot:run
     ```
   - En Windows:
     ```cmd
     mvnw.cmd spring-boot:run
     ```

   Alternativamente, puedes ejecutar la clase principal `SpringbootWebApplication.java` desde tu IDE.

4. **Acceder a la aplicación:**
   Una vez que el servidor inicie, abre tu navegador web y visita:
   [http://localhost:8080](http://localhost:8080)

## 📁 Estructura del Proyecto

```
springboot-web/
├── src/
│   ├── main/
│   │   ├── java/com/peter/springboot/webapp/springboot_web/
│   │   │   ├── controllers/      # Controladores MVC
│   │   │   └── SpringbootWebApplication.java # Clase principal
│   │   └── resources/
│   │       ├── templates/        # Plantillas Thymeleaf (.html)
│   │       ├── static/           # Archivos estáticos (CSS, JS, imágenes)
│   │       └── application.properties # Configuración de Spring Boot
├── pom.xml                       # Configuración de Maven y dependencias
└── README.md                     # Documentación del proyecto
```

## 🧑‍💻 Autor

- **Pedro Araya**
