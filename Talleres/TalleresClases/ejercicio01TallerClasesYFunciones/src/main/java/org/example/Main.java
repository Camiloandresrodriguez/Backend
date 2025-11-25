package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        float salarioBasico, salarioNeto, deducciones = 0, auxilioTransporte = 0, valorHora;
        int numeroDeHoras;
        byte opcion;
        char salir;

        System.out.print("Digite el numero de horas trabajadas: ");
        numeroDeHoras = scanner.nextInt();
        System.out.print("Digite el valor de la hora: ");
        valorHora = scanner.nextFloat();

        salarioBasico = numeroDeHoras * valorHora;

        Operaciones operaciones = new Operaciones(salarioBasico);

        do
        {
            System.out.println("Bienbenidos al menu para calcular el salario neto de una persona ....");
            System.out.println("1. Calcula el salario basico ");
            System.out.println("2. Calcula las deducciones ");
            System.out.println("3. Calcula el auxilio de transporte ");
            System.out.println("4. Calcula el salario neto ");
            System.out.print("Elija una opcion entre 1 y 5: ");
            opcion = scanner.nextByte();


            switch (opcion)
            {
                case 1:
                    salarioBasico = operaciones.calcularSalarioBasico(numeroDeHoras,valorHora);
                    System.out.println("El salario basico es: " + salarioBasico);
                break;

                case 2:
                    deducciones = operaciones.calcularDeducciones();
                    System.out.println("Las deducciones quedan en: " + deducciones);
                break;

                case 3:
                    auxilioTransporte = operaciones.calcularAuxilioTransporte();
                    System.out.println("El auxilio de transporteb queda en: " + auxilioTransporte);
                break;

                case 4:
                    salarioNeto = operaciones.calcularSalarioNeto(deducciones,auxilioTransporte);
                    System.out.println("El salario neto queda en: " + salarioNeto);
                break;

                case 5:
                    System.out.println("¿Realmente quiere salir del menu? S = si N = no: ");
                    salir = scanner.next().charAt(0);
                    if (salir != 'S' && salir != 's')
                    {
                        opcion = 0;
                    }
                break;

                default:
                    System.out.println("Operacion no valida, favor intente de nuevo....");
            }
        }
        while (opcion != 5);
    }
}
