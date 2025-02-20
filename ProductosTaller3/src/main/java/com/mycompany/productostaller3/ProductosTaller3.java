/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productostaller3;

/**
 *
 * @author Gercray
 */
public class ProductosTaller3 {

    public static void main(String[] args) {
         Producto producto = new Producto("Laptop", 1200.50, 10);
         
        System.out.println("Acceso a propiedades: ");
        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
        System.out.println("Stock: " + producto.stock);

        System.out.println("\nMostrar informacion del producto:");
        producto.datos_ProductosT3();
    
    }
}
