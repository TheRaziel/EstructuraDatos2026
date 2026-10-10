//package mx.edu.uttt.tda;
//
//import javax.swing.JOptionPane;
//
//public class TestEmpleado {
//
//    private static Empleado empl;
//
//    public static void main(String[] args) {
//        iniciar();
//        imprimir();
//    }
//
//    public static void iniciar() {
//
//        String numeroNomina = solicitarTexto("Número de nómina");
//        String nombre = solicitarTexto("Nombre completo");
//
//        empl = new Empleado(
//                numeroNomina,
//                "Masculino",
//                34000.56,
//                true
//        );
//    }
//
//    public static String solicitarTexto(String valor) {
//
//        return JOptionPane.showInputDialog(
//                null,
//                "Introduce el " + valor
//        );
//    }
//
//    public static void imprimir() {
//
//        String salida = "Datos del Empleado:\n"
//                + empl.toString();
//
//        JOptionPane.showMessageDialog(
//                null,
//                salida
//        );
//    }
//}