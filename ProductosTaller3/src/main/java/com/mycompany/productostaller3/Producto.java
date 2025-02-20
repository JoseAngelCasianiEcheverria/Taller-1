
package com.mycompany.productostaller3;

/**
 *
 * @author Gercray
 */
 class Producto {
      String nombre;
      double precio;
      int stock;
      
      Producto(String nombre, double precio, int stock){
          this.nombre = nombre;
          this.precio = precio;
          this.stock = stock;
      }
      
      public void datos_ProductosT3(){
          System.out.println("Nombre: " + nombre);
          System.out.println("Precio: " + precio);
          System.out.println("Stock: " + stock);
      }
}
