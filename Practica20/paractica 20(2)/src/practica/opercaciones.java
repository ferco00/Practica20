/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

public class opercaciones {

    public void res() {
        Scanner SC = new Scanner(System.in);
        while (true) {
            System.out.println("--------menu---------");
            System.out.println("1.-Suma");
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicacion");
            System.out.println("4.-Divicion");
            System.out.println("5.-Salir");
            System.out.println("ingrese la opcion que desea: ");

            int opcion = SC.nextInt();

            if (opcion == 5) {
                break;

            }
            double resultado = 0;

            System.out.println("ingrese la cantidad de numeros: ");
            int cantidad = SC.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("ingrese el numero " + (i + 1));
                        double numero = SC.nextDouble();
                        resultado += numero;
                    }
                    System.out.println("\nSuma: " + resultado + "\n");
                    break;
                case 2:
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("ingrese el numero " + (i + 1));
                        double numero = SC.nextDouble();
                        resultado -= numero;
                    }
                    System.out.println("\nResta: " + resultado + "\n");
                    break;
                case 3:
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("ingrese el numero " + (i + 1));
                        double numero = SC.nextDouble();
                        resultado *= numero;
                    }
                    System.out.println("\nMultiplicacion: " + resultado + "\n");
                    break;
                case 4:
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("ingrese el numero " + (i + 1));
                        double numero = SC.nextDouble();
                        resultado /= numero;
                    }
                    System.out.println("\nDivision: " + resultado + "\n");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        opercaciones j = new opercaciones();
        j.res();

    }
}
