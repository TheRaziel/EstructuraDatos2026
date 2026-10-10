/* 
package mx.edu.uttt.Recursividad;

import javax.swing.JOptionPane;

public class MenuRecursividad {

    public static void mostrar() {

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(
                    "====== RECURSIVIDAD ======\n\n" +
                            "1) Factorial de un numero\n" +
                            "2) Multiplicacion mediante suma\n" +
                            "3) Potencia\n" +
                            "4) Sumar numeros\n" +
                            "0) Regresar\n\n" +
                            "Seleccione una opcion:"
            );

            if (opcion == null) {
                return;
            }

            switch (opcion) {

                case "1":
                    FactorialNumeros.ejecutar();
                    break;

                case "2":
                    MultiplicacionMedianteSuma.ejecutar();
                    break;

                case "3":
                    Potencia.ejecutar();
                    break;

                case "4":
                    SumarNumeros.ejecutar();
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
 */