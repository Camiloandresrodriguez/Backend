package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        OperacionesVelocidad operacionesVelocidad = new OperacionesVelocidad();

        double velocidad;
        float tiempo, distancia;
        byte numeroDeAutomoviles;

        System.out.print("Digite el numero de automoviles de los cuales se van a calcular su velocidad: ");
        numeroDeAutomoviles = scanner.nextByte();

        double[] velocidades = new double[numeroDeAutomoviles];

        int i;
        for (i = 0; i < numeroDeAutomoviles; i++)
        {
            System.out.print("\nDigite la distancia recorrida en km del automovil numero" + (i + 1)+ " : ");
            distancia = scanner.nextFloat();

            System.out.print("Digite el tiempo en el que recorrio esa distancia en horas: ");
            tiempo = scanner.nextFloat();

            velocidades[i] = operacionesVelocidad.calcularVelocidadAutomovil(distancia, tiempo);
        }

        for (int j = 0; j < numeroDeAutomoviles; j++)
        {
            System.out.println("Automóvil " + (j + 1) + ": " + velocidades[j] + " m/s");
        }
    }
}
/*
Hacer una función que calcule la velocidad de un móvil y luego mediante un
método y un programa principal calcule e imprima las velocidades de N móviles
*/
