package org.example;

public class Matricula
{
    private String sexo, tecnica;
    private  byte edad, numeroMaterias;
    private float valorMateria;

    private  float valorBruto;
    private float valorNeto;
    private float descuento;

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public void setTecnica(String tecnica)
    {
        this.tecnica = tecnica;
    }

    public void setEdad(byte edad)
    {
        this.edad = edad;
    }

    public void setNumeroMaterias(byte numeroMaterias)
    {
        this.numeroMaterias = numeroMaterias;
    }

    public void setValorMateria(float valorMateria)
    {
        this.valorMateria = valorMateria;
    }

    public float getValorBruto()
    {
        return valorBruto;
    }

    public float getDescuento()
    {
        return descuento;
    }

    public float getValorNeto()
    {
        return valorNeto;
    }

    public void calcularMatricula()
    {
        valorBruto = numeroMaterias * valorMateria;
        if (sexo.equalsIgnoreCase("Mujer") && edad < 18 && tecnica.equalsIgnoreCase("Sistemas"))
            descuento = valorBruto * 10/100;
        else
            descuento = 0;
            valorNeto = valorBruto - descuento;
    }
}
