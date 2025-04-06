 # 🔐 Seguridad REST - Muebles Los Alpes

Este proyecto forma parte del laboratorio de Arquitectura JEE, enfocado en exponer servicios REST para la autenticación de usuarios, usando EJBs mock y JSON para la comunicación.

---

## 📌 Objetivo

Implementar un servicio REST para el EJB `ServicioSeguridadMock`, que permita hacer un CRUD.

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

## 🌐 Endpoints REST disponibles

### ✅ 1. Autenticación

`POST /seguridad/login`  
Autentica un usuario en el sistema.

#### 🟢 Request válido:
```json
{
  "login": "admin",
  "contraseña": "adminadmin"
}

🟢 Response (HTTP 200):
{
  "login": "admin",
  "contraseña": "adminadmin",
  "tipoUsuario": "Administrador",
  "nombreCompleto": null,
  "documento": 0,
  "tipoDocumento": null,
  "telefonoLocal": 0,
  "telefonoCelular": 0,
  "ciudad": null,
  "direccion": null,
  "profesion": null,
  "correo": null,
  "seleccion": false,
  "compras": []
}
🔴 Request con contraseña incorrecta:
{
  "login": "admin",
  "contraseña": "incorrecta"
}

🔴 Response (HTTP 401):

{
  "error": "La contraseña no es válida. Por favor, asegúrate de que el bloqueo de mayúsculas no está activado e inténtalo de nuevo."
}

👤 2. CRUD de Usuario
🔍 GET /seguridad/usuarios
Obtiene todos los usuarios del sistema.

✅ Response:
[
    {
        "login": "admin",
        "contraseña": "adminadmin",
        "tipoUsuario": "Administrador",
        "nombreCompleto": null,
        "documento": 0,
        "tipoDocumento": null,
        "telefonoLocal": 0,
        "telefonoCelular": 0,
        "ciudad": null,
        "direccion": null,
        "profesion": null,
        "correo": null,
        "seleccion": false,
        "compras": []
    },
    {
        "login": "client",
        "contraseña": "clientclient",
        "tipoUsuario": "Cliente",
        "nombreCompleto": null,
        "documento": 0,
        "tipoDocumento": null,
        "telefonoLocal": 0,
        "telefonoCelular": 0,
        "ciudad": null,
        "direccion": null,
        "profesion": null,
        "correo": null,
        "seleccion": false,
        "compras": []
    }
]

➕ POST /seguridad/usuarios
Crea un nuevo usuario.

✅ Request:
{
  "login": "nuevo",
  "contraseña": "clave123",
  "tipoUsuario": "Cliente",
  "nombreCompleto": "Juan Pérez",
  "documento": 12345,
  "tipoDocumento": "CC",
  "telefonoLocal": 1234567,
  "telefonoCelular": 3001234567,
  "ciudad": "Bogotá",
  "direccion": "Calle 123 # 45-67",
  "profesion": "Ingeniero",
  "correo": "juan@example.com",
  "seleccion": false,
  "compras": []
}

✅ Response (HTTP 201):
{
  "login": "nuevo",
  "contraseña": "clave123",
  "tipoUsuario": "Cliente",
  ...
}

✏️ PUT /seguridad/usuarios/{login}
Actualiza un usuario existente.

✅ Request:
{
  "login": "nuevo",
  "contraseña": "nuevaclave",
  "tipoUsuario": "Administrador",
  "nombreCompleto": "Juan Pérez Modificado",
  ...
}
✅ Response:
{
  "login": "nuevo",
  "contraseña": "nuevaclave",
  ...
}
🗑️ DELETE /seguridad/usuarios/{login}
Elimina un usuario del sistema.

✅ Response:
{
  "mensaje": "Usuario eliminado correctamente"
}
⚠️ Error si tiene compras:
{
  "error": "El usuario ha realizado comprar y por lo tanto no puede ser eliminado del sistema."
}

👨‍💻 Autor
Santiago
🔗 GitHub - Santiago-proJava