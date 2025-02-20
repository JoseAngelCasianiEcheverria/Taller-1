/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_combinacion;

/**
 *
 * @author Gercray
 */

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    public Libro(){
       
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void datosLibro() {
            System.out.println("Libro creado: \n");
            System.out.println("Titulo: " + titulo);
            System.out.println("De: " + autor);
            System.out.println("Con: " + numeroPaginas + " paginas");
    }
}
