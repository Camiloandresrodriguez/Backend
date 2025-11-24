package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int cedulaOyente, n, contador=0;

        System.out.print("Ingrese el numero de boletas disponibles: ");
        n = scanner.nextInt();

        int [] cedulas = new int[n];

        while (contador < n)
        {
            System.out.print("Digite la cedula del oyente: ");
            cedulaOyente = scanner.nextInt();

            boolean repetida = false;

            for (int i = 0; i < contador; i++)
            {
                if (cedulas[i] == cedulaOyente){
                    repetida = true;
                    break;
                }
            }

            if (repetida){
                System.out.println("EL oyente ya recibio una boleta no tiene derecho a mas: ");
            }
            else {
                cedulas[contador] = cedulaOyente;
                contador ++;
                System.out.println("Boleta entregada exitoxamente: ");
            }
            System.out.println();
        }
        System.out.println("Boletas entregadas exitomante. ");
    }
}
