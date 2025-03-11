/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja01_Genericos_06_E2;

import java.util.Scanner;

/**
 *
 * @author DAW108
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comprobar el funcionamiento
        
        Pila<Integer> pila = new Contenedor(new Integer[0]);
        
        Scanner t1 = new Scanner(System.in);
        boolean seguir = true;
        Integer n = 0;
        
        while(seguir){
            try{
                System.out.println("Introduce un numero entero positivo (escribe -1 para terminar) ");
                do {
                    n = Integer.parseInt(t1.nextLine());
                    if(n < 0 && n != -1){
                        throw new Exception("El numero debe ser positivo, salvo para terminar que seria -1");
                    }else if(n!= -1){
                        pila.apilar(n);
                    }
                } while (n!= -1);
                seguir = false;
            }catch(NumberFormatException e1){
                System.out.println("Valor no valido, solo enteros positivos");
            }catch(Exception e2){
                System.out.println(e2.getMessage());
            }
        }
        
        
        System.out.println("Pasamos a desapilar la pila");
        n = pila.desapilar();
        while(n!= null){
            System.out.println(n + "\t");
        }
        
    }
    
}
