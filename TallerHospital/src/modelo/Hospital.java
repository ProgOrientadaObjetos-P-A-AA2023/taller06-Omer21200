/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author omerb
 */
public class Hospital {

    private String nombreHospital;
    private int numEspecia;
    private double totalSueldo=0;
    private String direcHospital;
    private CiudadHospital ciudad;
    private Medico[] medicos;
    private Enfermero[] enfermeros;

    public Hospital(String nomHospital, int numeroEspecia, String diHospital, CiudadHospital ciuda, Medico[] medi, Enfermero[] enfer) {
        nombreHospital = nomHospital;
        numEspecia = numeroEspecia;
        direcHospital = diHospital;
        ciudad = ciuda;
        medicos = medi;
        enfermeros = enfer;
    }

    public void establecerNombreHospital(String nomHospital) {
        nombreHospital = nomHospital;
    }

    public void establecerNumEspecia(int numeroEspecia) {
        numEspecia = numeroEspecia;
    }

    public void establecerTotalSueldo() {
        for (int i = 0; i < obtenerMedicos().length; i++) {
            totalSueldo=totalSueldo+obtenerMedicos()[i].obtenerSueldo();
        }
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            totalSueldo=totalSueldo+obtenerEnfermeros()[i].obtenerSueldo();
        }
    }

    public void establecerDirecHospital(String diHospital) {
        direcHospital = diHospital;
    }

    public void establecerCiudad(CiudadHospital ciuda) {
        ciudad = ciuda;
    }

    public void establecerMedicos(Medico[] me) {
        medicos = me;
    }

    public void establecerEnfermeros(Enfermero[] enfer) {
        enfermeros = enfer;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public int obtenerNumEspecia() {
        return numEspecia;
    }

    public double obtenerTotalSueldo() {
        return totalSueldo;
    }

    public String obtenerDirecHospital() {
        return direcHospital;
    }

    public CiudadHospital obtenerCiudad() {
        return ciudad;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    @Override
    public String toString() {
        String cadena = String.format("HOSPITAL %s",nombreHospital).toUpperCase();
        cadena = String.format("%s\nDirección: %s\nCiuadad: %s\nProvincia: %s\n"
                + "Número de especialidades: %d\nLista de médicos\n", cadena,
                 direcHospital, ciudad.obtenerNombreCicudad(), ciudad.obtenerProvinciaCicudad(),
                 numEspecia); 
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s \n", cadena,
                    obtenerMedicos()[i].obtenerNombreDoctor(),obtenerMedicos()[i].obtenerSueldo(),obtenerMedicos()[i].obtenerEspecialidad());
        }
        cadena = String.format("%sLista de enfermeros: \n",cadena);
         for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s \n", cadena,
                    obtenerEnfermeros()[i].obtenerNombreEnfermero(),obtenerEnfermeros()[i].obtenerSueldo(),obtenerEnfermeros()[i].obtenerTipo());
        }
         cadena = String.format("%sTotal de suledos a pagar por mes: %.2f\n",cadena,totalSueldo); 
        return cadena;
    }

}
