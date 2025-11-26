package org.example;

import java.util.Scanner;

public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        SalarioNeto salarioNeto = new SalarioNeto();


        float salarioBasico, salarioMinimo, salarioN, auxilioManutencion, bonificacion, deducciones, auxilioTransporte;
        byte numeroDeAnEnLaEmpresa, estrato, numeroHijos;

        System.out.print("Digite el salario basico: ");
        salarioBasico = scanner.nextFloat();
        System.out.print("Digite el numero de años que lleva en la empresa: ");
        numeroDeAnEnLaEmpresa = scanner.nextByte();
        System.out.print("Digite el estrato socioeconomico en numero: ");
        estrato = scanner.nextByte();
        System.out.print("Digite cuantos hijos tiene en numero: ");
        numeroHijos = scanner.nextByte();

        salarioNeto.setSalarioBasico(salarioBasico);
        salarioNeto.setNumeroAnEnLaEmpresa(numeroDeAnEnLaEmpresa);
        salarioNeto.setEstrato(estrato);
        salarioNeto.setNumeroHijos(numeroHijos);

        salarioNeto.calcularSalarioNeto();
        System.out.println("El auxilio de manutención es de: " + salarioNeto.getAuxlioManutencion());
        System.out.println("El auxilio de transporte es de: "+ salarioNeto.getAuxilioTransporte());
        System.out.println("Las bonificaciones son de: " + salarioNeto.getBonificacion());
        System.out.println("Las deducciones son de: " + salarioNeto.getDeducciones());
        System.out.println("Las el salario neto es de son de: " + salarioNeto.getSalarioNeto());
    }
}
/*
Utilizando encapsulamiento calcular el salario neto de un empleado si los datos de entrada son su salario básico,
numero de años en la empresa y su estrato, por cada hijo la empresa reconoce un auxilio de manutención de 50000
pesos y además si el estrato es uno, dos o tres se le da una bonificación del 5% sobre el salario básico.
Nota: recordar que solo a las personas que ganan dos o menos salarios mínimos, se le da auxilio de transporte.
Además, las deducciones son del 8% sobre el salario básico si gana hasta 4 mínimos o del 9% si gana mas de 4
salarios mínimos. El salario mínimo y el valor del auxilio de transporte se debe entrar como
PARAMETROS del método (no encapsulado)
*/
