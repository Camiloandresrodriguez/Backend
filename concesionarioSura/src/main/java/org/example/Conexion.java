package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion
{
    private String url = "jdbc:mysql://localhost:3306/concesionario";
    private  String login = "root";
    private  String password = "";

    public Connection conectar () throws  Exception
    {
         try
         {
             Connection connection = DriverManager.getConnection(url, login, password);
             return  connection;
         }
         catch (Exception error)
         {
             throw  new Exception(error.getMessage());
         }
    }
}
