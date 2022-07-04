/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class consecionario {

    private String nombre2;
    private int id;
    private final ArrayList<carro> carros;//lista la defini como carros

    public consecionario(String nombre, int id) {
        this.nombre2 = nombre;
        this.id = id;
        carros = new ArrayList<carro>();

    }

    //get
    public String Getnombre() {
        return this.nombre2;
    }

    public void Setnombre(String nombre) {
        this.nombre2 = nombre;
    }

    //set
    public int Getid() {
        return this.id;
    }

    public void Setid(int id) {
        this.id = id;
    }

    public void Agregarcarro(carro carros) {//en c puedo poner el nombre q quiera       
        this.carros.add(carros);
    }

    public carro BuscarCarro(int codigo) {//puedo poner lo que yo quiero buscar(placa etc) se declara variable nueva
        for (int i = 0; i < carros.size(); i++) {//tal cual esta en lista
            carro car = carros.get(i);        //habria que hacer ArrayList<color> hay que hacer otra lista con color
            if (car.Getcodigo() == codigo) {
                return car;
            }
        }
        return null;
    }

    public carro EliminarCarro(int codigo) {
        for (int i = 0; i < carros.size(); i++) {
            carro encontrado = carros.get(i);
            if (encontrado.Getcodigo() == codigo) {
                this.carros.remove(i);
            }
        }
        return null;
    }

    public ArrayList<carro> Buscarporcolor(String color) { //con este puedo buscar por una caracterista especifica    
        ArrayList<carro> Busquedacolor = new ArrayList<carro>();
        for (int i = 0; i < carros.size(); i++) {
            carro car = carros.get(i);
            if (car.Getcolor().equals(color)) {
                Busquedacolor.add(car);
            }
        }
        return Busquedacolor;
    }

    public double promediomodelo() {
        int suma = 0;
        double prom;

        for (int i = 0; i < carros.size(); i++) {
            carro model = carros.get(i);
            suma += model.Getmodelo();
        }
        prom = suma / carros.size();
        return prom;
    }

    public String BuscarColor1(String color) {
       
        for (carro car : carros) {
            if(car.Getcolor().equalsIgnoreCase(color)){
            String bingo=color;
            }               
        }
        return color ;

    }

    public String CantidadColor() {
        int contadorazul = 0, contadorrojo = 0, contadornegro = 0;
        for (carro car : carros) {
            if (car.Getcolor().equalsIgnoreCase("azul")) {
                contadorazul++;
            } else if (car.Getcolor().equalsIgnoreCase("rojo")) {//ingnorecase es para comparar las palabras todas en minuscula sin importar si hay mayusculas
                contadorrojo++;
            } else if (car.Getcolor().equalsIgnoreCase("negro")) {
                contadornegro++;
            }
        }
        String Mensaje = "los carros rojos son " + contadorazul + "los carros rojos son " + contadorrojo + "y los negros son " + contadornegro;
        return Mensaje;
    }
    
    public ArrayList<carro> obtenerlista(){
    return this.carros;
    }
    

}
    
    
    
    
    
    

//al imprimir el carroyo guardo el carro encontrado en otra variable y luego puedo llamar cualquier caracteristica del carro(nombre, color,placa etc)
