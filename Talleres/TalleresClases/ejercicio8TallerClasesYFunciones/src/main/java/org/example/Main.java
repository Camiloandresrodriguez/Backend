package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        areaCirculo areaCirculo = new areaCirculo();
        float radio;
        double areaC;

        System.out.print("Digite el radio del circulo: ");
        radio = scanner.nextFloat();

        areaC = areaCirculo.calcularAreaCirculo(radio);
        System.out.println("el area del circulo es: " + areaC);
    }
}

