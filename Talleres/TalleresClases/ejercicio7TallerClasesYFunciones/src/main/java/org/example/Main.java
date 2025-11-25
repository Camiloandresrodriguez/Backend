package org.example;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        Scanner scanner = new Scanner(System.in);
        operaciones operaciones = new operaciones();

        int ndatos, repuesta;

        System.out.print("Digite el numero de datos que se van a ingresar: ");
        ndatos = scanner.nextInt();

        repuesta = operaciones.hallarSecuenciaFibonacci(ndatos);
    }
}
/*
Hacer una solución que lea un numero N y luego imprima la serie de Fibonacci
Ejemplo: Si N es igual a 7, la serie seria: 0, 1, 1, 2, 3, 5, 8
*/
