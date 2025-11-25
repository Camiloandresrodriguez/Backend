package org.example;

public class Operadores
{
    public long calcularFactorial(int numero)
    {
        long resultado = 1;
        for (int i = 1; i <= numero; i++)
        {
            resultado *= i;
        }
        return resultado;
    }
}
