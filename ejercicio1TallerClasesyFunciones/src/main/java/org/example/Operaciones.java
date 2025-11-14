package org.example;

public class Operaciones
{
    private float valorBruto;

    public Operaciones(float salarioBruto)
    {
        this.salarioBruto = salarioBruto;
    }

    public float hallarValorNeto(int numeroUnidades)
    {
        float valorUnitario = 0;
        valorBruto = numeroUnidades * valorUnitario;
        return valorBruto;
    }

    public float hallarValorNeto(float porcentajeDescuento)
    {
        float  descuento;
        if (valorBruto > 100000)
        {
            descuento = ;
        }
    }

}

/*
Crear una clase que sobrecargue de cuatro maneras diferentes un
metodo para calcular el valor neto de una compra, las sobrecargas calculan el valor neto de las siguientes maneras

Número de unidades por valor unitario
Con un descuento sobre el valor bruto (el porcentaje del descuento ingresa como parámetro)
Puede tener IVA sobre el valor bruto (el porcentaje del IVA ingresa como parámetro y puede ser del 5%, 10% y 19%)
Puede tener descuento e IVA (que ingresan como parámetros)

Hacer un menú principal que me permita ingresar los datos necesarios y seleccionar cualquiera de las opciones anteriores en el programa principal.
*/
