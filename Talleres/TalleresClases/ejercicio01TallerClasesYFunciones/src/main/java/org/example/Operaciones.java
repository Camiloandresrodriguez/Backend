package org.example;

public class Operaciones
{
    private float salarioBasico;

    public Operaciones(float salarioBasico)
    {
        this.salarioBasico = salarioBasico;
    }

    public float calcularSalarioBasico(int numeroDeHoras, float valorHora)
    {
        salarioBasico = numeroDeHoras * valorHora;
        return salarioBasico;
    }

    public float calcularDeducciones()
    {
        float deducciones;
        deducciones = salarioBasico * 5f/100;
        return deducciones;
    }

    public float calcularAuxilioTransporte()
    {
        float auxilio;
        auxilio = salarioBasico * 8f/100;
        return auxilio;
    }

    public float calcularSalarioNeto(float deducciones, float auxilio)
    {
        float salarioNeto;
        salarioNeto = salarioBasico - deducciones + auxilio;
        return salarioNeto;
    }
}
