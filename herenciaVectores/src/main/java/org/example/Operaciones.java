package org.example;

public class Operaciones
{
    public int hallarMayorPar(int[] datos)
    {
        int mayor = datos[0];
        for (int i = 0; i < datos.length; i++)
        {
            if (datos[i] > mayor && i % 2 == 0)
                mayor=datos[i];
        }
        return mayor;
    }
    public int hallarMayorImpar (int[] datos)
    {
        int mayor = -1;
        for (int i = 0; i < datos.length; i++)
        {
            if (datos[i] > mayor && datos[i] % 2 == 1)
                mayor = datos[i];
        }
        return mayor;
    }
    public float hallarPromedio (int[] datos)
    {
        float promedio, suma = 0;
        int cont = 0;
        for (int i = 0; i < datos.length; i++)
        {
            if (datos[i] % 5 == 0)
                suma = suma + datos[i];
            cont++;
        }
        if (cont > 0)
        {
            promedio=suma/cont;
        }else
        {
            promedio = 0;
        }
        return promedio;
    }
}

