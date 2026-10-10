package mx.edu.uttt.tda;

public class Empleado {

    private String numeroNomina;
    private String nombre;
    private String sexo;
    private double sueldo;
    private boolean activo;

    private static int contarObjetos;

    public Empleado() {
        contarObjetos++;
    }

    public Empleado(String numeroNomina, String nombre, String sexo,
                    double sueldo, boolean activo) {

        this.numeroNomina = numeroNomina;
        this.nombre = nombre;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;

        contarObjetos++;
    }

    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // CONTADOR DE OBJETOS

    public static int getContarObjetos() {
        return Empleado.contarObjetos;
    }

    @Override
    public String toString() {

        return "Empleado{" +
                "numeroNomina='" + numeroNomina + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", sueldo=" + sueldo +
                ", activo=" + activo +
                '}';
    }
}