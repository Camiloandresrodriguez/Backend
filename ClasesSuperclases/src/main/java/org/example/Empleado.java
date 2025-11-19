package org.example;

public class Empleado extends Persona
{
    private String seccion;
    private  float salario;

    public Empleado(String identificacion, String nombre, String direccion, String seccion, float salario)
    {
        super(identificacion, nombre, direccion);
        this.seccion = seccion;
        this.salario = salario;
    }

    public float hallarSalarioNeto(float valorVenta)
    {
        float salarioNeto, comision = 0;
        if (valorVenta >= 4000000)
            comision = valorVenta * 10/100;
        salarioNeto = salario + comision;
        return salarioNeto;
    }
}
