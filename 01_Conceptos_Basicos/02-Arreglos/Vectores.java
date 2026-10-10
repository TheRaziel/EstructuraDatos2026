/*
Ejercicio1: Agregar Vector:

        package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class AgregarVector {

    private int[] datos;
    private int cantidad;

    public AgregarVector(int tamaño) {
        datos = new int[tamaño];
        cantidad = 0;
    }

    public void agregarValor(int valor) {

        if (cantidad < datos.length) {

            datos[cantidad] = valor;
            cantidad++;

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "El vector está lleno."
            );
        }
    }

    public void mostrar() {

        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < cantidad; i++) {

            mensaje += "Posición " + i +
                    ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        AgregarVector vector = new AgregarVector(tamaño);

        for (int i = 0; i < tamaño; i++) {

            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor " + (i + 1) + ":"
            );

            if (valor == null) {
                return;
            }

            vector.agregarValor(
                    Integer.parseInt(valor)
            );
        }

        vector.mostrar();
    }
}
*/

/*
Ejercicio 2:Buscar Vector

package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class BuscarVector {

    private int[] datos;

    public BuscarVector(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public void buscar(int valorBuscado) {

        boolean encontrado = false;

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] == valorBuscado) {

                JOptionPane.showMessageDialog(
                        null,
                        "Dato encontrado: " + datos[i]
                                + "\nPosición: " + i
                );

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {

            JOptionPane.showMessageDialog(
                    null,
                    "El dato " + valorBuscado
                            + " no se encuentra en el vector."
            );
        }
    }

    public void mostrar() {

        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += "Posición " + i + ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        if (tamaño <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "El tamaño debe ser mayor que 0."
            );
            return;
        }

        BuscarVector vector = new BuscarVector(tamaño);

        vector.llenar();
        vector.mostrar();

        String buscar = JOptionPane.showInputDialog(
                null,
                "¿Qué número deseas buscar?"
        );

        if (buscar == null) {
            return;
        }

        int valorBuscado = Integer.parseInt(buscar);

        vector.buscar(valorBuscado);
    }
}
*/

/*
Ejercicio 3: Calcular Pares

package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class CalcularPares {

    private int[] datos;
    private int[] pares;

    public CalcularPares(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public void calcularPares() {

        int cantidadPares = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                cantidadPares++;
            }
        }

        pares = new int[cantidadPares];

        int posicion = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                pares[posicion] = datos[i];
                posicion++;
            }
        }
    }

    public void mostrar() {

        String mensaje = "Vector original:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += datos[i] + " ";
        }

        mensaje += "\n\nNúmeros pares:\n";

        if (pares.length == 0) {
            mensaje += "No hay números pares.";
        } else {
            for (int i = 0; i < pares.length; i++) {
                mensaje += pares[i] + " ";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        CalcularPares vector = new CalcularPares(tamaño);

        vector.llenar();
        vector.calcularPares();
        vector.mostrar();
    }
}

*/

/*
Ejercicio 4: Calcular Primos

package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class CalcularPrimos {

    private int[] datos;
    private int[] primos;

    public CalcularPrimos(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void calcularPrimos() {

        int cantidadPrimos = 0;

        for (int i = 0; i < datos.length; i++) {
            if (esPrimo(datos[i])) {
                cantidadPrimos++;
            }
        }

        primos = new int[cantidadPrimos];

        int posicion = 0;

        for (int i = 0; i < datos.length; i++) {
            if (esPrimo(datos[i])) {
                primos[posicion] = datos[i];
                posicion++;
            }
        }
    }

    public void mostrar() {

        String mensaje = "Vector original:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += datos[i] + " ";
        }

        mensaje += "\n\nNúmeros primos:\n";

        if (primos.length == 0) {
            mensaje += "No hay números primos.";
        } else {
            for (int i = 0; i < primos.length; i++) {
                mensaje += primos[i] + " ";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        CalcularPrimos vector = new CalcularPrimos(tamaño);

        vector.llenar();
        vector.calcularPrimos();
        vector.mostrar();
    }
}
*/

/*
Ejercicio 5: Llenar Vector

 package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class LlenarVector {

    private int[] datos;

    public LlenarVector(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {

            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public void mostrar() {

        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < datos.length; i++) {

            mensaje += "Posición " + i +
                    ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(
                null,
                mensaje
        );
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        LlenarVector vector = new LlenarVector(tamaño);

        vector.llenar();

        vector.mostrar();
    }
}
*/

