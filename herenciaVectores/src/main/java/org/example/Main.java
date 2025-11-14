package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Vector vector = new Vector();

        int mayor, tam;
        float promedio;
        byte opcion;

        System.out.print("¿Cuantos elementos tiene el vector?: ");
        tam = scanner.nextInt();

        int [] datos = new int[tam];
        do
        {
            System.out.println("\n operaciones sobre vectores");
            System.out.println("1. Leer el vector ");
            System.out.println("2. Imprimir vector ");
            System.out.println("3. Mayor elemento en posicion par ");
            System.out.println("4. Mayor elemento en la posicion impar");
            System.out.println("5. Promedio multiplos de cinco ");
            System.out.println("6. Salir ");
            do
            {
                System.out.print("Digite una opcion entre 1 y 6: ");
                opcion = scanner.nextByte();
            }
            while (opcion < 1 || opcion > 6);

            switch (opcion)
            {
                case 1:
                    datos=vector.leervector(tam);
                break;

                case 2:
                    vector.imprimirVector(datos);
                break;

                case 3:
                    mayor = vector.hallarMayorPar(datos);
                    System.out.println("\n El mayor elemento en una posicion par es" + mayor);
                break;

                case 4:
                    mayor = vector.hallarMayorImpar(datos);
                    if (mayor != -1)
                        System.out.println("\n El mayor elemento en una posicion impar es" + mayor);
                    else
                        System.out.println("\n No hay elementos impares");
                break;

                case 5:
                    promedio = vector.hallarPromedio(datos);
                    System.out.println("\n El promedio es: " + promedio);
                break;

                case 6:
                    System.out.println("Has terminado el programa con exito");
                break;

            }
        }
        while (opcion != 6);
    }
}