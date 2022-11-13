/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.TimerTask;
import vista.VentanaBateria;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Tiemertarea extends TimerTask {

    VentanaBateria v;
    int minuto = 0;
    int segundo = 0;
    LocalTime lt = null;

    public Tiemertarea(VentanaBateria v) {
        this.v = v;
    }

    @Override
    public void run() {
        temporizador();
    }

    public void temporizador() {
        if (!v.getTiempoCarga().equals("00:00:00")){
            if (segundo < 60) {
                lt = LocalTime.of(minuto, segundo);
                segundo = segundo + 1;
                System.out.println("00:" + lt);
            } else {
                segundo = 0;
                minuto = minuto + 1;
            }
            String tiempo = "00:" + lt;
            v.getTemporizador().setText(tiempo);
    }else{
            
        }}

}
