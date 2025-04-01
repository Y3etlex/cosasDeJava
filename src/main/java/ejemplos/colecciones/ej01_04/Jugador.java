/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej01_04;

import java.util.Objects;

/**
 *
 * @author DAW108
 */
public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private double estatura;

    public Jugador(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.estatura) ^ (Double.doubleToLongBits(this.estatura) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (Double.doubleToLongBits(this.estatura) != Double.doubleToLongBits(other.estatura)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int compareTo(Jugador o) {
        return Double.compare(this.estatura, o.estatura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", estatura=").append(estatura);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
