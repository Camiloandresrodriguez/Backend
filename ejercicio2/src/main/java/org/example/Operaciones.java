package org.example;

public class Operaciones
{
    private float valorBruto, descuento;

    public Operaciones(float valorBruto) {
        this.valorBruto = valorBruto;
    }

    public float hallarValorBruto (int cantidad, float valorViaje)
    {
        float valorBruto;
        valorBruto = cantidad * valorViaje;
        return valorBruto;
    }

    public float hallarValorIva (float iva)
    {
        float valorIva = 0;
        if (valorBruto <= 600000)
        {
            System.out.println("No aplica valor iva");
        }
        else
        {
            System.out.println("Se aplica el valor del 19% del valor del iva");
            iva = valorBruto * 19/100;
        }
        return valorIva;
    }

    public float hallarDescuento (float descuento)
    {
        float Valordescuento =0;
        if (valorBruto > 2000000)
        {
            System.out.println("Aplica un descuento del 10%" );
            descuento = valorBruto - (10 / 100);
        }
        else
        {
            System.out.println("No se aplica ningun descuento ");
        }
        return Valordescuento;

    }

    public float hallarValorNeto(float valorNeto)
    {
        float valorneto = 0;
        valorNeto = valorBruto - descuento;
        return valorneto;
    }
}
