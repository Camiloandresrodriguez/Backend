package org.example;

public class Cali extends Gasolina
{
    public Cali(float valorGalon, float cantidadGalon)
    {
        super(valorGalon, cantidadGalon);
    }

    @Override
    public float calcularValorTanquear()
    {
        float valorNeto = valorGalon * cantidadGalon + (cantidadGalon * 1200);
        return valorNeto;
    }
}
