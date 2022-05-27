package paqueteUno;

import java.util.Scanner;

import paqueteDos.Ciudad;
import paqueteDos.Enfermero;
import paqueteDos.EntidadHospitalitaria;
import paqueteDos.Medico;


public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        System.out.println("Ingrese el nombre del Hospital");
        String nomHospital = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la provincia");
        String provincia = entrada.nextLine();
        
        Ciudad c1 = new Ciudad(ciudad, provincia);
        
        //Arreglo de tipo Medicos
        System.out.println("Ingrese el numero de médicos que tiene el Hospital");
        int numeroMedicos = entrada.nextInt();
        Medico[] medicos = new Medico[numeroMedicos];
        
        entrada.nextLine(); //Limpieza Buffer

        for (int i = 0; i < numeroMedicos; i++) {

            System.out.println("Ingrese el nombre del médico");
            String nombreMedico = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el medico");
            double sueldoMedico = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese la especialidad del medico");
            String especialidad = entrada.nextLine();
            
            Medico m = new Medico(nombreMedico, sueldoMedico, especialidad);
            
            medicos[i] = m;
        }

        //Arreglo Enfermeros
        System.out.println("Ingrese el número de enfermeros(as)");
        int numeroEnfermeros = entrada.nextInt();
        Enfermero[] enfermeros = new Enfermero[numeroEnfermeros];

        entrada.nextLine(); //Limpieza Buffer

        for (int i = 0; i < numeroEnfermeros; i++) {
            System.out.println("Ingrese el nombre del enfermero(a)");
            String nombreEnfermero = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe el enfermero(a)");
            double sueldoEnfermero = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de contrato que tiene el "
                    + "enfermero(a)");
            String contrato = entrada.nextLine();

            Enfermero enf = new Enfermero(nombreEnfermero, sueldoEnfermero,
                    contrato);

            enfermeros[i] = enf;

        }
        int numeroEspecialidades = numeroMedicos + numeroEnfermeros;
        
        //Objeto de tipo Hospital
        EntidadHospitalitaria hospital = new EntidadHospitalitaria(
                nomHospital,
                direccion, 
                c1, 
                numeroEspecialidades, 
                medicos, 
                enfermeros);
        
        hospital.calcularSueldo();

        System.out.printf("\n%s\n", hospital);
    }

}