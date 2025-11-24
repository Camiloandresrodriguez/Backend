package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int [] columnaA = new int[8];
        int [] columnaB = new int[8];
        int [] columnaC = new int[8];

        for (int i = 0; i < 8; i++)
        {
            columnaA[i] = i + 1;
            columnaB[i] = i + 1;
        }

        for (int i = 0; i < 8; i++)
        {
            columnaC[i] = columnaA[i] + columnaB[i] + (8 - i);
        }

        System.out.println("Resultado de vectores ");
        for (int i = 0; i < 8; i++)
        {
            System.out.println(columnaC[i]);
        }
    }
}
