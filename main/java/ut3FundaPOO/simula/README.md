    # Simulacro UT3-POO: Tienda de Videojuegos

## Objetivo

Desarrollar una aplicación Java utilizando los principios de la **Programación Orientada a Objetos (POO)**.

La aplicación permitirá simular una tienda de videojuegos donde un cliente puede comprar un videojuego y quedar registrado en una tienda.

Todas las clases deberán pertenecer al siguiente paquete:

```java
package ut3FundaPOO.simula;
```

---

# Requisitos

Se deberán implementar las siguientes clases:

- `Videojuego`
- `Cliente`
- `TiendaVideojuegos`

---

# Diagrama de clases

```text 
┌─────────────────────────────────────┐
│         TiendaVideojuegos           │
├─────────────────────────────────────┤
│ Atributos                           │
│ - nombre : String                   │
│ - direccion : String                │
│ - cliente : Cliente                 │
├─────────────────────────────────────┤
│ Métodos                             │
│ + TiendaVideojuegos(                │
│     nombre:String,                  │
│     direccion:String)               │
│ + registrarCliente(                 │
│     cliente:Cliente) : void         │
│ + getNombre() : String              │
│ + getDireccion() : String           │
│ + getCliente() : Cliente            │
│ + toString() : String               │
└─────────────────┬───────────────────┘
                  │ contiene
                  ▼

┌─────────────────────────────────────┐
│              Cliente                │
├─────────────────────────────────────┤
│ Atributos                           │
│ - nombre : String                   │
│ - email : String                    │
│ - videojuego : Videojuego           │
├─────────────────────────────────────┤
│ Métodos                             │
│ + Cliente(                          │
│     nombre:String,                  │
│     email:String)                   │
│ + comprarVideojuego(                │
│     videojuego:Videojuego) : void   │
│ + getNombre() : String              │
│ + getEmail() : String               │
│ + getVideojuego() : Videojuego      │
│ + toString() : String               │
└─────────────────┬───────────────────┘
                  │ posee
                  ▼

┌─────────────────────────────────────┐
│            Videojuego               │
├─────────────────────────────────────┤
│ Atributos                           │
│ - titulo : String                   │
│ - plataforma : String               │
│ - precio : double                   │
│ - totalVideojuegos : int {static}   │
├─────────────────────────────────────┤
│ Métodos                             │
│ + Videojuego(                       │
│     titulo:String,                  │
│     plataforma:String,              │
│     precio:double)                  │
│ + getTitulo() : String              │
│ + getPlataforma() : String          │
│ + getPrecio() : double              │
│ + getTotalVideojuegos() : int       │
│   {static}                          │
│ + toString() : String               │
└─────────────────────────────────────┘
```

---

# Clase Videojuego

Representa un videojuego que puede comprar un cliente.

## Atributos

```java
private String titulo;
private String plataforma;
private double precio;

private static int totalVideojuegos;
```

## Constructor

```java
public Videojuego(String titulo,
                  String plataforma,
                  double precio)
```

Cada vez que se cree un objeto `Videojuego`, deberá incrementarse el atributo estático:

```java
totalVideojuegos++;
```

## Métodos

```java
public static int getTotalVideojuegos()

public String toString()
```

---

# Clase Cliente

Representa un cliente de la tienda.

## Atributos

```java
private String nombre;
private String email;

private Videojuego videojuego;
```

## Constructor

```java
public Cliente(String nombre,
               String email)
```

## Métodos

```java
public void comprarVideojuego(
                Videojuego videojuego)

public String toString()
```

El método `comprarVideojuego()` almacenará la referencia al videojuego recibido como parámetro.

---

# Clase TiendaVideojuegos

Representa la tienda.

## Atributos

```java
private String nombre;
private String direccion;

private Cliente cliente;
```

## Constructor

```java
public TiendaVideojuegos(String nombre,
                         String direccion)
```

## Métodos

```java
public void registrarCliente(
                Cliente cliente)

public String toString()
```

El método `registrarCliente()` almacenará la referencia al cliente recibido como parámetro.

---

