/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_combinacion;

/**
 *
 * @author Gercray
 */
import java.util.Scanner;

public class Ejercicio_Combinacion {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("****BIENVENIDO A EL SISTEMA DE CREACION DE LIBRO****");
        System.out.println("");
        System.out.println("Ingrese los datos de el libro.");
        System.out.println("");
        System.out.print("Titulo: ");
        String Titulo = Leer.nextLine();
        System.out.print("Autor: ");
        String Autor = Leer.nextLine();
        System.out.print("Numero de Paginas: ");
        int numeroPaginas = Leer.nextInt();
        
        System.out.println("\n");
        
        System.out.println("****BIENVENIDO A EL SISTEMA DE CREACION DE CUENTA BANCARIA****");
        System.out.println("");
        System.out.println("Ingrese los datos de su cuenta.");
        System.out.println("");
        System.out.print("Numero de cuenta: ");
        String numeroCuenta = Leer.nextLine();
        System.out.print("Saldo: ");
        double saldo = Leer.nextDouble();
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = Leer.nextLine();
        
        System.out.println("****BIENVENIDO A EL SISTEMA DE CREACION DE ESTUDIANTE****");
        System.out.println("");
        System.out.println("Ingrese sus datos.");
        System.out.println("");
        System.out.print("Nombre: ");
        String nombre = Leer.nextLine();
        System.out.print("Edad: ");
        int edad = Leer.nextInt();
        System.out.print("Curso: ");
        String curso = Leer.nextLine();
        
        Libro libro1 = new Libro(Titulo, Autor, numeroPaginas);
        Libro libro2 = new Libro("El amor en tiempos de colera", "Gabriel garcia marquez", 500);
        
        CuentaBancaria cuentabancaria1 = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        CuentaBancaria cuentabancaria2 = new CuentaBancaria("153152135", 200000.0, "Corriente");
        
        Estudiante estudiante1 = new Estudiante(nombre, edad, curso);
        Estudiante estudiante2 = new Estudiante("Jose Angel Casiani", 18, "POO");
        
        System.out.println("");
        libro1.datosLibro();
        System.out.println("");
        libro2.datosLibro();
        System.out.println("\n");
        cuentabancaria1.Datos_CuentaBancaria();
        System.out.println("");
        cuentabancaria2.Datos_CuentaBancaria();
        System.out.println("\n");
        estudiante1.Datos_Estudiante();
        System.out.println("");
        estudiante2.Datos_Estudiante();
        
        
        
        
        
        
    }
}
