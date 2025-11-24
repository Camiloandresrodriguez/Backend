package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n, numeroTemporal;

        System.out.println("Ingrese el numero de datosque estaran enel vector: ");
        n = scanner.nextInt();

        int [] vector = new int[n];


        for (int i = 0; i < n; i++)
        {
            vector[i] = random.nextInt(50);
        }

        System.out.println("\n vector original ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(vector[i] + " ");
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1; j++)
            {
                if (vector[j] > vector[j + 1])
                {
                 numeroTemporal = vector[j];
                 vector [j] = vector [j +1];
                 vector [j + 1] = numeroTemporal;
                }
            }
        }

        System.out.println("vector ordenado ascendentemente ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(vector[i] + " ");
        }
    }
}
