package mx.edu.uttt.app;

import mx.edu.uttt.Menu.menu;
import mx.edu.uttt.Recursividad.MenuRecursividad;
import mx.edu.uttt.arreglos.Arreglosmenu;

import javax.swing.*;

public class App2 {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {

        String opcion;

        do {

            opcion = menu.menuprincipal();

            if (opcion == null) {
                return;
            }

            switch (opcion) {

                case "1":
                    Arreglosmenu.mostrar();
                    break;

                case "2":
                    MenuRecursividad.mostrar();
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Listas");
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Pilas");
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Colas");
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null, "Arboles");
                    break;

                case "0":
                    JOptionPane.showMessageDialog(
                            null,
                            "Programa finalizado"
                    );
                    return;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion no valida"
                    );
            }

        } while (true);
    }
}