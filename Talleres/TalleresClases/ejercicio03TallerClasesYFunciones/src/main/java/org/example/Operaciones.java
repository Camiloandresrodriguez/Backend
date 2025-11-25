package org.example;

public class Operaciones
{
    private float valorBruto;

    public Operaciones(float valorBruto)
    {
        this.valorBruto = valorBruto;
    }

    public float calcularValorBruto(int cantidadUnidadesVendidaas, float valorUnitario)
    {
        float valorBruto;
        valorBruto = cantidadUnidadesVendidaas * valorUnitario;
        return valorBruto;
    }

    public float calcularIva()
    {
        float iva;
        iva = valorBruto * 16f/100;
        return iva;
    }

    public float calcularValorNeto()
    {
        return valorBruto;
    }
}
/*
Crear una solución que lea la cantidad de unidades vendidas y el valor unitario por unidad y
luego mediante métodos calcule e imprima el IVA (16%) y el valor neto a pagar.
*/