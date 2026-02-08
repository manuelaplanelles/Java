![Banner](/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/img_doc/banner.png)

# Práctica 1. "El Formiguero" y "La Rebelión"

Manuela Planelles - 1º DAW - IES Mutxamel

---

## Índice

1. [Introducción](#1-introducción)
2. [Objetivos de la práctica](#2-objetivos-de-la-práctica)
3. [Diseño e Implementación](#3-diseño-e-implementación)
   - [3.1. Estructura de clases](#31-estructura-de-clases)
     - [3.1.1. Clase `AppProgramas`](#311-clase-appprogramas)
     - [3.1.2. Clase `Cadena`](#312-clase-cadena)
     - [3.1.3. Clase `Programa`](#313-clase-programa)
     - [3.1.4. Clase `Empleado`](#314-clase-empleado)
     - [3.1.5. Clase `Invitado`](#315-clase-invitado)
   - [3.2. Relaciones entre clases](#32-relaciones-entre-clases)
   - [3.3. Métodos requeridos](#33-métodos-requeridos)
4. [Plan de pruebas](#4-plan-de-pruebas)
5. [Ejemplo de funcionamiento](#5-ejemplo-de-funcionamiento)
6. [Entrega](#6-entrega)
   - [6.1. Requisitos de entrega](#61-requisitos-de-entrega)
   - [6.2. Estructura del repositorio](#62-estructura-del-repositorio)
7. [Conclusiones](#7-conclusiones)

---


## 1. Introducción.

El presente documento recoge el desarrollo de la práctica número 1 de la asignatura de Programación 1, correspondiente al módulo de Desarrollo de Aplicaciones Web. 

El contexto de la práctica se centra en el mundo de la televisión, donde se observa una situación de confrontación entre distintos programas. El objetivo es desarrollar una aplicación que permita recoger datos diarios sobre estos programas para aportar objetividad a las distintas informaciones que van surgiendo.

---

## 2. Objetivos de la práctica.

La práctica persigue los siguientes objetivos:

- Desarrollar una aplicación en Java que gestione información sobre cadenas de televisión, programas, empleados e invitados.
- Implementar relaciones de **composición** entre las clases `Programa`, `Empleado` e `Invitado`.
- Implementar relaciones de **asociación/agregación bidireccional** entre las clases `Cadena` y `Programa`.
- Aplicar conceptos de Programación Orientada a Objetos: encapsulación, constructores, getters, setters y sobreescritura de métodos.
- Implementar métodos de gestión de colecciones (ArrayList).
- Desarrollar métodos específicos de búsqueda y filtrado de información.

---

## 3. Diseño e Implementación del programa.

### 3.1. Estructura de clases

Creamos las clases que se solicitan con sus atributos 
![Banner](/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/img_doc/banner.png)

---
### 3.2. Métodos extras implementados
**a) Constructor modificado de `Invitado`**
- Modificar el constructor para que llame al set de `fecha_visita` con una fecha que se le pregunta al usuario para guardar cuándo tienen que ir al programa.
**b) Método `invitadosTemporada(int temporada)`**
- Muestra cuántos Invitados han acudido al Programa dada una temporada.
- Muestra también sus nombres y profesiones.
**c) Método `int vecesInvitado(String nombre)`**
- Devuelve las veces que ha ido un Invitado al Programa.
**d) Método `rastrearInvitado(String nombre)`**
- Hace uso del método del apartado anterior.
- Imprime las veces que ha ido un Invitado al Programa.
- Muestra también en qué fechas y temporadas.
**e) Método `boolean buscarInvitado(String nombre)`**
- Dado un Invitado, busca si ha acudido a un Programa.
**f) Método `invitadoAntes(String nombre)`**
- Usa el método implementado en el apartado anterior.
- En caso de haber devuelto true buscando en dos Programas distintos, muestra en cuál ha estado antes (comparando fechas).

---

## 4. Relaciones entre clases

| Relación | Tipo | Descripción |
|----------|------|-------------|
| `Programa` — `Empleado` | Composición | Si un objeto Programa se destruye, desaparecen también sus empleados asociados. |
| `Programa` — `Invitado` | Composición | Si un objeto Programa se destruye, desaparecen también sus invitados asociados. |
| `Cadena` — `Programa` | Asociación/Agregación bidireccional | Se conocen la una a la otra y ambas existen por sí solas. |

---
## 5. Ejemplo de funcionamiento

El documento proporciona el siguiente ejemplo de ejecución:

```java
public static void main (String[] args){
    // creamos una cadena de tv
    Cadena antena3 = new Cadena("Antena 3");
    
    // creamos un programa
    Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
    
    // insertamos empleados en el programa
    el_hormiguero.insertarEmpleado("Pablo Motos", "presentador", null);
    
    // ver empleados del programa
    // insertamos invitados en el programa
    // ver invitados del programa
}
```
---

## 6. Plan de pruebas
### 6.1. Pruebas final feliz.
Realiza las pruebas manuales necesarias para comprobar que el programa funciona bien.
---
### 6.2. Pruebas con JUnit5.
Pruebas unitarias de los método implementados con JUnit5.
---
## 7. Documentación Javadoc:
** Comentar el código siguiendo el estándar Javadoc.
---
8. Diagrama UML:** Crear el diagrama UML con PlantUML.

---




