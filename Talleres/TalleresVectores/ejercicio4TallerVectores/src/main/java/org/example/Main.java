package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, notadefinitiva = 0, mayor, menor, suma = 0, promedio;
        String nombre = "n";
        int n, cant, posMayor, posMenor, cantMayorPromedio =0;

        System.out.print("Ingrese el numero de estudiantes a registrar: ");
        n = scanner.nextInt();

        String [] nombresEstudiantes = new String[n];
        float [] notadef= new float[n];

        for (int i = 0; i < n; i++)
        {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = scanner.next();
            nombresEstudiantes[i] = nombre;

            System.out.print("Ingrese la primera nota: ");
            nota1 = scanner.nextFloat();
            System.out.print("Ingrese la segiunda nota: ");
            nota2 = scanner.nextFloat();
            System.out.print("Ingrese la tercera nota: ");
            nota3 = scanner.nextFloat();
            System.out.print("Ingrese la cuarta nota: ");
            nota4 = scanner.nextFloat();

            notadefinitiva = (nota1 + nota2 + nota3 + nota4)/4;
            notadef[i]=notadefinitiva;
        }
        System.out.println("Esudiantes que obtuvieron una nota mayor a 3:");
        for (int i = 0; i < n; i++)
        {
            if (notadef[i] >= 3)
            {
                System.out.println("El estudiante: "+nombresEstudiantes[i]+ " tiene una nota definitiva de: "+notadef[i]);
            }
        }
        System.out.println("Estudiantes que obtuvieron una nota menor a 3: ");
        for (int i = 0; i < n; i++)
        {
            if (notadef[i] < 3)
            {
                System.out.println("El estudiante: "+nombresEstudiantes[i]+ " tiene una nota definitiva de: "+notadef[i]);
            }
        }

        mayor=notadef[0];
        menor=notadef[0];
        posMenor=0;
        posMayor=0;

        for (int i = 0; i < n; i++)
        {
            if (notadef[i] > mayor)
            {
                mayor = notadef[i];
                posMayor = i;
            }
            if (notadef[i] < menor)
            {
                menor = notadef[i];
                posMenor = i;
            }
            suma = suma + notadef[i];
        }
        promedio = suma/n;

        for (int i = 0; i < n; i++)
        {
            if (notadef[i]>promedio)
            {
                cantMayorPromedio++;
            }
        }

        System.out.println("Estudiantes con la mayor nota: " +nombresEstudiantes[posMayor]+ " con una nota de: "+mayor);
        System.out.println("Estudiantes con la mayor nota: " +nombresEstudiantes[posMenor]+ " con una nota de: "+menor);
        System.out.println("El promedio de notas definitivas es: "+promedio);
        System.out.println("Cantidad de estudiantes con nota mayor al promedio de notas definitivas son: " +cantMayorPromedio);
    }
}
