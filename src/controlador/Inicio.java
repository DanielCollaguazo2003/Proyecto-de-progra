/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Timer;
import java.util.TimerTask;
import vista.VentanaBateria;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Inicio {
    
    public static void main(String[] args) {
        VentanaBateria v = new VentanaBateria();
        Bateria bateria = new Bateria(v);
        Tiemertarea tm = new Tiemertarea(v);
        BotonConectar bc = new BotonConectar(v, bateria);
        BotonDesconectar bd = new BotonDesconectar(v, bateria);
        
        v.botonConectar(bc);
        v.botonDesconectar(bd);
        v.setVisible(true);
    }
}