/*
Ejercicio 6: Mayor Vector

package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class MayorVector {

    private int[] datos;

    public MayorVector(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public int calcularMayor() {

        int mayor = datos[0];

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i];
            }
        }

        return mayor;
    }

    public void mostrar() {

        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += "Posición " + i + ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        if (tamaño <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "El tamaño debe ser mayor que 0."
            );
            return;
        }

        MayorVector vector = new MayorVector(tamaño);

        vector.llenar();
        vector.mostrar();

        int mayor = vector.calcularMayor();

        JOptionPane.showMessageDialog(
                null,
                "El valor mayor del vector es: " + mayor
        );
    }
}
*/

/*
Ejercicio 7: Menor vector

 package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class MenorVector {

    private int[] datos;

    public MenorVector(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public int calcularMenor() {

        int menor = datos[0];

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < menor) {
                menor = datos[i];
            }
        }

        return menor;
    }

    public void mostrar() {

        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += "Posición " + i + ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        if (tamaño <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "El tamaño debe ser mayor que 0."
            );
            return;
        }

        MenorVector vector = new MenorVector(tamaño);

        vector.llenar();
        vector.mostrar();

        int menor = vector.calcularMenor();

        JOptionPane.showMessageDialog(
                null,
                "El valor menor del vector es: " + menor
        );
    }
}
*/

/*
Ejercicio 8: Promedio Vector

package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class PromedioVector {

    private int[] datos;

    public PromedioVector(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {

        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public double calcularPromedio() {

        int suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }

        return (double) suma / datos.length;
    }

    public void mostrar() {

        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += "Posición " + i + ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        if (tamaño <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "El tamaño debe ser mayor que 0."
            );
            return;
        }

        PromedioVector vector = new PromedioVector(tamaño);

        vector.llenar();
        vector.mostrar();

        double promedio = vector.calcularPromedio();

        JOptionPane.showMessageDialog(
                null,
                "El promedio de los valores es: " + promedio
        );
    }
}
*/

/*
Ejercicio  9: Sumar Dos Vectores

 package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class SumarDosVectores {

    private int[] vector1;
    private int[] vector2;

    public SumarDosVectores(int tamaño) {
        vector1 = new int[tamaño];
        vector2 = new int[tamaño];
    }

    public void llenarVectores() {

        for (int i = 0; i < vector1.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Vector 1\nIngresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            vector1[i] = Integer.parseInt(valor);
        }

        for (int i = 0; i < vector2.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Vector 2\nIngresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            vector2[i] = Integer.parseInt(valor);
        }
    }

    public int sumar() {

        int suma = 0;

        for (int i = 0; i < vector1.length; i++) {
            suma += vector1[i] + vector2[i];
        }

        return suma;
    }

    public void mostrar() {

        String mensaje = "Vector 1:\n";

        for (int i = 0; i < vector1.length; i++) {
            mensaje += "Posición " + i + ": " + vector1[i] + "\n";
        }

        mensaje += "\nVector 2:\n";

        for (int i = 0; i < vector2.length; i++) {
            mensaje += "Posición " + i + ": " + vector2[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá cada vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        SumarDosVectores vectores = new SumarDosVectores(tamaño);

        vectores.llenarVectores();
        vectores.mostrar();

        int suma = vectores.sumar();

        JOptionPane.showMessageDialog(
                null,
                "La suma de los dos vectores es: " + suma
        );
    }
}
*/

/*
Ejercicio 10:Sumas de Vectores

 package mx.edu.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class SumaVector {

    private int[] datos;

    public SumaVector(int tamaño) {
        datos = new int[tamaño];
    }

    public void llenar() {
        for (int i = 0; i < datos.length; i++) {
            String valor = JOptionPane.showInputDialog(
                    null,
                    "Ingresa el valor para la posición " + i + ":"
            );

            if (valor == null) {
                return;
            }

            datos[i] = Integer.parseInt(valor);
        }
    }

    public int sumar() {
        int suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }

        return suma;
    }

    public void mostrar() {
        String mensaje = "Datos del vector:\n";

        for (int i = 0; i < datos.length; i++) {
            mensaje += "Posición " + i + ": " + datos[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void ejecutar() {

        String entrada = JOptionPane.showInputDialog(
                null,
                "¿Cuántos elementos tendrá el vector?"
        );

        if (entrada == null) {
            return;
        }

        int tamaño = Integer.parseInt(entrada);

        SumaVector vector = new SumaVector(tamaño);

        vector.llenar();
        vector.mostrar();

        int suma = vector.sumar();

        JOptionPane.showMessageDialog(
                null,
                "La suma de los datos es: " + suma
        );
    }
}
*/