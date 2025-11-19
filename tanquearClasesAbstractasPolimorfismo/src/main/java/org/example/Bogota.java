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
        return 0;
    }
}
