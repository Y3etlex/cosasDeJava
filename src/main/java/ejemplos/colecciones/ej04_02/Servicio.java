/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.colecciones.ej04_02;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 *
 * @author DAW108
 */
public class Servicio {
    
    private Queue<Cliente> enEspera;
    private List<Cliente> atendidos;

    public Servicio() {
        this.enEspera = new LinkedList();
        this.atendidos = new ArrayList();
    }
    public void insertar(Cliente c){
        if(enEspera.add(c)){
            System.out.println("Cliente en espera correctamente");
        }else{
            System.out.println("Error al poner el cliente en espera");
        }
    }
    
    public void atender(){
        Cliente c = enEspera.poll();
        c.setAtencion(LocalDateTime.now());
        if (atendidos.add(c)) {
            System.out.println("Cliente atendido correctamente"+c.toString());
        }else{
            System.out.println("No se pudo atender al cliente"+c.toString());
        }
    }
    
    public double tiempoEsperaNoAtendidos(){
        double d = 0;
        LocalDateTime fechaHoy = LocalDateTime.now();
        
        for (Cliente cliente : enEspera) {
            d += ChronoUnit.SECONDS.between(cliente.getLlegada(), fechaHoy);
        }
        if (enEspera.size()==0) {
            return 0;
        }
        return d / enEspera.size();
    }
    
    public double tiempoMedioAtencion(){
        double d = 0;
        for (Cliente atendido : atendidos) {
            d += ChronoUnit.SECONDS.between(atendido.getLlegada(), atendido.getAtencion());
        }
        if (atendidos.size() == 0) {
            return 0;
        }
        return d / atendidos.size();
    }
    
    public String mostrar(){
        String cadena = "Clientes en espera: \n";
        for (Cliente cliente : enEspera) {
            cadena += cliente.toString()+"\n";
        }
        cadena += "Clientes atendidos: \n";
        for (Cliente cliente : atendidos) {
            cadena += cliente.toString()+"\n";
        }
        return cadena;
    }
    
}
