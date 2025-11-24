package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n, dato, pos=0;

        System.out.print("Digite el numero de vectores: ");
        n = scanner.nextInt();

        int [] vector= new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Digite los datos que estaran en el vector " +i+ ":");
            vector[i] = scanner.nextInt();
        }

        System.out.print("Escriba el dato que desee buscar: ");
        dato = scanner.nextInt();

        for (int i = 0; i < n; i++)
        {
            if (vector[i] == dato)
            {
                pos = i;
                break;
            }
        }
        System.out.println("el dato ingresado " +dato+ " esta en la posicion : " +pos);
    }
}
