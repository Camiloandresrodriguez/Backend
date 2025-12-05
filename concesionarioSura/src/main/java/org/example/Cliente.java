package org.example;

public class Cliente
{
    private String ideCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private String activo;

    public String getIdeCliente()
    {
        return ideCliente;
    }

    public void setIdeCliente(String ideCliente)
    {
        this.ideCliente = ideCliente;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente()
    {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente)
    {
        this.telefonoCliente = telefonoCliente;
    }

    public String getActivo()
    {
        return activo;
    }

    public void setActivo(String activo)
    {
        this.activo = activo;
    }
}
