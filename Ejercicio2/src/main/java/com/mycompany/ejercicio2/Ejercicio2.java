/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        CuentaBancaria jose = new CuentaBancaria();
        CuentaBancaria yani = new CuentaBancaria("155461346", "Corriente");
        CuentaBancaria karen = new CuentaBancaria("5461346", 500.0, "Corriente");
        
        jose.Datos();
        System.out.println("");
        yani.Datos();
        System.out.println("");
        karen.Datos();
    }
}
