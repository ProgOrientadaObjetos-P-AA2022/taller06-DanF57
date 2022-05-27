package paqueteDos;

/**
 *
 * @author Daniel
 */
public class Medico {

    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String nom, double suel, String espe) {
        nombre = nom;
        sueldo = suel;
        especialidad = espe;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

}
