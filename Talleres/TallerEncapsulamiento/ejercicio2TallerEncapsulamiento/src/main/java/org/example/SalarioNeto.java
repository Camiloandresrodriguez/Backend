package org.example;

public class SalarioNeto
{
    public float salarioMInimo = 1423500;
    public float auxilioTransporte = 200000;
    public float auxlioManutencion = 50000;

    private float salarioBasico, salarioNeto, bonificacion, deducciones;
    private byte numeroAnEnLaEmpresa, estrato, numeroHijos;

    public void setNumeroAnEnLaEmpresa(byte numeroAnEnLaEmpresa)
    {
        this.numeroAnEnLaEmpresa = numeroAnEnLaEmpresa;
    }

    public void setEstrato(byte estrato)
    {
        this.estrato = estrato;
    }

    public void setNumeroHijos(byte numeroHijos)
    {
        this.numeroHijos = numeroHijos;
    }

    public void setSalarioBasico(float salarioBasico)
    {
        this.salarioBasico = salarioBasico;
    }

    public float getAuxlioManutencion()
    {
        return auxlioManutencion;
    }

    public float getAuxilioTransporte()
    {
        return auxilioTransporte;
    }

    public float getSalarioNeto()
    {
        return salarioNeto;
    }

    public float getBonificacion()
    {
        return bonificacion;
    }

    public float getDeducciones()
    {
        return deducciones;
    }



    public void calcularSalarioNeto()
    {
        if (numeroHijos > 0 )
        {
            auxlioManutencion = numeroHijos * 50000;
        }
        else
        {
            auxlioManutencion = 0;
        }

        if (estrato == 1 || estrato == 2 || estrato == 3)
        {
            bonificacion = salarioBasico * 5 / 100;
        }
        else
        {
            bonificacion = 0;
        }

        if (salarioBasico <= 2 * salarioMInimo)
        {
            auxilioTransporte = 200000;
        }
        else
        {
            auxilioTransporte = 0;
        }

        if (salarioBasico <= 4 * salarioMInimo)
        {
            deducciones = salarioBasico * 8 /100;
        }
        else
        {
            deducciones = salarioBasico * 9/100;
        }

        salarioNeto = salarioBasico + auxlioManutencion + auxilioTransporte + bonificacion - deducciones;
    }
}

/*
float salarioBasico, salarioMinimo, salarioNeto, auxilioManutencion, bonificacion, deducciones, auxilioTransporte;
byte numeroDeAñosEnLaEmpresa, estrato, numeroHijos;

Utilizando encapsulamiento calcular el salario neto de un empleado si los datos de entrada son su salario básico,
numero de años en la empresa y su estrato, por cada hijo la empresa reconoce un auxilio de manutención de 50000
pesos y además si el estrato es uno, dos o tres se le da una bonificación del 5% sobre el salario básico.
Nota: recordar que solo a las personas que ganan dos o menos salarios mínimos, se le da auxilio de transporte.
Además, las deducciones son del 8% sobre el salario básico si gana hasta 4 mínimos o del 9% si gana mas de 4
salarios mínimos. El salario mínimo y el valor del auxilio de transporte se debe entrar como
PARAMETROS del método (no encapsulado)
*/
