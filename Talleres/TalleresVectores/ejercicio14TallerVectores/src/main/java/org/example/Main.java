package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nVector, mVector, numeroTemporal = 0;

        System.out.print("Ingrese el numero de datos del vector 1: ");
        nVector = scanner.nextInt();

        int [] vector1 = new int[nVector];

        for (int i = 0; i < nVector; i++)
        {
            vector1[i] = random.nextInt(50);
        }

        System.out.print("Ingrese el numero de datos del vector 1: ");
        mVector = scanner.nextInt();

        int [] vector2 = new int[mVector];

        for (int i = 0; i < nVector; i++)
        {
            vector2[i] = random.nextInt(50);
        }

        for (int i = 0; i < nVector - 1; i++)
        {
            for (int j = 0; j < nVector - 1 - i; j++)
            {
            if (vector1[j] > vector1[j + 1])
                numeroTemporal = vector1[j];
                vector1[j] = vector1[j + 1];
                vector1[j + 1] = numeroTemporal;
            }
        }

        for (int i = 0; i < nVector - 1; i++)
        {
            for (int j = 0; j < mVector - 1 - i; j++)
            {
                if (vector2[j] > vector2[j + 1])
                    numeroTemporal = vector2[j];
                    vector2[j] = vector2[j + 1];
                    vector2[j + 1] = numeroTemporal;
            }
        }

        System.out.println("Posiciones del vector 1 ");
        for (int i = 0; i < nVector; i++)
        {
            System.out.println(vector1[i] + " ");
        }

        System.out.println("Posiciones del vector 2 ");
        for (int i = 0; i < mVector; i++)
        {
            System.out.println(vector2[i] + " ");
        }

        int[] vector3 = new int[nVector + mVector];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nVector && j < mVector)
        {
            if (vector1[i] <= vector2[j])
            {
                vector3[k] = vector1[i];
                i++;
            } else {
                vector3[k] = vector2[j];
                j++;
            }
            k++;
        }

        while (i < nVector)
        {
            vector3[k] = vector1[i];
            i++;
            k++;
        }

        while (j < mVector)
        {
            vector3[k] = vector2[j];
            j++;
            k++;
        }

        System.out.println("\n\nVector 3 (fusionado y ordenado):");
        for (int t = 0; t < nVector + mVector; t++)
        {
            System.out.print(vector3[t] + " ");
        }
    }
}

