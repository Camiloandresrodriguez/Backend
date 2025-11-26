package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        matricula matricula = new matricula();

        String identificacion,nombre, genero, tecnicaQueEstudia;
        byte edad, numeroMaterias;
        float valorMateria, valorbruto, descuento, valorNeto;

        System.out.print("Ingrese la identificacion del alumno: ");
        identificacion = scanner.next();
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = scanner.next();
        System.out.print("Ingrese el genero si es Hombre o mujer: ");
        genero = scanner.next();
        System.out.print("Ingrese la edad del estudiante: ");
        edad = scanner.nextByte();
        System.out.print("Ingrese el numero de materias: ");
        numeroMaterias = scanner.nextByte();
        System.out.print("Ingrese el valor de la materia: ");
        valorMateria = scanner.nextFloat();
        System.out.print("Ingrese la tecnica que esta estuando: ");
        tecnicaQueEstudia = scanner.next();

        matricula.setGenero(genero);
        matricula.setEdad(edad);
        matricula.setNumeroMaterias(numeroMaterias);
        matricula.setValorMateria(valorMateria);
        matricula.setTecnicaQueEstudia(tecnicaQueEstudia);

        matricula.calcularMatricula();
        System.out.println("El valor bruto es: "+matricula.getValorBruto());
        System.out.println("El valor del descuento es: "+matricula.getDescuento());
        System.out.println("El valor neto es: "+matricula.getValorNeto());
    }
}
/*
Crear una clase que cree un registro usando encapsulamiento con los siguientes datos:
Identificación del alumno, nombre, genero, edad, numero de materias,
valor por materia y técnica que estudia y luego realice las siguientes tareas:
Valor bruto
Descuento, se maneja un descuento del 10% si es mujer, menor de edad y estudia Sistemas
total de la matrícula

*/
