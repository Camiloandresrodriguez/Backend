package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Instanciar clase Scanner

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("$0,000.0");

        //Definir variables

        float salarioBasico, salarioNeto, porcentajeDescuento;
        double porcentajeImpuesto;
        byte opcion;

        // Leer el salario basico
        System.out.print("¿Cual es el salario basico? ");
        salarioBasico = scanner.nextFloat();

        // Instanciar clase salario luego de definir el salario basico

        Salario salario = new Salario(salarioBasico);

        do
        {
            System.out.println("\n\t Tipos de salarios ");
            System.out.println("1. salario a termino indefinido ");
            System.out.println("2. Salario por prestacion de servicios ");
            System.out.println("3. Salario Integral ");
            System.out.println("4. Salir del menu ");
            System.out.print("Seleccione una opcion entre 1 y 4: ");
            opcion = scanner.nextByte();

            switch (opcion)
            {
                case 1: salarioNeto = salario.calcularSalarioNeto();
                    System.out.println("\n El salario neto a termino ndefinido es "+salarioNeto);
                break;

                case 2:
                    System.out.print("Ingrese el porcentaje de las deducciones");
                    porcentajeDescuento = scanner.nextFloat();
                    salarioNeto = salario.calcularSalarioNeto(porcentajeDescuento);
                    System.out.println("\n El salario neto por prestacion de servicios es: " + porcentajeDescuento);
                break;

                case 3:
                    if (salarioBasico >= 10 * 1423500)
                    {
                        System.out.println("Ingrese el porcetaje ");
                        porcentajeImpuesto = scanner.nextInt();
                        salarioNeto = salario.calcularSalarioNeto(porcentajeImpuesto);
                        System.out.println("\n El salario integral es "+decimalFormat.format(salarioNeto));
                    break;
                    }
                    else
                        System.out.println("Menos de 10 salarios minimos no es salario integral. ");
                break;
            }

        }
        while (opcion !=4);
    }
}