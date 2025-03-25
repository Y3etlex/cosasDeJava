/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej04_02;

import java.time.*;
import java.util.*;

/**
 *
 * @author DAW108
 */
public class Cliente {
    private String nombre;
    private String numero;
    private LocalDateTime llegada;
    private LocalDateTime atencion;

    public Cliente(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.llegada = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    public LocalDateTime getAtencion() {
        return atencion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setLlegada(LocalDateTime llegada) {
        this.llegada = llegada;
    }

    public void setAtencion(LocalDateTime atencion) {
        this.atencion = atencion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numero=" + numero + ", llegada=" + llegada + ", atencion=" + atencion + '}';
    }
    
    
}
