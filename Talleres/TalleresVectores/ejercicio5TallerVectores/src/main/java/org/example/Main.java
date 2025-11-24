package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n, numeroMayor=0, posicionMayor = 0;

        System.out.print("Ingrese el numero de datos para los vectores: ");
        n = scanner.nextInt();

        int [] numeroEnteros = new int[n];

        System.out.print("Ingrese los datos del vector 0: ");
        numeroEnteros[0] = scanner.nextInt();
        numeroMayor=numeroEnteros[0];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Ingrese los datos de cada vector " +i+ " : ");
            numeroEnteros[i] = scanner.nextInt();

            if (numeroEnteros[i] > numeroMayor)
            {
                numeroMayor = numeroEnteros[i];
                posicionMayor = i;
            }
        }
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("la pocision del numero mayor es: "+posicionMayor);
    }
}
