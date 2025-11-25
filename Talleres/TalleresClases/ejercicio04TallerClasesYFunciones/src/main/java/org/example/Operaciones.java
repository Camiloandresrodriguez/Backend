package org.example;

public class Operaciones
{
    private float salarioMinimo= 1423500;
    private float auxilioTransporte = 200000;

    private float salarioBasico;

    public Operaciones(float salarioBasico)
    {
        this.salarioBasico = salarioBasico;
    }

    public float calcularDeducciones()
    {
        float deducciones;
        if (salarioBasico <= 4 * salarioMinimo)
        {
            deducciones = salarioBasico * 8/100;
        }
        else
        {
            deducciones = salarioBasico * 9/100;
        }
        return deducciones;
    }

    public float calcularAuxilioDeTransporte()
    {
        float auxilio = 0;
        if (salarioBasico <= 2 * salarioMinimo)
        {
            auxilio = auxilioTransporte;
        }
        return auxilio;
    }

    public float calcularBonificaciones(int numeroDeHijos)
    {
        float bonificacion = 0;
        if (numeroDeHijos >= 2)
        {
            bonificacion = 50000;
        }
        else
        {
            System.out.println("No tiene derecho a bonificacion ");
        }
        return bonificacion;
    }

    public float calcularSalarioNeto(float deducciones, float auxilio, float bonificacion)
    {
        return salarioBasico - deducciones + auxilio + bonificacion;
    }
}
/*
Hacer una solución que calcule las deducciones, el auxilio de transporte,
la bonificación y el salario neto a pagar a un empleado si los datos de entrada son el salario básico
y el numero de hijos.

Nota: Recordar que las deducciones legales vigentes son las siguientes:
Si gana hasta 4 mínimos se le deduce el 8% del salario básico.
Si gana más de 4 mínimos se le deduce el 9% del salario básico.
Solo se le da auxilio de transporte a los que ganan hasta dos mínimos.
La bonificación depende del numero de hijos, si tiene dos o más,
se le da una bonificación de 50000 pesos y si tiene menos de dos hijos no se le da bonificación
suponer el salario mínimo y el valor del auxilio de transporte
*/
