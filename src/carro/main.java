/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package carro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 /*
public class main {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        int opcion = 1;
        Scanner teclado = new Scanner(System.in);
        ArrayList<carro> coloren = new ArrayList<carro>();

        consecionario conse = new consecionario("Bienvenido a Consecionario AutoColombia", 1);
        carro atribu = new carro();

        while (opcion != 0) {
            System.out.println("" + conse.Getnombre());
            System.out.println("Utilize el siguiente menu: \n"
                    + "1: Agregar carro nuevo \n"
                    + "2: Buscar carro \n"
                    + "3: Eliminar carro \n"
                    + "4: Visualizar todas las caracteristicas del ultimo  auto ingresado\n"
                    + "5: buscar color:\n "
                    + "6: cantidad color\n"
                    + "0:salir");

            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar nombre: ");
                    String nombre = teclado.next();
                    atribu.Setnombre(nombre);
                    System.out.println("Ingresar codigo: ");
                    int codigo = teclado.nextInt();
                    atribu.Setcodigo(codigo);
                    System.out.println("Ingresar color: ");
                    String color = teclado.next();
                    atribu.Setcolor(color);
                    System.out.println("Ingresar cilindraje: ");
                    int cilindraje = teclado.nextInt();
                    atribu.Setcilindraje(cilindraje);
                    System.out.println("Ingresar modelo: ");
                    int modelo = teclado.nextInt();
                    atribu.Setmodelo(modelo);
                    break;
                case 2:
                    System.out.println("Ingrese codigo del carro a buscar: ");
                    codigo = teclado.nextInt();
                    conse.BuscarCarro(codigo);
                    carro carroencontrado = conse.BuscarCarro(0);
                    System.out.println("El nombre del carro buscado es: " + atribu.Getnombre());
                    break;
                case 3:
                    System.out.println("Ingrese codigo de carro a eliminar: ");
                    codigo = teclado.nextInt();
                    conse.EliminarCarro(codigo);
                    break;
                case 4:
                    System.out.println("-Nombre: " + atribu.Getnombre() + "\n"
                            + "-Color: " + atribu.Getcolor() + "\n"
                            + "-Codigo: " + atribu.Getcodigo() + "\n"
                            + "-Cilindraje: " + atribu.Getcilindraje() + "\n"
                            + "-Modelo: " + atribu.Getmodelo() + "\n"
                            + "-Precio: " + atribu.Getprecio());

                    break;
                case 5:
                    System.out.println("Ingresa color a buscar: ");
                    String Color1 = teclado.next();
                    coloren = conse.Buscarporcolor(Color1);
                    for (int i = 0; i < coloren.size(); i++) {
                        System.out.println("datos de los autos: \n"
                                + "-nombre: " + coloren.get(i).Getnombre());
                        System.out.println("codigo: " + coloren.get(i).Getcodigo());

                    }
                    break;
                case 6:
                    System.out.println(conse.CantidadColor());
                    break;

                default:
            }
        }

    }

}*/
