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
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese sue edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.printf("su nombre %s" ,nombre);
        System.out.printf("su edad %d", edad);
    }

}
