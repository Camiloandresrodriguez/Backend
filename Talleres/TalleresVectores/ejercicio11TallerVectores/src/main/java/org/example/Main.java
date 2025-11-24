package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numerosVctor1, numerosVector2, numeroTemporal;

        System.out.print("Ingrese el numero de datos del vector 1: ");
        numerosVctor1 = scanner.nextInt();

        int[] vector1 = new int[numerosVctor1];
        for (int i = 0; i < numerosVctor1; i++)
        {
            vector1[i] = random.nextInt(50);
        }

        System.out.println("Posiciones del vector 1 ");
        for (int i = 0; i < numerosVctor1; i++)
        {
            System.out.println(vector1[i] + " ");
        }

        System.out.print("Ingrese el numero de datos del vector 2: ");
        numerosVector2 = scanner.nextInt();

        int[] vector2 = new int[numerosVector2];
        for (int i = 0; i < numerosVector2; i++)
        {
            vector2[i] = random.nextInt(50);
        }

        System.out.println("Posiciones del vector 1 ");
        for (int i = 0; i < numerosVector2; i++)
        {
            System.out.println(vector2[i] + " ");
        }

        for (int i = 0; i < numerosVctor1; i +=2)
        {
            numeroTemporal = vector1[i];
            vector1 [i] = vector2 [i];
            vector2 [i] = numeroTemporal;
        }

        System.out.println("\n\n Vectores despues del cambio de posiciones.");

        System.out.println("Vector 1 ");
        for (int i = 0; i < numerosVctor1; i++)
        {
            System.out.println(vector1[i] + " ");
        }

        System.out.println("Vector 2 ");
        for (int i = 0; i < numerosVector2; i++)
        {
            System.out.println(vector2[i] +  " ");
        }
    }
}
