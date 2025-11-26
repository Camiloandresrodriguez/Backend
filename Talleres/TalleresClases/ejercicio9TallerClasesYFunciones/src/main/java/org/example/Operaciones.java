package org.example;

public class Operaciones
{
    public double hallarAreaCuadrado(float lado)
    {
        double areaCuadrado;
        areaCuadrado = lado * lado;
        return areaCuadrado;
    }

    public double hallarAreaRectangulo(float largo, float ancho)
    {
        double areaRectangulo;
        areaRectangulo = largo * ancho;
        return areaRectangulo;
    }

    public double hallarAreaCirculo(float radio)
    {
        double areaCirculo;
        areaCirculo = 3.14 * radio * radio;
        return areaCirculo;
    }

    public double hallarAreaTriangulo(float base, float altura)
    {
        double areaTriangulo;
        areaTriangulo = base * altura / 2;
        return areaTriangulo;
    }
}
/*
Elaborar una clase con funciones para hallar el area de las siguientes figuras: cuadrado (a=L*L),
rectangulo (a=L*A), circulo (a=pi*radio2) y triangulo (a=b*h/2) .
Hacer el formulario correspondiente para instanciar la clase y mostrar su funcionamiento.
*/