 # 🔐 Seguridad REST - Muebles Los Alpes

Este proyecto forma parte del laboratorio de Arquitectura JEE, enfocado en exponer servicios REST para la autenticación de usuarios, usando EJBs mock y JSON para la comunicación.

---

## 📌 Objetivo

Implementar un servicio REST para el EJB `ServicioSeguridadMock`, que permita autenticar a un usuario mediante su login y contraseña.

---

## ⚙️ Tecnologías utilizadas

- Java EE (JDK 1.8)
- Jersey 1.13 (JAX-RS)
- GlassFish Server 4.1
- Maven
- NetBeans 8.1
- Postman (pruebas)

---

## 📁 Estructura

- `ServicioSeguridadMock` (EJB mock)
- `UsuarioDTO` (para recibir datos de login)
- `Usuario` (entidad mock retornada)
- `ServicioPersistenciaMock` (gestiona los usuarios simulados)
- `ServicioSeguridadService` (servicio REST)

---

## 📲 Servicio REST implementado

### 🔐 `POST /webresources/seguridad/login`

#### Entrada:
```json
{
  "login": "admin",
  "contraseña": "1234"
}

