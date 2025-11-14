package org.example;

public class Salario
{
    private float salarioMinimo = 1423500;
    private float valAuxTransporte = 200000;
    private float salarioNeto;
    private float salarioBasico;

    public Salario(float salarioBasico)
    {
        this.salarioBasico = salarioBasico;
    }

    // Sobrecarga uno salario a termino indefinido

    public float calcularSalarioNeto()
    {
        float deducciones, auxilioTransporte = 0;
        if (salarioBasico <= 4 * salarioMinimo){
            deducciones = salarioBasico * 8/100;
            if (salarioBasico <= 2 * salarioMinimo)
                auxilioTransporte = valAuxTransporte;
        }
        else
        {
            deducciones = salarioBasico * 9/100;
        }

        salarioNeto = salarioBasico - deducciones + auxilioTransporte;
        return salarioNeto;
    }

    // Sobrecarga dos salario a termino indefinido

    public float calcularSalarioNeto(float porcentajeDescuento)
    {
        float descuento = salarioBasico * porcentajeDescuento/100;
        salarioNeto = salarioBasico - descuento;
        return salarioNeto;
    }

    // Sobrecarga tres salario a termino indefinido

    public float calcularSalarioNeto(double porcentajeImpuesto)
    {
        float impuesto = salarioBasico * (float)porcentajeImpuesto/100, deducciones;
        deducciones = salarioBasico * 9/100;
        salarioNeto = salarioBasico - impuesto - deducciones;
        return salarioNeto;
    }
}
