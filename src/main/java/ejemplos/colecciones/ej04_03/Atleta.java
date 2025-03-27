/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej04_03;

/**
 *
 * @author DAW108
 */
public class Atleta {

    private int dorsal;
    private String nombre;
    private double tiempo;

    public Atleta(int dorsal, String nombre, double tiempo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Atleta{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Si son el mismo objeto
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Si no son del mismo tipo
        }
        Atleta atleta = (Atleta) obj;
        return this.dorsal == atleta.dorsal; // Comparar por dorsal
    }

    @Override
    public int hashCode() {
        return dorsal; // Usar el dorsal
    }

}
