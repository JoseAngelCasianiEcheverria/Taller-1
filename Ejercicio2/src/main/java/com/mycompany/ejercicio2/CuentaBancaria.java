/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author Gercray
 */
 class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    
    public CuentaBancaria(){
     this.numeroCuenta = "Desconocida";
     this.saldo = 0.0;
     this.tipoCuenta = "Desconocida";        
    }
    
    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
         this.numeroCuenta = numeroCuenta;
         this.saldo = 0.0;
         this.tipoCuenta = tipoCuenta;
    }
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
     public void Datos() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
}
