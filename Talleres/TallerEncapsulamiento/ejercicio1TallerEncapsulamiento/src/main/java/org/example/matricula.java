package org.example;

public class matricula
{
    private String genero, tecnicaQueEstudia;
    private byte numeroMaterias, edad;
    private float valorMateria;

    private float valorBruto;
    private float valorNeto;
    private float descuento;

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public void setTecnicaQueEstudia(String tecnicaQueEstudia)
    {
        this.tecnicaQueEstudia = tecnicaQueEstudia;
    }

    public void setNumeroMaterias(byte numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setValorMateria(float valorMateria) {
        this.valorMateria = valorMateria;
    }

    public float getValorBruto()
    {
        return valorBruto;
    }

    public float getValorNeto()
    {
        return valorNeto;
    }

    public float getDescuento()
    {
        return descuento;
    }

    public void calcularMatricula()
    {
        valorBruto = valorMateria * numeroMaterias;
        if (genero.equalsIgnoreCase("mujer") &&  edad < 18 && tecnicaQueEstudia.equalsIgnoreCase("sistemas"))
        {
            descuento = valorBruto * 10/100;
        }
        else
        {
            descuento = 0;
        }

        valorNeto = valorBruto - descuento;
    }
}
/*
Crear una clase que cree un registro usando encapsulamiento con los siguientes datos:
Identificación del alumno, nombre, genero, edad, numero de materias,
valor por materia y técnica que estudia y luego realice las siguientes tareas:
Valor bruto
Descuento, se maneja un descuento del 10% si es mujer, menor de edad y estudia Sistemas
total de la matrícula
*/

