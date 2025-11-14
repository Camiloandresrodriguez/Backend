package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Instanciar clase Scanner

        Scanner scanner = new Scanner(System.in);

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
            System.out.println("4. Salair del menu ");
            System.out.print("Seleccione una opcion entre 1 y 4: ");
            opcion = scanner.nextByte();

        }
        while (opcion !=4);
    }
}