package org.example;

public class Medellin extends Gasolina
{
    public Medellin(float valorGalon, float cantidadGalon)
    {
        super(valorGalon, cantidadGalon);
    }

    @Override
    public float calcularValorTanquear()
    {
        float valorNeto = cantidadGalon * valorGalon * 1.1f;
        return valorNeto;
    }
}
