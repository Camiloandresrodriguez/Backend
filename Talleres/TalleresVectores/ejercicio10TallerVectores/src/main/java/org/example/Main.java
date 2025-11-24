package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nVectores1, nVectores2, nVectores3;
        float multiplicacion;

        System.out.print("Ingrese el numero de datos que van a ingresar en el vector 1: ");
        nVectores1 = scanner.nextInt();

        int [] vector1 = new int[nVectores1];

        for (int i = 0; i < nVectores1; i++)
        {
            vector1 [i] = random.nextInt(100);
        }

        System.out.println("datos del vector 1 ");
        for (int i = 0; i < nVectores1; i++)
        {
            System.out.println(vector1 [i] + " ");
        }

        System.out.print("Ingrese el numero de datos que van a ingresar en el vector 2: ");
        nVectores2 = scanner.nextInt();

        int [] vector2 = new int[nVectores2];
        for (int i = 0; i < nVectores2; i++)
        {
            vector2 [i] = random.nextInt(100);
        }

        System.out.println("datos del vector 2 ");
        for (int i = 0; i < nVectores2; i++)
        {
            System.out.println(vector2[i] + " ");
        }

        int[] vector3 = new int[nVectores1];

        for (int i = 0; i < nVectores1; i++)
        {
            vector3[i] = vector1[i] * vector2[nVectores2 - 1 - i];
        }

        System.out.println("\nVector resultado (multiplicación cruzada):");
        for (int i = 0; i < vector3.length; i++)
        {
            System.out.print(vector3[i] + " ");
        }
    }
}
/*
Se tienen dos vectores A y B de N posiciones almacenando números.
Se pide crear un tercer vector con la multiplicación de los elementos almacenados así:
la primera posición del vector A multiplicado por la última posición del vector B;
 la segunda posición del vector A multiplicada por la penúltima posición del vector B,
 etc.  Imprimir los tres vectores
 */
