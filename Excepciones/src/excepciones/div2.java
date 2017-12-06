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
public class div2 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int numerador, denominador;
        boolean opcion = true;
        do {
            try {

                System.out.println("ingrece el numerador");
                numerador = en.nextInt();
                System.out.println("ingrece denominador");
                denominador = en.nextInt();
                int div = numerador / denominador;
                System.out.println("resultado" + div);
                opcion = false;

            } catch (Exception e) {
                //System.out.println("no se divide para 0");
                System.err.print(e);
            }

        } while (opcion);

    }

}
