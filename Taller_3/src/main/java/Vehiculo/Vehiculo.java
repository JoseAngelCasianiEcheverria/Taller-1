/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author Gercray
 */
public class Vehiculo {
    public String tipo;
    
    public Vehiculo(String tipo){
        this.tipo = tipo;
    }
    
    public void mostrarTipo(){
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}
