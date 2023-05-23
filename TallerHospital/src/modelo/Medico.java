/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author omerb
 */
public class Medico {
    private String nombreDoctor;
    private String especialidad;
    private double sueldo;

    public Medico(String nomDoctor, String espe, double suel) {
        nombreDoctor = nomDoctor;
        especialidad = espe;
        sueldo = suel;
    }

    public void establecerNombreDoctor(String nomDoctor) {
        nombreDoctor = nomDoctor;
    }

    public void establecerEspecialidad(String espe) {
       especialidad = espe;
    }

    public void establecerSueldo(double suel) {
        sueldo = suel;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
    
    
    
    
}
