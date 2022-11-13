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
public class BotonDesconectar implements ActionListener {

    VentanaBateria v;
    Bateria bateria;

    public BotonDesconectar(VentanaBateria v, Bateria bateria) {
        this.v = v;
        this.bateria = bateria;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {        
        Subject sujetoCambioEstadoDesconectarBateria = new Subject();
        
        bateria.agregar(sujetoCambioEstadoDesconectarBateria);
        
        sujetoCambioEstadoDesconectarBateria.setEstado(false);
    }

}
