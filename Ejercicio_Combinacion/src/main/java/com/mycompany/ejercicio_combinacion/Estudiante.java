/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_combinacion;

/**
 *
 * @author Gercray
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;
    

    public Estudiante(String nombre, int edad, String curso){
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    public void Datos_Estudiante(){
        System.out.println("Estudiante creado: \n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}