# Programa principal de prueba con JUnitTest
```java

package ut3FundaPOO.simula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Evaluación:
 * Prueba 1 -> 2 puntos
 * Prueba 2 -> 2 puntos
 * Prueba 3 -> 2 puntos
 * Prueba 4 -> 2 puntos
 * Prueba 5 -> 2 puntos
 *
 * Total: 10 puntos
 */
class VideojuegoTest  {

    @Test
    @DisplayName("Prueba 1 (2 puntos): Constructor de Videojuego")
    void testConstructorVideojuego() {

        Videojuego videojuego =
                new Videojuego(
                        "Minecraft",
                        "PC",
                        29.99);

        assertEquals("Minecraft",
                videojuego.getTitulo());

        assertEquals("PC",
                videojuego.getPlataforma());

        assertEquals(29.99,
                videojuego.getPrecio());
    }

    @Test
    @DisplayName("Prueba 2 (2 puntos): Cliente compra un videojuego")
    void testCompraVideojuego() {

        Videojuego videojuego =
                new Videojuego(
                        "FC26",
                        "PS5",
                        69.99);

        Cliente cliente =
                new Cliente(
                        "Juan",
                        "juan@gmail.com");

        cliente.comprarVideojuego(videojuego);

        assertNotNull(cliente.getVideojuego());

        assertEquals(
                "FC26",
                cliente.getVideojuego().getTitulo());
    }

    @Test
    @DisplayName("Prueba 3 (2 puntos): Registro de cliente en la tienda")
    void testRegistrarCliente() {

        Cliente cliente =
                new Cliente(
                        "Ana",
                        "ana@gmail.com");

        TiendaVideojuegos tienda =
                new TiendaVideojuegos(
                        "Game Store",
                        "Madrid");

        tienda.registrarCliente(cliente);

        assertNotNull(tienda.getCliente());

        assertEquals(
                "Ana",
                tienda.getCliente().getNombre());
    }

    @Test
    @DisplayName("Prueba 4 (2 puntos): Relación completa Tienda -> Cliente -> Videojuego")
    void testRelacionCompleta() {

        Videojuego videojuego =
                new Videojuego(
                        "Minecraft",
                        "PC",
                        29.99);

        Cliente cliente =
                new Cliente(
                        "Juan",
                        "juan@gmail.com");

        cliente.comprarVideojuego(videojuego);

        TiendaVideojuegos tienda =
                new TiendaVideojuegos(
                        "Game Store",
                        "Madrid");

        tienda.registrarCliente(cliente);

        assertEquals(
                "Minecraft",
                tienda.getCliente()
                      .getVideojuego()
                      .getTitulo());

        assertEquals(
                "Juan",
                tienda.getCliente().getNombre());
    }

    @Test
    @DisplayName("Prueba 5 (2 puntos): Variable static totalVideojuegos")
    void testVariableStatic() {

        int totalInicial =
                Videojuego.getTotalVideojuegos();

        new Videojuego(
                "Minecraft",
                "PC",
                29.99);

        new Videojuego(
                "FC26",
                "PS5",
                69.99);

        new Videojuego(
                "Fortnite",
                "PC",
                0);

        assertEquals(
                totalInicial + 3,
                Videojuego.getTotalVideojuegos());
    }

}
```
 

---

# Restricciones

- Todos los atributos deberán ser `private`.
- No se permite el uso de colecciones (`ArrayList`, `LinkedList`, etc.).
- No se permite modificar el nombre de las clases ni de los atributos.
- El contador estático deberá gestionarse mediante el atributo:

```java
private static int totalVideojuegos;
```

- El método:

```java
getTotalVideojuegos()
```

deberá ser estático.

---

# Evaluación automática

La práctica será corregida mediante un conjunto de pruebas automáticas utilizando **JUnit Test**.

Por este motivo es importante:

- Respetar exactamente los nombres de las clases.
- Respetar exactamente los nombres de los atributos.
- Respetar exactamente las firmas de los constructores y métodos indicados en el enunciado.
- Mantener todas las clases dentro del paquete:

```java
ut3FundaPOO.simula
```

Las pruebas automáticas verificarán la creación de objetos, las asociaciones entre clases, el funcionamiento del atributo estático y las salidas generadas por los métodos implementados.
    
 
  
