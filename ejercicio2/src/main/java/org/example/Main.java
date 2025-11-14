package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int cantidad = 0;
        float valorViaje, iva, valorBruto = 0, descuento = 0, valorNeto = 0;

        System.out.print("Digite el numero de personas que van a viajar: ");
        cantidad = scanner.nextInt();

        System.out.print("Digite el precion del viaje por persona: ");
        valorViaje = scanner.nextFloat();

        valorBruto =cantidad * valorViaje;

        Operaciones operaciones = new Operaciones(valorBruto);
        iva = valorBruto * 19 /100;
        iva = operaciones.hallarValorIva(iva);
        descuento = valorBruto - 10/100;
        descuento = operaciones.hallarDescuento(descuento);
        valorNeto = operaciones.hallarValorNeto(valorNeto);

        System.out.println("El valor bruto es: " + valorBruto);
        System.out.println("El valor del iva es: " + iva);
        System.out.println("El valor del descuento es: " + descuento);
        System.out.println("El valor neto es: "+ valorNeto);
    }
}