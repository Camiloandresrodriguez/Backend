package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n, dato, contador=0;


        System.out.print("escriba el numero de elementos: ");
        n = scanner.nextInt();

        int [] vector = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Digite el dato" + (i+1)+ ":");
            vector[i] = scanner.nextInt();
        }

        System.out.print("digite el dato que desea buscar: ");
        dato = scanner.nextInt();

        for (int i = 0; i < n; i++)
        {
            if (vector[i] == dato)
            {
                contador ++;
            }
        }
        System.out.println("el numero " +dato+ " aparece " +contador+ " veces en el vector en las posiciones");
    }
}
