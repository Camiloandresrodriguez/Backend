package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        float salarioBasico, deducciones, auxilioTransporte, bonificacion, salarioMinimo, salarioNeto;
        byte numeroHijos;

        System.out.print("Digite cual es su salrio basico: ");
        salarioBasico = scanner.nextFloat();
        System.out.print("Digite el numero de hijos: ");
        numeroHijos = scanner.nextByte();

        Operaciones operaciones = new Operaciones(salarioBasico);

        deducciones = operaciones.calcularDeducciones();
        auxilioTransporte = operaciones.calcularAuxilioDeTransporte();
        bonificacion = operaciones.calcularBonificaciones(numeroHijos);
        salarioNeto = operaciones.calcularSalarioNeto(deducciones,auxilioTransporte,bonificacion);

        System.out.println("Las deducciones son: "+ deducciones);
        System.out.println("El auxilio de transporte es de: "+ auxilioTransporte);
        System.out.println("Las bonificaciones son: "+ bonificacion);
        System.out.println("El salario neto es de: "+salarioNeto);
    }
}
/*
Hacer una solución que calcule las deducciones, el auxilio de transporte,
la bonificación y el salario neto a pagar a un empleado si los datos de entrada son el salario básico
y el numero de hijos.

Nota: Recordar que las deducciones legales vigentes son las siguientes:
Si gana hasta 4 mínimos se le deduce el 8% del salario básico.
Si gana más de 4 mínimos se le deduce el 9% del salario básico.
Solo se le da auxilio de transporte a los que ganan hasta dos mínimos.
La bonificación depende del numero de hijos, si tiene dos o más,
se le da una bonificación de 50000 pesos y si tiene menos de dos hijos no se le da bonificación
suponer el salario mínimo y el valor del auxilio de transporte
*/
