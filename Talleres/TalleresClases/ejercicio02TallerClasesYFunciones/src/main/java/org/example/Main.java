package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float area, perimetro, lado = 0;
        byte opcion;
        char salir;

        do
        {
            System.out.println("Bienvenidos al menu para hallar el perimetro y el area de un cuadrado ..");
            System.out.println("1. Hallar el perimetro de un cuadrado. ");
            System.out.println("2. Hallar el area de un cuadrado. ");
            System.out.println("Salir del menu. ");
            System.out.print("Elija una opcion entre el 1 y el 3: ");
            opcion = scanner.nextByte();

            switch (opcion)
            {
                case 1:
                    System.out.print("Digite la dimension de uno de los lados del cuadrado: ");
                    lado = scanner.nextFloat();
                    PerimetroYAreaCuadrado perimetroYAreaCuadrado = new PerimetroYAreaCuadrado();
                    perimetro = perimetroYAreaCuadrado.hallarElPerimetro(lado);
                    System.out.println("El perimetro del cuadrado es: "+perimetro);
                break;

                case 2:
                    System.out.print("Digite la dimencion de uno de los lados del cuadrado: ");
                    lado = scanner.nextFloat();
                    PerimetroYAreaCuadrado perimetroYAreaCuadrado1 = new PerimetroYAreaCuadrado();
                    area = perimetroYAreaCuadrado1.hallarElArea(lado);
                    System.out.println("El area del cuadaro es: "+area);
                break;

                case 3:
                    System.out.print("¿Realmente quiere salir del menu? S = si N 0 no: ");
                    salir = scanner.next().charAt(0);
                    if (salir != 'S' && salir != 's')
                    {
                        opcion = 0;
                    }
                break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo...");
            }
        }
        while(opcion != 3);
    }
}
