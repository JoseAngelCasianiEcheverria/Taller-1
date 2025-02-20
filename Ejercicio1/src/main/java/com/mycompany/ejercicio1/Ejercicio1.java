/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Gercray
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Libro Naruto= new Libro ();
        Libro Onepiece = new Libro("One piece", "Eichiro Oda", "1033");
        
        Onepiece.datosLibro();
        System.out.println("");
        Naruto.datosLibro();

    }
}
