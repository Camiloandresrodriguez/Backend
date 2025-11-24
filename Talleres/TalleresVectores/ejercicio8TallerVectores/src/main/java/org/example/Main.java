package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcion;
        char sw;

        int [] clima = new int[360];

        for (int i = 0; i < clima.length; i++)
        {
            clima[i] = random.nextInt(3);
        }

        int soleado = 0, nublado = 0, lluvioso = 0;

        for (int i = 0; i < clima.length; i++)
        {
            if (clima[i] == 0)
            {
                soleado++;
            }
            else if (clima[i] == 1)
            {
                nublado++;
            }
            else
            {
                lluvioso++;
            }
        }
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Número de días soleados");
            System.out.println("2. Número de días nublados");
            System.out.println("3. Número de días lluviosos");
            System.out.println("4. Porcentaje de días soleados en relación al mes");
            System.out.println("5. Porcentaje de días nublados en relación al mes");
            System.out.println("6. Porcentaje de días lluviosos en relación al mes");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Dias soleados: "+soleado);
                break;

                case 2:
                    System.out.println("Dias nublados: "+nublado);
                break;

                case 3:
                    System.out.println("Dias lluviosos: "+lluvioso);
                break;

                case 4:
                    System.out.println("Porcentaje de dias soleados "+ (soleado * 100/360) + " % ");
                break;

                case 5:
                    System.out.println("Porcentaje de dias nublados "+ (nublado * 100/360) + " % ");
                break;

                case 6:
                    System.out.println("Porcentaje de dias lluviosos "+ (lluvioso * 100/360)+ " % ");
                break;

                case 7:
                    System.out.print("¿Realmente desea salir del menu? marque S= si o N=no : " );
                    sw = scanner.next().charAt(0);
                    if (sw != 'S' && sw != 's')
                    {
                        opcion = 0;
                    }
                break;

                default:
                    System.out.print("Dato u opcion no valida intente nuevamente: ");
            }
        }
        while (opcion!=7);
    }
}