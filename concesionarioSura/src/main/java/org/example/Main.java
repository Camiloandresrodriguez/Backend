package org.example;

import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    static private String nombreCliente, direccionCliente, telefonoCliente;

    public static void  leerDatos()
    {
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = scanner.next();
        System.out.print("Ingrese la dirección del cliente: ");
        direccionCliente = scanner.next();
        System.out.print("Ingrese el telefono del cliente: ");
        telefonoCliente = scanner.next();
    }
    public static void main(String[] args) throws Exception {
        CrudCliente crudCliente = new CrudCliente();
        String ideCliente;
        byte opcion;

        do
        {
            System.out.println("\n\t Operaciones registro cliente ");
            System.out.println("1. Adicionar");
            System.out.println("2. Modificar");
            System.out.println("3. Consulta individual");
            System.out.println("4. Consulta general");
            System.out.println("5. Eliminar ");
            System.out.println("6. Anular ");
            System.out.println("7. Salir");
            do
            {
                System.out.print("Digite la opcion entre 1 y 7: ");
                opcion = scanner.nextByte();
            }
            while (opcion < 1 || opcion > 7);

            switch (opcion)
            {
                case 1:
                    System.out.print("Ingrese la identificación: ");
                    ideCliente = scanner.next();

                    crudCliente.setIdeCliente(ideCliente);
                    if (!crudCliente.consultarIndRegistro())
                    {
                        leerDatos();

                        crudCliente.setIdeCliente(ideCliente);
                        crudCliente.setNombreCliente(nombreCliente);
                        crudCliente.setDireccionCliente(direccionCliente);
                        crudCliente.setTelefonoCliente(telefonoCliente);

                        if (crudCliente.adicionarRegistro())
                        {
                            System.out.println("\n Registro adicionado");
                        }
                        else
                        {
                            System.out.println("\n Error adicionado registro ");
                        }
                    }
                    else
                    {
                        System.out.println("\n No se puede adicionar porque el cliente ya esta registrado...");
                    }
                break;

                case 2:
                    System.out.print("Ingrese la identificación: ");
                    ideCliente = scanner.next();

                    crudCliente.setIdeCliente(ideCliente);
                    if (crudCliente.consultarIndRegistro())
                    {
                        leerDatos();

                        crudCliente.setIdeCliente(ideCliente);
                        crudCliente.setNombreCliente(nombreCliente);
                        crudCliente.setDireccionCliente(direccionCliente);
                        crudCliente.setTelefonoCliente(telefonoCliente);

                        if (crudCliente.modificarRegistro())
                        {
                            System.out.println("\n Registro modificado");
                        }
                        else
                        {
                            System.out.println("\n Error modificando registro ");
                        }
                    }
                    else
                    {
                        System.out.println("\n No se puede modificar porque el cliente no esta registrado...");
                    }
                break;

                case 3:
                    System.out.print("Ingrese la identificacón a consultar: ");
                    ideCliente = scanner.next();
                    crudCliente.setIdeCliente(ideCliente);
                    crudCliente.consultarIndRegistro();
                break;

                case 4:crudCliente.consultaGenRegistro();
                break;

                case 5:
                    System.out.println("Ingrese la Id del cliente: ");
                    ideCliente = scanner.next();
                    crudCliente.setIdeCliente(ideCliente);
                    if (crudCliente.consultarIndRegistro())
                    {
                        if (crudCliente.eliminarRegistro())
                        {
                            System.out.println("Registro cliente eliminado ");
                        }
                        else
                        {
                            System.out.println("Error eliminando cliente ");
                        }
                    }
                    else
                    {
                        System.out.println("\n Registro no encontrado");
                    }
                break;

                case 6:
                    System.out.println("Ingrese la Id del cliente: ");
                    ideCliente = scanner.next();
                    crudCliente.setIdeCliente(ideCliente);
                    if (crudCliente.consultarIndRegistro())
                    {
                        System.out.println("ingese true para activar o false para desactivar el cliente. ");
                        String respuesta = scanner.next();
                        crudCliente.setActivo(respuesta);
                        if (crudCliente.anularRegistro())
                        {
                            System.out.println("Registro anulado ");
                        }
                        else
                        {
                            System.out.println("Error anulando registro");
                        }
                    }
                    else
                    {
                        System.out.println("\n Registro no encontrado");
                    }
                break;
            }
        }
        while (opcion != 7);
    }
}