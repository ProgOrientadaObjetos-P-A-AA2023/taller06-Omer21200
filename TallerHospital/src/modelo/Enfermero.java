/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author omerb
 */
public class Enfermero {

    private String nombreEnfermero;
    private String tipo;
    private double sueldo;

    public Enfermero(String nomEnfermero, String tip, double suel) {
        nombreEnfermero = nomEnfermero;
        tipo = tip;
        sueldo = suel;
    }

    public void establecerNombreEnfermero(String nomEnfermero) {
        nombreEnfermero = nomEnfermero;
    }

    public void establecerTipo(String tip) {
        tipo = tip;
    }

    public void establecerSueldo(double suel) {
        sueldo = suel;
    }

    public String obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

}
