package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        float valorBruto, valorNeto,iva, valorUnitario, total;
        int cantidadUnidadesVendidas;
        byte opcion;
        char salir;

        System.out.print("Digite la cantidad de unidades vendidas: ");
        cantidadUnidadesVendidas = scanner.nextInt();
        System.out.print("Digite el valor unitario: ");
        valorUnitario = scanner.nextFloat();

        valorBruto = cantidadUnidadesVendidas * valorUnitario;

        Operaciones operaciones = new Operaciones(valorBruto);

        do
        {
            System.out.println("Bienvenidos al menu para calcular iva y valor neto de un producto ..");
            System.out.println("1. Calcular iva. ");
            System.out.println("2. Calcular el valor neto. ");
            System.out.println("3. visualizar iva y valor neto.  ");
            System.out.println("4. salir del menu. ");
            System.out.print("Elija una opcion entre el 1 y el 4: ");
            opcion = scanner.nextByte();

            switch (opcion)
            {
                case 1:
                    iva = operaciones.calcularIva();
                    System.out.println("El valor del iva es: " + iva);
                break;

                case 2:
                    valorNeto = operaciones.calcularValorNeto();
                    System.out.println("El valor neto es: " + valorNeto);
                break;

                case 3:
                    iva = operaciones.calcularIva();
                    valorNeto = operaciones.calcularValorNeto();
                    total = valorNeto + iva;
                    System.out.println("El valor del iva es: " + iva);
                    System.out.println("El valor neto es: " + valorNeto);
                    System.out.println("El total seria de: " + total);
                break;

                case 4:
                    System.out.print("¿Realmente quiere salir del menu? S = si N = no: ");
                    salir = scanner.next().charAt(0);

                    if (salir != 'S' && salir != 's')
                    {
                        opcion = 0;
                    }
                break;

                default:
                    System.out.println("Opcion no valida, intente nuevamente.....");
            }
        }
        while (opcion != 4);

    }
}
/*
Crear una solución que lea la cantidad de unidades vendidas y el valor unitario por unidad y
luego mediante métodos calcule e imprima el IVA (16%) y el valor neto a pagar.
*/
