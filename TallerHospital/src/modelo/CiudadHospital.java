/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author omerb
 */
public class CiudadHospital {

    private String nombreCicudad;
    private String provinciaCicudad;

    public CiudadHospital() {
        nombreCicudad = "Loja";
        provinciaCicudad = "Loja";
    }

    public CiudadHospital(String nomCicudad, String proCicudad) {
        nombreCicudad = nomCicudad;
        provinciaCicudad = proCicudad;
    }

    public void establecerNombreCicudad(String nomCicudad) {
        nombreCicudad = nomCicudad;
    }

    public void establecerProvinciaCicudad(String proCicudad) {
        provinciaCicudad = proCicudad;
    }

    public String obtenerNombreCicudad() {
        return nombreCicudad;
    }

    public String obtenerProvinciaCicudad() {
        return provinciaCicudad;
    }

}
