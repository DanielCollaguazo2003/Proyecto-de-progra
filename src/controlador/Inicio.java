/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VentanaBateria;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Inicio {
    
    public static void main(String[] args) {
        VentanaBateria v = new VentanaBateria();
        
        BotonConectar bc = new BotonConectar(v);
        
        v.botonConectar(bc);
        
        v.setVisible(true);
    }
}
