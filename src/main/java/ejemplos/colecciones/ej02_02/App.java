/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos.colecciones.ej02_02;

import java.util.Scanner;

/**
 *
 * @author DAW108
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el taller
        Taller taller = new Taller();

        // Crear algunos vehículos
        FichaVehiculo vehiculo1 = new FichaVehiculo("Toyota Corolla", "1234-ABC");
        FichaVehiculo vehiculo2 = new FichaVehiculo("Ford Focus", "5678-DEF");
        FichaVehiculo vehiculo3 = new FichaVehiculo("Honda Civic", "9012-GHI");

        // Insertar vehículos en el taller
        taller.insertarVehiculo(vehiculo1);
        taller.insertarVehiculo(vehiculo2);
        taller.insertarVehiculo(vehiculo3);

        System.out.println("Estado del taller después de insertar vehículos:");
        System.out.println(taller.mostrarEstado());

        // Reparar un vehículo
        taller.repararVehiculoIterator("1234-ABC");
        System.out.println("Estado del taller después de reparar el vehículo 1234-ABC:");
        System.out.println(taller.mostrarEstado());

        // Reparar otro vehículo
        taller.repararVehiculo("5678-DEF");
        System.out.println("Estado del taller después de reparar el vehículo 5678-DEF:");
        System.out.println(taller.mostrarEstado());

        // Dar salida a un vehículo
        taller.darSalidaVehiculoIterator("1234-ABC");
        System.out.println("Estado del taller después de dar salida al vehículo 1234-ABC:");
        System.out.println(taller.mostrarEstado());

        // Dar salida a otro vehículo
        taller.darSalidaVehiculo("5678-DEF");
        System.out.println("Estado del taller después de dar salida al vehículo 5678-DEF:");
        System.out.println(taller.mostrarEstado());

        // Intentar reparar un vehículo inexistente
        taller.repararVehiculoIterator("9999-ZZZ");
        System.out.println("Estado del taller después de intentar reparar un vehículo inexistente:");
        System.out.println(taller.mostrarEstado());
    }

}
