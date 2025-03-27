/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej04_03;

import java.util.LinkedHashSet;

/**
 *
 * @author DAW108
 */
public class Carrera {
    
    private LinkedHashSet<Atleta> atleta;
    
    public Carrera(){};
    
    public void añadirAtleta(Atleta a){
        if(atleta.add(a)){
            System.out.println("Atleta añadido.");
        }else{
            System.out.println("Atleta no añadido, dorsal repetido detectado.");
        };
    }
    
    
    
}
