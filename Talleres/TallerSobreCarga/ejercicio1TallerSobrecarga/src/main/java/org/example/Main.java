package org.example;


import java.util.Scanner;

public class Main
{
    static void main()
    {
        /*
        Analisis

        DE: numeroDeUnidades, valorUnitario, porcentajeDescuento, porcentajeIva.
        Ds:valorBruto, valorNeto, descuento, Iva.
        Dp: valorBruto = numeroDeUnidades * valorUnitario.
            descuento = valorBruto * porcentajeDescuento/100.
            valorNeto = valorBruto - descuento.
            iva = valorBruto * porcentajeIva/100.
            valorNeto = valorBruto + iva
            valorNeto = (valoBruto - descuento) + iva
         */
        Scanner scanner = new Scanner(System.in);
        int numeroDeUnidades;
        float valorBruto, valorUnitario, porcentajeDescuento, descuento = 0;
        double valorNeto,porcentajeIva, iva = 0;
        byte opcion;

        System.out.print("Digite la cantidad de unidades: ");
        numeroDeUnidades = scanner.nextInt();

        System.out.print("Digite el valor unitario: ");
        valorUnitario = scanner.nextFloat();

        valorBruto = numeroDeUnidades * valorUnitario;

        Operaciones operaciones = new Operaciones(valorBruto);

        do
        {
            System.out.println(" \n Menu para calcular el valor Neto de productos. ");
            System.out.println("1. Calcular el valor bruto ");
            System.out.println("2. Calcular el descuento ");
            System.out.println("3. Calcular el iva");
            System.out.println("4. Calcular el valor neto con el descuento y el iva");
            System.out.println("5. Salir del menu");
            System.out.print("Selecciones una opcion del (1 al 5): ");
            opcion = scanner.nextByte();

            switch (opcion)
            {
                case 1:
                    valorNeto = operaciones.calcularValorNeto(numeroDeUnidades,valorUnitario);
                    System.out.println("El valor bruto es: "+valorNeto);
                break;

                case 2:
                    System.out.print("Digite el valor del descuento: ");
                    porcentajeDescuento = scanner.nextFloat();
                    valorNeto =operaciones.calcularValorNeto(porcentajeDescuento);
                    System.out.println("El valor neto con descuento queda en: "+valorNeto);
                break;

                case 3:
                    System.out.print("Digite el porcentaje del iva: ");
                    porcentajeIva = scanner.nextFloat();
                    valorNeto = operaciones.calcularValorNeto(porcentajeIva);
                    System.out.println("El valor neto aplicando el iva es de: "+valorNeto);
                break;

                case 4:
                    System.out.print("Digite el porcentaje del descuento: ");
                    descuento = scanner.nextFloat();
                    System.out.print("Digite el porcentaje del iva: ");
                    iva = scanner.nextDouble();
                    valorNeto = operaciones.calcularValorNeto(descuento,iva);
                    System.out.println("El valor neto con el descuento y con el iva es: "+valorNeto);
                break;
            }

        }
        while (opcion !=5);
    }
}

/*
Crear una clase que sobrecargue de cuatro maneras diferentes un
metodo para calcular el valor neto de una compra, las sobrecargas
calculan el valor neto de las siguientes maneras:

Número de unidades por valor unitario
Con un descuento sobre el valor bruto (el porcentaje del descuento ingresa como parámetro)
Puede tener IVA sobre el valor bruto (el porcentaje del IVA ingresa como parámetro y puede ser del 5%, 10% y 19%)
Puede tener descuento e IVA (que ingresan como parámetros)

Hacer un menú principal que me permita ingresar los datos necesarios y seleccionar cualquiera
de las opciones anteriores en el programa principal.
 */