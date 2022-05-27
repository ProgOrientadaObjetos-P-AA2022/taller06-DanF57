/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDos;

/**
 *
 * @author Daniel
 */
public class Enfermero {

    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String nom, double suel, String t) {
        nombre = nom;
        sueldo = suel;
        tipo = t;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

}
