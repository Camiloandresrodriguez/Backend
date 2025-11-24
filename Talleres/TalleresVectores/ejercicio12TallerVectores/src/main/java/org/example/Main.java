package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        float calificacion1, calificacion2, calificacion3, calificacion4, promedio;

        System.out.print("Digite el numero de estudiantes a calificar :");
        n = scanner.nextInt();

        String [] nombres = new String[n];
        float [] promedios = new float[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Digite el nombre del estudiante: ");
            nombres [i] = scanner.next();
            System.out.print("Digite la primera nota: ");
            calificacion1 = scanner.nextFloat();
            System.out.print("Digite la segunda nota: ");
            calificacion2 = scanner.nextFloat();
            System.out.print("Digite la tercera nota: ");
            calificacion3 = scanner.nextFloat();
            System.out.print("Digite la cuarta nota: ");
            calificacion4 = scanner.nextFloat();

            promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;

            promedios [i] = promedio;
        }

        System.out.println("\n Listado de estudiantes y sus promedios ");
        for (int i = 0; i < n; i++)
        {
            System.out.println("El estudiante " + nombres[i] + " tiene un promedio de: " + promedios[i]);
        }
    }
}

