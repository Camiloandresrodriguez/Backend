package org.example;

public class Operaciones
{
    /*
Analisis

DE: numeroDeUnidades, valorUnitario, porcentajeDescuento, porcentajeIva.
Ds:valorBruto, valorNeto, descuento, Iva.
Dp: valorBruto = numeroDeUnidades * valorUnitario.
    descuento = valorBruto * porcentajeDescuento/100.
    valorNeto = valorBruto - descuento.
    iva = valorBruto * porcentajeIva/100.
    valorNeto = valorBruto + iva
    valorNeto = (valoBruto - descuento) + iva
 */

    private float valorBruto;

    public Operaciones(float valorBruto)
    {
        this.valorBruto = valorBruto;
    }
    double valorNeto;

    public double calcularValorNeto(int numeroDeUnidades, float valorUnitario)
    {
        valorBruto = numeroDeUnidades * valorUnitario;
        valorNeto = valorBruto;
        return valorNeto;
    }

    public double calcularValorNeto(float porcentajeDescuento)
    {
        float descuento = 0;
        descuento = valorBruto * porcentajeDescuento/100;
        valorNeto = valorBruto - descuento;
        return valorNeto;
    }

    public double calcularValorNeto (double porcentajeIva)
    {
        double iva;
        if (porcentajeIva == 5 || porcentajeIva == 10 || porcentajeIva == 19)
        {
            iva = valorBruto * porcentajeIva/100;
            valorNeto = valorBruto + iva;
        }
        else
        {
            System.out.println("El valor ingresado es incorrecto: ");
        }
        return valorNeto;
    }

    public double calcularValorNeto (float descuento, double iva)
    {
        valorNeto = (valorBruto - descuento) + iva;
        return valorNeto;
    }
}

/*
Crear una clase que sobrecargue de cuatro maneras diferentes un
metodo para calcular el valor neto de una compra, las sobrecargas
calculan el valor neto de las siguientes maneras:

Número de unidades por valor unitario
Con un descuento sobre el valor bruto (el porcentaje del descuento ingresa como parámetro)
Puede tener IVA sobre el valor bruto (el porcentaje del IVA ingresa como parámetro y puede ser del 5%, 10% y 19%)
Puede tener descuento e IVA (que ingresan como parámetros)

Hacer un menú principal que me permita ingresar los datos necesarios y seleccionar cualquiera
de las opciones anteriores en el programa principal.
 */
