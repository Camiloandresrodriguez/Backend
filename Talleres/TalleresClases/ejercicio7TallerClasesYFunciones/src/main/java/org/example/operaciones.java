package org.example;

public class operaciones
{
    public int hallarSecuenciaFibonacci(int nDatos)
    {
        int dato1 = 0, dato2 = 1, dato3;

        if (nDatos >= 1)
        {
            System.out.println(dato1 + " ");
        }

        if (nDatos >= 2)
        {
            System.out.println(dato2 + " ");
        }

        for (int i = 3; i < nDatos; i++)
        {
            dato3 = dato1 + dato2;
            System.out.println(dato3 + " ");
            dato1 = dato2;
            dato2 = dato3;
        }
        return nDatos;
    }
}
/*
Hacer una solución que lea un numero N y luego imprima la serie de Fibonacci
Ejemplo: Si N es igual a 7, la serie seria: 0, 1, 1, 2, 3, 5, 8
*/

