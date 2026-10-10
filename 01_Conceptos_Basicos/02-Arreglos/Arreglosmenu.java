package mx.edu.uttt.arreglos;

import mx.edu.uttt.Menu.menu;
import mx.edu.uttt.arreglos.vectores.MenuVectores;
import mx.edu.uttt.arreglos.matrices.MenuMatrices;

import javax.swing.JOptionPane;

public class Arreglosmenu {

    public static void mostrar() {

        String opcion;

        do {

            opcion = menu.menuArreglos();

            if (opcion == null) {
                return;
            }

            switch (opcion) {

                case "1":
                    MenuVectores.mostrar();
                    break;

                case "2":
                    MenuMatrices.mostrar();
                    break;

                case "0":
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