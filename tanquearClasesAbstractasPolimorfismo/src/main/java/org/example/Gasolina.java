package org.example;

public abstract class Gasolina
{
    protected float valorGalon, cantidadGalon;

    public Gasolina(float valorGalon, float cantidadGalon)
    {
        this.valorGalon = valorGalon;
        this.cantidadGalon = cantidadGalon;
    }

    abstract public float calcularValorTanquear();

}
