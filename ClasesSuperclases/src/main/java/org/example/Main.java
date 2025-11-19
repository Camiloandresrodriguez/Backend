package org.example;

import java.util.Scanner;

public class Main
{
    static String identificacion, nombre, direccion;
    static Scanner scanner = new Scanner(System.in);
    private static void leerDatos ()
        {
            System.out.print("Ingresela identificacion de la persona: ");
            identificacion = scanner.next();
            System.out.print("Ingrese el nombre de la persona: ");
            nombre = scanner.next();
            System.out.print("Ingrese la direccion: ");
            direccion = scanner.next();
        }
    static void main(String[] args)
    {
        String liga, deporte, carrera, seccion;
        byte semestre, opcion;
        float salario, salarioNeto, valorVentas;

        do
        {
            System.out.println("\n Tipos de personas");
            System.out.println("1. Estudiante ");
            System.out.println("2. Deportista ");
            System.out.println("3. Empleado ");
            System.out.println("4. Salir ");
            System.out.print(" Elija una opcion entre (1 y 4): ");
            opcion = scanner.nextByte();

            switch (opcion)
            {
                case 1: leerDatos();
                    System.out.print("Ingrese el nombre de la carrera: ");
                    carrera = scanner.next();
                    do
                    {
                        System.out.print("Ingrese el numero del semestre en el que se encuentra: ");
                        semestre = scanner.nextByte();
                    }
                    while (semestre < 1 || semestre > 10);

                    Estudiante estudiante = new Estudiante(identificacion,nombre,direccion,carrera,semestre);
                break;

                case 2:leerDatos();
                    System.out.print("Ingrese la liga a la que pertenece: ");
                    liga = scanner.next();
                    System.out.print("Ingrese el deporte que practica: ");
                    deporte = scanner.next();
                    Deportista deportista = new Deportista(identificacion,nombre,direccion,liga,deporte);
                break;

                case 3:leerDatos();
                    System.out.print("Ingrese la seccion en la que se encuentra: ");
                    seccion = scanner.next();
                    System.out.print("Ingrese el salario: ");
                    salario = scanner.nextFloat();
                    Empleado empleado = new Empleado(identificacion,nombre,direccion,seccion,salario);
                    System.out.print("Ingrese el valor de las ventas mensuales: ");
                    valorVentas = scanner.nextFloat();
                    salarioNeto = empleado.hallarSalarioNeto(valorVentas);
                    System.out.println("El salario neto del empleado con identificacion: "+identificacion + " es de: "  +salarioNeto);
                break;
            }
        }
        while (opcion != 4);
    }
}
