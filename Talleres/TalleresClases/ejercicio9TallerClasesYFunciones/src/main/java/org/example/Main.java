package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        float lado, largo, ancho, radio, base, altura;
        double areaCuadrado, areaRectangulo, areacirculo, areaTriangulo;
        byte opcion;
        char salir;

        do
        {
            System.out.println("Bienvenidos al menu para calcular areas....");
            System.out.println("1. Hallar el area de un cuadrado. ");
            System.out.println("2. Hallar el area de un rectangulo. ");
            System.out.println("3. Hallar el area de un circulo. ");
            System.out.println("4. Hallar el area de un triangulo. ");
            System.out.println("5. salir del menu. ");
            System.out.print("Elija una opcion entre el 1 y el 5: ");
            opcion = scanner.nextByte();

            switch (opcion)
            {
                case 1:
                    System.out.print("Digite la dimencion de uno de los lados del cuadrado: ");
                    lado = scanner.nextFloat();
                    areaCuadrado = operaciones.hallarAreaCuadrado(lado);
                    System.out.println("El area del cuadrado es: "+areaCuadrado);
                break;

                case 2:
                    System.out.print("Digite el largo del rectangulo: ");
                    largo = scanner.nextFloat();
                    System.out.print("Digite el ancho del rectangulo: ");
                    ancho = scanner.nextFloat();
                    areaRectangulo = operaciones.hallarAreaRectangulo(largo,ancho);
                    System.out.println("El area del rectangulo es: "+areaRectangulo);
                break;

                case 3:
                    System.out.print("Digite el radio del circulo: ");
                    radio = scanner.nextFloat();
                    areacirculo = operaciones.hallarAreaCirculo(radio);
                    System.out.println("El area del circulo es: "+areacirculo);
                break;

                case 4:
                    System.out.print("Digite la base del triangulo: ");
                    base = scanner.nextFloat();
                    System.out.print("Digite la altura del triangulo:");
                    altura = scanner.nextFloat();
                    areaTriangulo = operaciones.hallarAreaTriangulo(base,altura);
                    System.out.println("El area del triangulo es "+areaTriangulo);
                break;

                case 5:
                    System.out.print("¿Realmente quiere salir del menu? S = si N = no: ");
                    salir = scanner.next().charAt(0);
                    if (salir != 'S' && salir != 's')
                    {
                        opcion = 0;
                    }
                break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo......");
            }
        }
        while (opcion != 5);

    }
}
/*
Elaborar una clase con funciones para hallar el area de las siguientes figuras: cuadrado (a=L*L),
rectangulo (a=L*A), circulo (a=pi*radio2) y triangulo (a=b*h/2) .
Hacer el formulario correspondiente para instanciar la clase y mostrar su funcionamiento.
*/
