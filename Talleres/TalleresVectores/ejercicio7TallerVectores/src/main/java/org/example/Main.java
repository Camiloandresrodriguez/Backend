package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        float promedioVector1 =0, promedioVector2 = 0, sumaVector1 = 0, sumaVector2 = 0;
        int nv1, nv2;


        System.out.print("Digete el numero de elementos del vector 1: ");
        nv1 = scanner.nextInt();

        int [] numerosEnterosVector1 = new int[nv1];

        for (int i = 0; i < nv1; i++)
        {
            System.out.print("Digite el dato a almacenar en el espacio "+i+ " del vector 1: ");
            numerosEnterosVector1[i] = scanner.nextInt();
            sumaVector1 = sumaVector1 + numerosEnterosVector1[i];
        }
        System.out.print("Digite el numero de elementos del vetor 2: ");
        nv2 = scanner.nextInt();

        int [] numerosEnterosVector2 = new int[nv2];

        for (int i = 0; i < nv2; i++)
        {
            System.out.print("Digite el dato a almacenar en el espacio " +i+ " del vector 2: ");
            numerosEnterosVector2[i]=scanner.nextInt();
            sumaVector2 = sumaVector2 + numerosEnterosVector2[i];
        }

        promedioVector1 = sumaVector1 / nv1;
        System.out.println("El promedio de los numeros enteros del vector 1 es de: "+promedioVector1);
        promedioVector2 = sumaVector2 / nv2;
        System.out.println("El promedio de los numeros enteros del vector 2 es de:" +promedioVector2);

        if (promedioVector1 > promedioVector2)
        {
            System.out.println("El promedio mayor es del vector 1: " + " promedio = "+promedioVector1);
        }
        else
        {
            System.out.println("El promedio mayor es del vector 2: " + " promedio = " + promedioVector2);
        }
    }
}
