package org.example;

public class Estudiante extends Persona
{
    private  String carrera;
    private  byte semestre;

    public Estudiante(String identificacion, String nombre, String direccion, String carrera, byte semestre)
    {
        super(identificacion, nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }
}
