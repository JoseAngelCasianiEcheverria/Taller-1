/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vehiculo;

/**
 *
 * @author Gercray
 */
public class Taller_3 {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Automovil");
        
        System.out.println(vehiculo.tipo);
        
        vehiculo.mostrarTipo();
        
        Moto moto = new Moto("Moto");
        
        System.out.println(moto.tipo);
        
        moto.mostrarTipo();
        
        System.out.println("\nError: ");
        System.out.println("El error se da a el comento de copilar por que Vehiculos tiene acceso default y no se puede acceder desde otro paquete");
    }
}
