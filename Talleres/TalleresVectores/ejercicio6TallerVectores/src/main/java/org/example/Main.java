package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n, posicion=0, numeroMayor =0;

        System.out.print("Digite la cantida de campos del vector: ");
        n = scanner.nextInt();

        int [] numerosEnteros = new int[n];

        System.out.print("digite los datos del vector 0: ");
        numerosEnteros[0] = scanner.nextInt();
        numeroMayor = numerosEnteros [0];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Digite los datos de cada vector " +i+ ":");
            numerosEnteros[i]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            if (numerosEnteros[i]>numeroMayor){
                numeroMayor = numerosEnteros[i];
                posicion = i;
            }
        }

        System.out.println("El numero mayor es: "+numeroMayor);
        System.out.println("La posicion del numero mayor es: "+posicion);

        if (posicion == n -1)
        {
            System.out.println("no hay posiciones despues del numero mayor: ");
        }
        else
        {
            System.out.println("Pocisiones que estan luego del numero mayor: ");
            for (int i = posicion; i < n; i++) {
                System.out.println(numerosEnteros[i] + "");
            }
        }
    }
}
