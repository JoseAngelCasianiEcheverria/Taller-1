/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiante;

/**
 *
 * @author Gercray
 */
public class Estudiante_main {

    public static void main(String[] args) {
        Estudiante jose = new Estudiante();
        Estudiante yani = new Estudiante("Yani", 16);
        Estudiante karen = new Estudiante("Karen", 19, "15");
        
        jose.Datos();
        System.out.println("");
        yani.Datos();
        System.out.println("");
        karen.Datos();
    }
}
