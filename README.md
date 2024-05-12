# Patrones de diseño

## Tarea S3_01

En esta práctica aprenderemos a identificar y construir programas utilizando patrones de diseño. La utilización de patrones es fundamental en la construcción de un software extensible y reutilizable. El lenguaje Java, así como todos los frameworks de software, están hechos de acuerdo a los patrones más importantes del software.

### Nivel 1: Singleton

Crea una clase que replique el funcionamiento del comando 'Undo'. Esta clase será utilizada por la clase Main, que permitirá introducir opciones por consola.

    La clase 'Undo' debe guardar los últimos pedidos introducidos.
    Debe permitir añadir o eliminar pedidos, así como listar los últimos
    pedidos introducidos (similar al comando 'history' en Linux).

    La clase 'Undo' debe implementar imprescindiblemente un patrón Singleton.

### Nivel 2: Abstract Factory

Crea un pequeño gestor de direcciones y números de teléfono internacionales.

    La aplicación debe permitir añadir a la agenda, direcciones y números de teléfono
    internacionales. Teniendo en cuenta los diferentes formatos de los distintos países,
    construye la agenda, las direcciones y los teléfonos y realizando  un patrón Abstract Factory.

### Nivel 3: Command

Diseña un parking de 4 vehículos: un coche, una bicicleta, un avión y un barco.

    Muestra cómo funciona el patrón Command que implementa los métodos arrancar, acelerar y frenar
    para cada tipo de vehículo.


## Tarea S3_02

Vamos a profundizar en los patrones de construcción de software. Piénsalo bien antes de construir tu software!!!

En todos los ejercicios, crea un proyecto Gradle con una clase Main que demuestre el uso del patrón (con las invocaciones que se necesiten).


### Nivel 1: Observer

Diseña un sistema en el que un Agente de Bolsa (Observable) notifica a varias agencias de Bolsa (Observers) cambios cuando la Bolsa sube o baja.

    Es necesario que el objeto Observable mantenga referencias a los Observadores.

### Nivel 2: Callback

Simula una pasarela de pago que reciba un objeto encapsulador del método de pago a efectuar: tarjeta de crédito, Paypal o deuda en cuenta bancaria.

    La pasarela invocará el pago sin conocer la forma y devolviendo el control a la clase de
    origen.
    
    La clase que invoca la pasarela de pago será una tienda de zapatos.

### Nivel 2: Dependency Injection

Diseña una clase que muestre en pantalla el precio de varios artículos. Ya que tendrá que mostrarlos también en varios tipos de moneda.

    Asegúrate de añadirle como Inyección de Dependencia una clase Conversor de Moneda que efectúe
    la corrección del precio en función del cambio de divisa.