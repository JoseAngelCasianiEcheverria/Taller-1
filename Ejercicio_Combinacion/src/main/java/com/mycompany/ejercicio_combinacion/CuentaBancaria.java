
package com.mycompany.ejercicio_combinacion;

/**
 *
 * @author Gercray
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    
    public CuentaBancaria(){
         
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
     public void Datos_CuentaBancaria() {
         System.out.println("Su Cuenta Bancaria es: \n");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
    }
}
