# Tipos de Datos Abstractos

La idea central  es que no se memorice TDA como una definición.

La se cuencia para  entenderlo:

**Problema**=>**Datos**=>**Operaciones**=>**Reglas**=>**Abstraccion**=>**IDA**=>**Implementacion**=>**Clase java**=>**Estructura de Datos**

para despues entrar a lo que es una *Pila*,*Cola*,*Lista*, y *arboles*

1.Problema:

>Supongamos que tenemos un sistema escolar y queremos manejar estudiantes.

    Cada estudiante:
    -Matricula,
    -nombre,
    -carrera,
    -promedio

    Hasta ahora estamos de **datos**

    Pero el programa no solamente necesita almacenar esos datos.
    Tambien necesita hacer cosas con ellos:

    -registrar un cliente
    -consultar datos
    -cambiar su promedio
    -verificar si esta aprobado
    -mostrar informacion

    Entonces aparece una idea importante:

    En programacion no  solamente importa **Que datos tenemos**,
    si no tambien **que operaciones podemos  realizar sobre esos
    datos**

    Nota: Este es el primer paso hacia un TDA.

    2.Dato simple vs algo mas complejo

    Ya conocemos:

    ´´´ Java
    int edad;
    double promedio;
    String nombre;
    
    Estos son tipos de datos ya los conoce Java.

    por ejemplo:
    ´int edad=20;

    java sabe:

    -que tipo de valor puede almacenar
    -cuanto espacio requiere
    -que operaciones se pueden realizar

    con un int:
    ´´´

    ´´´ java
    edad + 1
    edad - 1
    edad * 1
    edad > 1 
    edad ++ 
    ´´´

    Pero si pensamos en:

    'Estudiante'

    Java originalmente no tiene un tipo llamado **Estudiante**

    Necesitamos construirlo 

    Aqui comienza a aparecer la idea de **crear nuestros propios tipos de datos**

    3. ¿Que seria un tipo de dato?

    Se puede definir inicialmente asi:

    >Un tipo de dato puede definir que valores pueden existir y que operaciones pueden realizarse con esos  valores

    Por ejemplo:

    *int*
    valores posibles

    -10
    0
    5
    100
    1500

operaciones: Artimeticas y relaciones

**boolean**
valores:
´´´
true 
false
´´´

Operaciones:
