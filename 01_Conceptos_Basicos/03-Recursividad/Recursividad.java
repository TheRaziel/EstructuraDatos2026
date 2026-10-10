/*
Ejercicio 1

package mx.edu.uttt.Recursividad;

import java.util.Scanner;

public class SumarNumeros {

    public static int Sumar(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + Sumar(n - 1);
        }
    }

    public static void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = entrada.nextInt();

        int resultado = Sumar(n);

        System.out.println("La suma de 1 a " + n + " es: " + resultado);
    }
}
*/

/*
Ejercicio 2

package mx.edu.uttt.Recursividad;

import java.util.Scanner;

public class FactorialNumeros {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = entrada.nextInt();

        int resultado = factorial(n);

        System.out.println("El factorial de " + n + " es: " + resultado);
    }
}
*/

/*
Ejercicio 3

package mx.edu.uttt.Recursividad;

import java.util.Scanner;

public class MultiplicacionMedianteSuma {

    public static int multiplicacion(int numero, int veces) {

        if (veces == 1) {
            return numero;
        } else {
            return numero + multiplicacion(numero, veces - 1);
        }
    }

    public static void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();

        System.out.print("Ingresa otro numero: ");
        int veces = entrada.nextInt();

        int resultado = multiplicacion(numero, veces);

        System.out.println("El resultado es: " + resultado);
    }
}
*/

/*Ejercicio 4

package mx.edu.uttt.Recursividad;

import java.util.Scanner;

public class Potencia {

    public static int potencia(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        int base = entrada.nextInt();

        System.out.print("Ingresa el exponente: ");
        int exponente = entrada.nextInt();

        int resultado = potencia(base, exponente);

        System.out.println("El resultado es: " + resultado);
    }
}
*/