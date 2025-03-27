/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej02_02;

import java.time.LocalDateTime;

/**
 *
 * @author DAW108
 */
class FichaVehiculo {

    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaReparacion;
    private LocalDateTime fechaSalida;
    private String modelo;
    private String matricula;

    // Constructor
    public FichaVehiculo(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    // Getters y Setters
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDateTime fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Matrícula: " + matricula
                + ", Fecha de entrada: " + (fechaEntrada != null ? fechaEntrada : "Sin registrar")
                + ", Fecha de reparación: " + (fechaReparacion != null ? fechaReparacion : "Sin registrar")
                + ", Fecha de salida: " + (fechaSalida != null ? fechaSalida : "Sin registrar");
    }
}
