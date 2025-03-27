/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej02_02;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DAW108
 */
class Taller {

    private LinkedList<FichaVehiculo> enEspera = new LinkedList<>();
    private LinkedList<FichaVehiculo> reparados = new LinkedList<>();
    private LinkedList<FichaVehiculo> finalizados = new LinkedList<>();

    // Método para insertar vehículo
    public void insertarVehiculo(FichaVehiculo vehiculo) {
        vehiculo.setFechaEntrada(LocalDateTime.now());
        enEspera.add(vehiculo);
    }

    // Método para reparar vehículo
    public void repararVehiculo(String matricula) {
        for (FichaVehiculo vehiculo : enEspera) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setFechaReparacion(LocalDateTime.now());
                enEspera.remove(vehiculo);
                reparados.add(vehiculo);
                return;
            }
        }
    }

    //Método para reparar vehículo con iterator
    public void repararVehiculoIterator(String matricula) {
        Iterator<FichaVehiculo> iterator = enEspera.iterator();
        while (iterator.hasNext()) {
            FichaVehiculo vehiculo = iterator.next();
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setFechaReparacion(LocalDateTime.now());
                iterator.remove(); // Elimina el vehículo de la lista enEspera
                reparados.add(vehiculo); // Lo añade a la lista reparados
                return;
            }
        }
    }

    // Método para dar salida a un vehículo
    public void darSalidaVehiculo(String matricula) {
        for (FichaVehiculo vehiculo : reparados) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setFechaSalida(LocalDateTime.now());
                reparados.remove(vehiculo);
                finalizados.add(vehiculo);
                return;
            }
        }
    }

    // Método para dar salida a un vehículo con iterator
    public void darSalidaVehiculoIterator(String matricula) {
        Iterator<FichaVehiculo> iterator = reparados.iterator();
        while (iterator.hasNext()) {
            FichaVehiculo vehiculo = iterator.next();
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setFechaSalida(LocalDateTime.now());
                iterator.remove(); // Elimina el vehículo de la lista reparados
                finalizados.add(vehiculo); // Lo añade a la lista finalizados
                return;
            }
        }
    }

    // Método para mostrar el estado del taller
    public String mostrarEstado() {
        StringBuilder estado = new StringBuilder();
        estado.append("En espera:\n");
        for (FichaVehiculo vehiculo : enEspera) {
            estado.append(vehiculo).append("\n");
        }
        estado.append("Reparados:\n");
        for (FichaVehiculo vehiculo : reparados) {
            estado.append(vehiculo).append("\n");
        }
        estado.append("Finalizados:\n");
        for (FichaVehiculo vehiculo : finalizados) {
            estado.append(vehiculo).append("\n");
        }
        return estado.toString();
    }
}
