/*  Ejercicio 01: Asientos
package mx.edu.uttt.arreglos.matrices;

import javax.swing.JOptionPane;

public class Asientos {

    private int[][] asientos;

    public Asientos(int filas, int columnas) {
        asientos = new int[filas][columnas];
    }

    public void reservarAsiento(int fila, int columna) {

        if (fila < 0 || fila >= asientos.length ||
                columna < 0 || columna >= asientos[0].length) {

            JOptionPane.showMessageDialog(
                    null,
                    "La fila o columna no es valida."
            );

        } else if (asientos[fila][columna] == 0) {

            asientos[fila][columna] = 1;

            JOptionPane.showMessageDialog(
                    null,
                    "Asiento reservado correctamente."
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "El asiento ya esta ocupado."
            );
        }
    }

    public static void ejecutar() {

        int filas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de filas:"
                )
        );

        int columnas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de columnas:"
                )
        );

        if (filas <= 0 || columnas <= 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Las filas y columnas deben ser mayores que 0."
            );

            return;
        }

        Asientos asientos = new Asientos(filas, columnas);

        int fila = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa la fila del asiento:"
                )
        );

        int columna = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa la columna del asiento:"
                )
        );

        asientos.reservarAsiento(fila, columna);
    }
}
*/

/*  Ejercicio2: Diagnostico.
package mx.edu.uttt.arreglos.matrices;

import javax.swing.JOptionPane;

public class Diagnostico {

    private int[][] matriz;

    public Diagnostico(int filas, int columnas) {

        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingresa el valor de [" + i + "][" + j + "]:"
                        )
                );
            }
        }
    }

    public boolean esCuadrada() {

        return matriz.length == matriz[0].length;
    }

    public boolean esIdentidad() {

        if (!esCuadrada()) {
            return false;
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j && matriz[i][j] != 1) {
                    return false;
                }

                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public int sumarDiagonal() {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma = suma + matriz[i][i];
        }

        return suma;
    }

    public void ejecutarDiagnostico() {

        if (!esCuadrada()) {

            JOptionPane.showMessageDialog(
                    null,
                    "La matriz no es cuadrada.\n" +
                            "Se cancela la operacion."
            );

            return;
        }

        if (esIdentidad()) {

            JOptionPane.showMessageDialog(
                    null,
                    "La matriz SI es una matriz identidad."
            );

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "La matriz NO es una matriz identidad."
            );
        }

        int suma = sumarDiagonal();

        JOptionPane.showMessageDialog(
                null,
                "La suma de la diagonal principal es: " + suma
        );
    }

    public static void ejecutar() {

        int filas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de filas:"
                )
        );

        int columnas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de columnas:"
                )
        );

        if (filas <= 0 || columnas <= 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Las filas y columnas deben ser mayores que 0."
            );

            return;
        }

        Diagnostico diagnostico = new Diagnostico(filas, columnas);

        diagnostico.ejecutarDiagnostico();
    }
}
*/

/*  Ejercicio 3: Rotacion
package mx.edu.uttt.arreglos.matrices;

import javax.swing.JOptionPane;

public class Rotacion {

    private int[][] matriz;

    public Rotacion(int filas, int columnas) {

        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingresa el valor de [" + i + "][" + j + "]:"
                        )
                );
            }
        }
    }

    public boolean esCuadrada() {

        return matriz.length == matriz[0].length;
    }

    public int[][] rotar90Grados() {

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] rotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                rotada[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return rotada;
    }

    public void mostrarMatriz(int[][] matrizMostrar) {

        String resultado = "";

        for (int i = 0; i < matrizMostrar.length; i++) {

            for (int j = 0; j < matrizMostrar[i].length; j++) {

                resultado = resultado + matrizMostrar[i][j] + " ";
            }

            resultado = resultado + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void ejecutar() {

        int filas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de filas:"
                )
        );

        int columnas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de columnas:"
                )
        );

        if (filas <= 0 || columnas <= 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Las filas y columnas deben ser mayores que 0."
            );

            return;
        }

        Rotacion matriz = new Rotacion(filas, columnas);

        if (!matriz.esCuadrada()) {

            JOptionPane.showMessageDialog(
                    null,
                    "La matriz no es cuadrada.\n" +
                            "Debe tener el mismo numero de filas y columnas."
            );

            return;
        }

        JOptionPane.showMessageDialog(
                null,
                "Matriz original:"
        );

        matriz.mostrarMatriz(matriz.matriz);

        int[][] rotada = matriz.rotar90Grados();

        JOptionPane.showMessageDialog(
                null,
                "Matriz rotada 90 grados a la derecha:"
        );

        matriz.mostrarMatriz(rotada);
    }
}
*/

/*  Ejercicio 4: Transposicion
package mx.edu.uttt.arreglos.matrices;

import javax.swing.JOptionPane;

public class Rotacion {

    private int[][] matriz;

    public Rotacion(int filas, int columnas) {

        matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Ingresa el valor de [" + i + "][" + j + "]:"
                        )
                );
            }
        }
    }

    public boolean esCuadrada() {

        return matriz.length == matriz[0].length;
    }

    public int[][] rotar90Grados() {

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] rotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                rotada[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return rotada;
    }

    public void mostrarMatriz(int[][] matrizMostrar) {

        String resultado = "";

        for (int i = 0; i < matrizMostrar.length; i++) {

            for (int j = 0; j < matrizMostrar[i].length; j++) {

                resultado = resultado + matrizMostrar[i][j] + " ";
            }

            resultado = resultado + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void ejecutar() {

        int filas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de filas:"
                )
        );

        int columnas = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el numero de columnas:"
                )
        );

        if (filas <= 0 || columnas <= 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "Las filas y columnas deben ser mayores que 0."
            );

            return;
        }

        Rotacion matriz = new Rotacion(filas, columnas);

        if (!matriz.esCuadrada()) {

            JOptionPane.showMessageDialog(
                    null,
                    "La matriz no es cuadrada.\n" +
                            "Debe tener el mismo numero de filas y columnas."
            );

            return;
        }

        JOptionPane.showMessageDialog(
                null,
                "Matriz original:"
        );

        matriz.mostrarMatriz(matriz.matriz);

        int[][] rotada = matriz.rotar90Grados();

        JOptionPane.showMessageDialog(
                null,
                "Matriz rotada 90 grados a la derecha:"
        );

        matriz.mostrarMatriz(rotada);
    }
}
*/