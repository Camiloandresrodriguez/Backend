package org.example;

public class Deportista extends Persona
{
    private String liga;
    private String deporte;

    public Deportista(String identificacion, String nombre, String direccion, String liga, String deporte)
    {
        super(identificacion, nombre, direccion);
        this.liga = liga;
        this.deporte = deporte;
    }

}
