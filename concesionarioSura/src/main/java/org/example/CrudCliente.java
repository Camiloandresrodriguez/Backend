package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudCliente extends Cliente
{
    Conexion conexion = new Conexion();
    private String sql;

    public boolean adicionarRegistro() throws Exception
    {
        try
        {
            Connection connection = conexion.conectar();
            sql = "insert into cliente(ideCliente, nombreCliente, direccionCliente, telefonoCliente) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,getIdeCliente());
            preparedStatement.setString(2,getNombreCliente());
            preparedStatement.setString(3,getDireccionCliente());
            preparedStatement.setString(4,getTelefonoCliente());

            preparedStatement.executeUpdate();
            return true;
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public boolean consultarIndRegistro() throws Exception
    {
        try
        {
            Connection connection = conexion.conectar();
            sql = "select * from cliente where ideCliente = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,getIdeCliente());

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                System.out.println("\n datos del cliente ");
                System.out.println("Nombre " +resultSet.getString(2));
                System.out.println("Dirección" + resultSet.getString(3));
                System.out.println("Telefono" + resultSet.getString(4));
                System.out.println("Activo" + resultSet.getString(5));
                return true;
            }
            else
            {
                System.out.println("\n Cliente no registrado ");
                return false;
            }
        }
        catch (Exception error)
        {
            throw  new Exception(error.getMessage());
        }
    }

    public void consultaGenRegistro() throws Exception
    {
        try
        {
            Connection connection = conexion.conectar();
            sql = "select * from cliente ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("\n\t Consulta general clientes ");
            while (resultSet.next())
            {
                System.out.println("Identificacion: " + resultSet.getString(1));
                System.out.println("Nombre: " + resultSet.getString(2));
                System.out.println("Dirección: " + resultSet.getString(3));
                System.out.println("Telefono: " + resultSet.getString(4));
                System.out.println("Activo: " + resultSet.getString(5) + "\n");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public boolean modificarRegistro() throws Exception
    {
        try
        {
            Connection connection = conexion.conectar();
            sql = "update cliente set nombreCliente = ?, direccionCliente = ?, telefonoCliente = ? where ideCliente = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,getNombreCliente());
            preparedStatement.setString(2,getDireccionCliente());
            preparedStatement.setString(3,getTelefonoCliente());
            preparedStatement.setString(4,getIdeCliente());

            preparedStatement.executeUpdate();
            return true;
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public boolean eliminarRegistro() throws Exception
    {
        try
        {
            Connection connection = conexion.conectar();
            sql = "delete from cliente where ideCliente = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, getIdeCliente());

            preparedStatement.executeUpdate();
            return true;
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public boolean anularRegistro() throws Exception
    {
        try
        {
            Connection connection = conexion.conectar();
            sql = "update cliente set activo = ? where ideCliente = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,getActivo());
            preparedStatement.setString(2,getIdeCliente());

            preparedStatement.executeUpdate();
            return true;
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}

//cuantas llaves primarias puede llamar un select --> la repuesta es 1.(PREGUNTA EXAMEN)
