/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Subject {

    private List<Observador> observadores = new ArrayList<>();
    private boolean estado;
    private String nombre = null;

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
        notificarTodosObservadores();
    }

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    public void notificarTodosObservadores() {
        observadores.forEach(x -> x.actualizar());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
