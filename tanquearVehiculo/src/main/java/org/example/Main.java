package org.example;

import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static float valorGalon, cantidadGalon;

    private static void leerDatos()
    {
        System.out.print("¿Cuantos galones va a tanquear?: ");
        cantidadGalon = scanner.nextFloat();
        System.out.print("¿Cual es el valor por galon?: ");
        valorGalon = scanner.nextFloat();
    }

    public static void main(String[] args)
    {
        float valorNeto;
        byte opcion;

        do
        {
            System.out.println("\n\t Menu para calcular impuestos en la gasalina ");
            System.out.println("1. Impuesto en la ciudad de Medellin ");
            System.out.println("2. Impuesto en la ciudad de Cali ");
            System.out.println("3. Impuesto en la ciudad de Bogota ");
            System.out.println("4. Salir ");
            do
            {
                System.out.print("Seleccione una opcion desde 1 y 4: ");
                opcion = scanner.nextByte();

            }
            while (opcion < 1 || opcion > 4);

            switch (opcion)
            {
                case 1: leerDatos();
                    Medellin medellin = new Medellin(valorGalon , cantidadGalon);
                    valorNeto = medellin.calcularValorTanquear();
                    System.out.println("El valor neto por tanquear en Medellín es: " + valorNeto);
                break;

                case 2: leerDatos();
                    Cali cali = new Cali(valorGalon,cantidadGalon);
                    valorNeto = cali.calcularValorTanquear();
                    System.out.println("El valor neto por tanquear en Cali es: " + valorNeto);
                break;

                case 3: leerDatos();
                    Bogota bogota = new Bogota(valorGalon,cantidadGalon);
                    valorNeto = bogota.calcularValorTanquear();
                    System.out.println("El valor neto por tanquear en Bogota es: " + valorNeto);
                break;
            }
        }
        while (opcion != 4);

    }
}