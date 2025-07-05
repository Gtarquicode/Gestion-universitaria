# 🎓 Sistema de Gestión Universitaria en Java

Este proyecto implementa un sistema universitario en Java para demostrar distintos tipos de **asociaciones entre clases** orientadas a objetos:

🔗 **Composición**, 🧩 **Agregación**, 🤝 **Asociación** y 📎 **Dependencia**.

---

## 📁 Estructura del Proyecto

src/

└── gestionuniversitaria/

├── Universidad.java # Composición con Departamento

├── Departamento.java # Agregación con Profesor

├── Profesor.java # Asociación con Curso

├── Curso.java # Dependencia con GeneradorReporte

├── Estudiante.java # Asociación bidireccional con Curso

├── GeneradorReporte.java # Clase auxiliar para generar reportes

└── Main.java # Clase principal interactiva


---

## 📚 Tipos de Relaciones OOP Implementadas

| Relación      | Descripción |
|---------------|-------------|
| 🧱 **Composición** | `Universidad` contiene fuertemente a `Departamento`. Si la universidad desaparece, sus departamentos también. |
| 🧩 **Agregación**  | `Departamento` gestiona profesores, pero estos pueden existir de forma independiente. |
| 🔁 **Asociación bidireccional** | `Estudiante` y `Curso` están relacionados en ambos sentidos: inscripción y navegación. |
| 📎 **Dependencia** | `Curso` usa temporalmente `GeneradorReporte` para emitir reportes, sin mantener una referencia persistente. |

---

## 🧪 Ejemplo de Uso (consola)

```bash
🎓 Bienvenido al sistema de gestión universitaria
Ingresa el nombre de la universidad: Universidad Nacional
¿Cuántos departamentos quieres agregar?: 1
Nombre del departamento 1: Ingeniería
Nombre del profesor a contratar: Ana Gómez
Especialidad del profesor: Sistemas
Nombre del curso a ofrecer: Programación
Código del curso: CS101
¿Cuántos estudiantes se inscribirán?: 2
Nombre del estudiante 1: Carlos Pérez
Código del estudiante: 2025001
Nombre del estudiante 2: Laura Ruiz
Código del estudiante: 2025002

🔍 Reporte del curso: Programación
Profesor: Ana Gómez
Estudiantes inscritos:
 - Carlos Pérez (2025001)
 - Laura Ruiz (2025002)
