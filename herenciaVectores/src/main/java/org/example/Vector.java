package org.example;

import java.util.Random;
import java.util.Scanner;

public class Vector extends Operaciones
{
    Random random = new Random();
    public int [] leervector(int tam)
    {
        int [] datos = new int[tam];
        for (int i = 0; i < tam; i++)
        {
            datos[i] = random.nextInt(100);
        }
        return datos;
    }

    public void imprimirVector(int[] datos)
    {
        System.out.println("\n\t ELEMENTOS DEL VECTOR");
        for (int i = 0; i < datos.length; i++)
        {
            System.out.println(datos[i] + " ");
        }
    }
}
