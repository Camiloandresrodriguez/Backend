package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);

        int numero;
        long resultado;

        System.out.print("Digite un numero: ");
        numero = scanner.nextInt();

        Operadores operadores = new Operadores();

        resultado = operadores.calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " Es: " + resultado);
    }
}
/*
Hacer una solución que lea un número y luego en un método calcule su factorial.
*/