package org.example;

public class PerimetroYAreaCuadrado
{
    public float hallarElPerimetro(float lado)
    {
        float perimetro;
        perimetro = lado * 4;
        return perimetro;
    }

    public float hallarElArea(float lado)
    {
        float area;
        area = lado * lado;
        return area;
    }
}
