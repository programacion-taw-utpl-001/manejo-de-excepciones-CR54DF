/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author crsyhian
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        boolean opcion = true;
        Estudiante[] no = new Estudiante[4];
        double[] mate = new double[4];
        double[] sociales = new double[4];
        do {
            Estudiante es = new Estudiante();
            Asignacion as = new Asignacion();

            try {
                for (int i = 0; i < 4; i++) {
                    System.out.println("ingrese la nnombre del estudiante");
                    es.setNombre(en.nextLine());
                    System.out.println("ingrese el apellido del estudiante");
                    es.setApellido(en.nextLine());
                    
                    System.out.println("ingrese la nota de matematicas ");
                    as.getNotas_sociales();
                    
                }
            } catch (Exception e) {

            }

        } while (opcion);

    }

}
