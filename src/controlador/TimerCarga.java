/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.TimerTask;
import vista.VentanaBateria;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class TimerCarga extends TimerTask {

    int minuto;
    int hora;
    LocalTime lt;
    VentanaBateria v;

    public TimerCarga(int minuto, int hora, VentanaBateria v) {
        this.minuto = minuto;
        this.hora = hora;
        this.v = v;
        this.lt = LocalTime.of(hora, minuto);
    }

    @Override
    public void run() {
        if (minuto < 60) {
            lt = LocalTime.of(hora, minuto);
            minuto = minuto - 1;
        } else {
            minuto = 0;
            hora = minuto - 1;
        }
        String tiempo = lt + ":00";
        v.getTiempoCarga().setText(tiempo);
    }

}
