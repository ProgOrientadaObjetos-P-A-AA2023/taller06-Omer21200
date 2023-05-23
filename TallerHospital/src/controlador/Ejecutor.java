/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.CiudadHospital;
import modelo.Enfermero;
import modelo.Hospital;
import modelo.Medico;

/**
 *
 * @author omerb
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombreH, nombreD, nombreE, especialidad, tipoT;
        String ciudadH, provinciaH, direccion;
        int numEspecia, num;
        double sueldoD, sueldoE;
        Hospital hospi;
        CiudadHospital ciu;
        Medico[] medicos;
        Medico medico;
        Enfermero[] enfermeros;
        Enfermero enfermero;
        System.out.print("Ingrese el nombre del Hospital: ");
        nombreH = sc.nextLine();
        System.out.print("Ingrese la dirección del Hospital: ");
        direccion = sc.nextLine();
        System.out.print("Ingrese la ciudad del Hospital: ");
        ciudadH = sc.nextLine();
        System.out.print("Ingrese la provincia del Hospital: ");
        provinciaH = sc.nextLine();
        System.out.println("Ingrese el numero de especialidades del Hospital: ");
        numEspecia = sc.nextInt();
        ciu = new CiudadHospital(ciudadH, provinciaH);
        System.out.print("Ingrese le numero de Doctores: ");
        num = sc.nextInt();
        medicos = new Medico[num];
        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.print("Ingrese el nombre del doctor: ");
            nombreD = sc.nextLine();
            System.out.print("Ingrese la especialdad del doctor: ");
            especialidad = sc.nextLine();
            System.out.print("Ingrese el sueldo del doctor: ");
            sueldoD = sc.nextDouble();
            medico = new Medico(nombreD, especialidad, sueldoD);
            medicos[i] = medico;
        }
        sc.nextLine();
        System.out.print("Ingrese el numero de enfermeros: ");
        num = sc.nextInt();
        enfermeros = new Enfermero[num];
        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.print("Ingrese el nombre del enfermero: ");
            nombreE = sc.nextLine();
            System.out.println("Ingrese el tipo de contrato del enfermero (Contrato,Nombramiento): ");
            tipoT = sc.nextLine();
            System.out.print("Ingrese el sueldo del Enfermero: ");
            sueldoE = sc.nextDouble();
            enfermero = new Enfermero(nombreE, tipoT, sueldoE);
            enfermeros[i] = enfermero;
        }
        hospi = new Hospital(nombreH, numEspecia, direccion, ciu, medicos, enfermeros);
        hospi.establecerTotalSueldo();
        System.out.println(hospi);

    }

}
