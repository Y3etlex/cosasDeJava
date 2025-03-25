/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos.colecciones.ej04_02;

import java.util.*;
import java.time.*;

/**
 *
 * @author DAW108
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        Scanner t1 = new Scanner(System.in);
        int opc = 0;

        while (opc != 5) {
            try {
                menu();
                opc = Integer.parseInt(t1.nextLine());
                switch (opc) {
                    
                    case 1 ->{
                        String nombre = Teclado.validaNombre(t1);
                        String numero = Teclado.validaTelefono(t1);
                        Cliente c = new Cliente(nombre,numero);
                        servicio.insertar(c);
                    }
                    case 2 ->{
                        servicio.atender();
                    }
                    
                    
                }

            } catch (Exception e) {
                System.out.println("Error");
            }

        }
    }

    public static void menu() {
        System.out.println("1.-Añadir un Cliente.");
        System.out.println("2.-Atender un cliente.");
        System.out.println("3.-.");
        System.out.println("4.-.");
        System.out.println("5.-.");
        System.out.println("6.-Salir del programa.");
    }

}
