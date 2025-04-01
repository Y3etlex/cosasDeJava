/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej01_04;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAW108
 */
public class Equipo {
    private SortedSet<Jugador> miEquipo;
    
    public Equipo(){
        miEquipo = new TreeSet();
    }
    
    public void insertar(Jugador j){
        if(miEquipo.add(j)){
            System.out.println("Jugador añadido correctamente");
        }else{
            System.out.println("No se ha podido añadir el jugador");
        }
    }
    
    public void borrar(String nombre){
        Iterator<Jugador> it = miEquipo.iterator();
        while(it.hasNext()){
            Jugador jugador = it.next();
            if(jugador.getNombre() != null && jugador.getNombre().equalsIgnoreCase(nombre)){
                it.remove();
                return;
            }
        }
    }
    
    public void borrarB(String nombre){
        Jugador jugadorAEliminar = null;
        for (Jugador jugador : miEquipo) {
            if (jugador.getNombre() != null && jugador.getNombre().equals(nombre)) {
                jugadorAEliminar = jugador;
                break;
            }
        }
        if(jugadorAEliminar != null){
            miEquipo.remove(jugadorAEliminar);
        }
    }
    
}
