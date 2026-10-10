package mx.edu.uttt.Menu;

import javax.swing.JOptionPane;

public class menu {

    public static String menuprincipal() {

        String opciones =
                "====== ESTRUCTURA DE DATOS ======\n\n" +
                        "1) Arreglos\n" +
                        "2) Recursividad\n" +
                        "3) Listas\n" +
                        "4) Pilas\n" +
                        "5) Colas\n" +
                        "6) Árboles\n" +
                        "0) Salir\n\n" +
                        "Seleccione una opción:";

        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuArreglos() {

        String opciones =
                "====== ARREGLOS ======\n\n" +
                        "1) Vectores\n" +
                        "2) Matrices\n" +
                        "0) Regresar\n\n" +
                        "Seleccione una opción:";

        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuMatrices() {

        String opciones =
                "====== MATRICES ======\n\n" +
                        "1) Reserva de asientos\n" +
                        "2) Acumulado de ventas\n" +
                        "3) Matriz identidad\n" +
                        "4) Diagonal principal\n" +
                        "5) Transposición\n" +
                        "6) Rotación\n" +
                        "0) Regresar\n\n" +
                        "Seleccione una opción:";

        return JOptionPane.showInputDialog(opciones);
    }

    public static String menuListas() {
        return JOptionPane.showInputDialog(
                "====== LISTAS ======\n\n" +
                        "0) Regresar"
        );
    }

    public static String menuColas() {
        return JOptionPane.showInputDialog(
                "====== COLAS ======\n\n" +
                        "0) Regresar"
        );
    }

    public static String menuPilas() {
        return JOptionPane.showInputDialog(
                "====== PILAS ======\n\n" +
                        "0) Regresar"
        );
    }

    public static String menuArboles() {
        return JOptionPane.showInputDialog(
                "====== ÁRBOLES ======\n\n" +
                        "0) Regresar"
        );
    }
}