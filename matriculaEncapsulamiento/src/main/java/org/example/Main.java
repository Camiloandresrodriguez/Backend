package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Matricula matricula = new Matricula();

        String identificacionAlumno, nombreAlumno, sexo, tecnica;
        byte edad, numeroMaterias;
        float valorMateria, valorBruto, descuento, valorNeto; //valor bruto el neto yel descuento no necesariamente se deben poner la variable por el encapsulamiento

        System.out.print("Ingrese identificacion del alumno: ");
        identificacionAlumno = scanner.next();
        System.out.print("Ingrese el nombre del estudiante: ");
        nombreAlumno = scanner.next();
        System.out.print("Digite el sexo Hombre o Mujer: ");
        sexo = scanner.next();
        System.out.print("Digite la edad: ");
        edad = scanner.nextByte();
        System.out.print("Digite la tecnica la cual estudia: ");
        tecnica = scanner.next();
        System.out.print("Digite el numero de materias que esta realizando: ");
        numeroMaterias = scanner.nextByte();
        System.out.print("Digite el valor por materia: ");
        valorMateria = scanner.nextFloat();

        matricula.setSexo(sexo);
        matricula.setEdad(edad);
        matricula.setNumeroMaterias(numeroMaterias);
        matricula.setValorMateria(valorMateria);

        //OPERACIONES
        matricula.calcularMatricula();
        System.out.println("\n El valor bruto es "+matricula.getValorBruto());
        System.out.println("\n El descuento es: " +matricula.getDescuento());
        System.out.println("\nEl valor neto es: "+matricula.getValorNeto());
    }
}