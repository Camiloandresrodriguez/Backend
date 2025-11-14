package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        DecimalFormat decimalFormat =new DecimalFormat("###.#");

        int num1,num2,suma,resta,multiplicacion;
        float division;
        byte opcion;

        System.out.print("ingrese numero uno: ");
        num1=scanner.nextInt();
        System.out.print("ingrese numero dos: ");
        num2=scanner.nextInt();
        do
        {
            System.out.println("\n operaciones");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. salir");
            System.out.print("Digite una opcion entre el 1 y el 5: ");
            opcion =scanner.nextByte();

            switch (opcion)
            {
                case 1:
                    suma = num1 + num2;
                    System.out.println("......SUMA......");
                    System.out.print("\n La suma de los numero es: " + suma);
                    break;

                case 2:
                    resta = num1 - num2;
                    System.out.println("......RESTA......");
                    System.out.print("\n La resta de los numero es: " + resta);
                    break;

                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("......MULTIPLICACIÓN......");
                    System.out.print("\n La multiplicacion de los numero es: " + multiplicacion);
                    break;

                case 4:
                    if (num2 != 0)
                    {
                        division=(float)num1/num2;
                        System.out.println("\n La division de los numeros es: " + decimalFormat.format(division));
                    }
                    else
                        System.out.println("\n operacion no valida....");
                break;
            }
        }
        while(opcion !=5);
    }
}