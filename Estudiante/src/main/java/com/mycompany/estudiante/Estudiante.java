/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiante;

/**
 *
 * @author Gercray
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;
    
    public Estudiante(){
        this.nombre = "Jose Angel Casiani Echeverria";
        this.edad = 18;
        this.curso = "14";
    }
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
    public void Datos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}
