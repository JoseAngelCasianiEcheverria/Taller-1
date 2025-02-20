/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Gercray
 */
class Libro {
    private String titulo;
    private String autor;
    private String numeroPaginas;
    
    public Libro(){
        titulo = "Naruto";
        autor = "no se ";
        numeroPaginas = "255";
    }

    public Libro(String titulo, String autor, String numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void datosLibro() {
            System.out.println("titulo: " + titulo);
            System.out.println("De: " + autor);
            System.out.println("Con: " + numeroPaginas + " paginas");
    }
}
