# Parcial2
Juego de Batalla de Criaturas

Integrantes

- Kevin García Montoya
- Arnold Cabrera Gutiérrez

Descripción del proyecto

Este proyecto consiste en un juego de batalla desarrollado en Java utilizando los principios de la programación orientada a objetos. En él, diferentes criaturas se enfrentan mediante ataques propios de su tipo, reduciendo la salud de sus oponentes hasta determinar un ganador.

La simulación se ejecuta desde la clase principal `Main`, que controla los turnos de combate y muestra los resultados en la consola.

Objetivos

- Aplicar conceptos de programación orientada a objetos.
- Utilizar una clase abstracta para definir el comportamiento común de las criaturas.
- Implementar herencia y polimorfismo mediante diferentes tipos de criaturas.
- Simular combates por turnos y determinar al ganador según la salud restante.
- Incorporar pruebas unitarias para verificar el funcionamiento del programa.

Tipos de criaturas

El juego utiliza tres tipos de criaturas:

- Dragón: representa una criatura con ataques potenciados y características propias.
- Mago: utiliza habilidades mágicas para atacar a sus oponentes.
- Guerrero: combate mediante armas y habilidades de lucha.

Cada criatura se instancia con un nombre, una cantidad de salud, una fuerza y una característica adicional relacionada con su tipo.

 Funcionamiento del juego

La clase `Main` contiene el método `simularBatalla()`, encargado de controlar el combate entre dos criaturas.

El proceso funciona de la siguiente manera:

1. Se muestran los nombres de las criaturas que participarán en la batalla.
2. Se inicia el primer turno y la primera criatura ataca a su oponente.
3. Se comprueba si la criatura atacada continúa con vida.
4. Si ambas siguen vivas, la segunda criatura realiza su ataque.
5. Los turnos continúan alternándose hasta que una de las criaturas pierde toda su salud.
6. Se muestra el ganador y la cantidad de salud que le queda.

En el método `main()` se crean las siguientes criaturas:

| Criatura | Nombre | Salud inicial | Fuerza inicial |
|---|---|---:|---:|
| Dragón | Smaug | 120 | 10 |
| Mago | Gandalf | 90 | 8 |
| Guerrero | Aragorn | 100 | 11 |

Se ejecutan dos combates:

- Smaug contra Gandalf.
- Gandalf contra Aragorn.

 Conceptos de programación orientada a objetos

- **Abstracción:** permite definir las características y comportamientos comunes de las criaturas.
- **Herencia:** permite crear tipos específicos de criaturas a partir de una clase común.
- **Polimorfismo:** el programa utiliza referencias de tipo `Criatura` para trabajar con objetos `Dragon`, `Mago` y `Guerrero`.
- **Encapsulamiento:** permite organizar y controlar el acceso a los datos de los objetos, según la implementación de las clases.

 Tecnologías utilizadas

- Java.
- Maven para la gestión y construcción del proyecto.
- JUnit para las pruebas unitarias, una vez configuradas en el proyecto.

 Ejecución del proyecto

La ejecución comienza en el método `main()` de la clase `Main`. El programa crea las criaturas y llama al método `simularBatalla()` para desarrollar los combates.

 Pruebas unitarias

Las pruebas unitarias permitirán verificar el comportamiento de las criaturas, incluyendo sus ataques, la reducción de salud, la defensa y la comprobación de si permanecen con vida.

 Control de versiones

El proyecto utiliza Git y GitHub para gestionar el código mediante ramas, commits y solicitudes de integración (*Pull Requests*).

Cada integrante debe aportar cambios propios y documentar su trabajo para facilitar la revisión e integración del proyecto.
