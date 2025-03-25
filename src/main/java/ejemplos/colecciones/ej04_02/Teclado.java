/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej04_02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAW108
 */
public class Teclado {
    
    public static String validaNombre(Scanner t1){
        String nombre = "";
        boolean seguir = false;
        do{
            System.out.println("Introduce un nombre (minimo 3 letras)");
            nombre = t1.nextLine();
            //nombre = nombre.replaceAll("\\s+", "");
            Pattern patron = Pattern.compile("^[a-zA-Z]{3,}$");
            Matcher coincidencia = patron.matcher(nombre);
            seguir = !coincidencia.matches();
            
            if (!seguir) {
                System.out.println("Error --> el nombre debe tener al menos 3 letras");
            }
            
        }while(seguir);
        
        return nombre;
    }
    
    public static String validaTelefono(Scanner t1){
        String telefono = "";
        boolean seguir = false;
        do{
            System.out.println("Introduce un numero de telefono (9 numeros)");
            telefono = t1.nextLine();
            telefono = telefono.replaceAll("\\s+", "");
            Pattern patron = Pattern.compile("^[0-9]{9}$");
            Matcher coincidencia = patron.matcher(telefono);
            seguir = !coincidencia.matches();
            
            if (!seguir) {
                System.out.println("Error --> el numero necesita 9 digitos");
            }
            
        }while(seguir);
        
        return telefono;
        
    }
    
}
