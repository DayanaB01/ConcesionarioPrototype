/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;


/**
 *
 * @author USUARIO
 */
public class carro {  //arraylist
    private int codigo;
    private String nombre;
    private String color;
    private int cilindraje;
    private int modelo;
    private int precio=2500000;
   
    
    public carro(){
    }
    
    public carro(int codigo, String nombre, String color, int cilindraje, int modelo, int precio){//constructor
        this.codigo=codigo;
        this.nombre=nombre;
        this.color=color;
        this.cilindraje=cilindraje;
        this.modelo=modelo;
        this.precio=precio;
    
    }
    
    public int Getcodigo(){
     return this.codigo;
    }
    
    public void  Setcodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String Getnombre(){
     return this.nombre;
    }
    
    public void  Setnombre(String nombre){
        this.nombre=nombre;
    }
     public String Getcolor(){
     return this.color;
    }
    public void  Setcolor(String color){
        this.color=color;
    }
    public int Getcilindraje(){
     return this.cilindraje;
    }
    public void  Setcilindraje(int cilindraje){
        this.cilindraje=cilindraje;
    }
    public int Getmodelo(){
     return this.modelo;
    }
    public void  Setmodelo(int modelo){
        this.modelo=modelo;
    }
     public int Getprecio(){
     return this.precio;
    }
    public void  Setprecio(int precio){
        this.precio=25000000;
    }
}
