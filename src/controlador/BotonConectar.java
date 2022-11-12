/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaBateria;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class BotonConectar implements ActionListener{
    VentanaBateria v;

    public BotonConectar(VentanaBateria v) {
        this.v = v;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Bateria bateria = new Bateria();
        
        Subject sujetoCambioEstadoBateria = new Subject();
        
        bateria.agregar(sujetoCambioEstadoBateria);
        
        sujetoCambioEstadoBateria.setEstado(true);
    }
    
}
