package org.example;

public class Bogota extends Gasolina
{
    public Bogota(float valorGalon, float cantidadGalon)
    {
        super(valorGalon, cantidadGalon);
    }

    @Override
    public float calcularValorTanquear()
    {
        float valorNeto;
        valorNeto = valorGalon * cantidadGalon + (cantidadGalon * 500);
        return valorNeto;
    }
}
