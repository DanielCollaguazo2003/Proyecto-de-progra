/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import vista.VentanaBateria;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Bateria extends Observador {

    private double tiempo;
    private VentanaBateria v;
    private int numerofinal, operacionfinal, numeroinicial;
    int minuto = 0;
    int segundo = 0;
    LocalTime lt = null;
    LocalTime lc = null;
    boolean verificar = true;
    int minuto2;
    int hora2;
    int tiempoInicial = 0;

    public Bateria(VentanaBateria v) {
        this.v = v;
    }

    @Override
    public void agregar(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);

    }

    @Override
    public void actualizar() {
        if (sujeto.getEstado() == true) {
            String porcentaje = v.getIngresoPorcentaje().getText();
            if ((Integer.parseInt(porcentaje) > 100) || (Integer.parseInt(porcentaje) < 0)) {
                JOptionPane.showMessageDialog(null, "Ingresar numeros validos [0-100]");
            } else {
                v.getPorcentaje().setText(porcentaje + "%");
                int tiempoCarga = (100 - Integer.valueOf(porcentaje)) * 2;
                double horas = (tiempoCarga / 60.0);
                String format = String.format("%.2f", horas);
                String[] hora = format.split(",");
                numerofinal = Integer.parseInt(hora[1]);
                operacionfinal = (int) Math.round((numerofinal * 0.6));
                numeroinicial = Integer.parseInt(hora[0]);
                v.getTiempoCarga().setText(numeroinicial + ":" + operacionfinal + ":00");
                temporizador();
                cronometro();
            }
        } else {
            v.getTiempoCarga().setText("00:00:00");
            verificar = false;
            v.getTemporizador().setText("00:00:00");
            minuto = 0;
            segundo = 0;
            lt = null;
            lc = null;
            minuto2 = numeroinicial;
            hora2 = operacionfinal;
            tiempoInicial = 1000;
            cronometro();
            temporizador();

            
        }

    }

    public void temporizador() {
        Timer timer = new Timer();
//        Tiemertarea tm = new Tiemertarea(v);
        TimerTask tm = new TimerTask() {
            @Override
            public void run() {
                if (v.getTiempoCarga().getText().equals("00:00:00")) {
                    verificar = false;
                } else {
                    if (segundo < 60) {
                        lc = LocalTime.of(minuto, segundo);
                        segundo = segundo + 1;
                        System.out.println("00:" + lc);
                    } else {
                        segundo = 0;
                        minuto = minuto + 1;
                    }
                    String tiempo = "00:" + lc;
                    v.getTemporizador().setText(tiempo);

                }
            }
        };
        if (verificar == false) {
            timer.cancel();
        } else {
            timer.schedule(tm, 0, 1000);
        }

    }

    public void cronometro() {
        minuto2 = operacionfinal;
        hora2 = numeroinicial;
        tiempoInicial = 61500;
        System.out.println(minuto2 + "---" + hora2 + "->" + operacionfinal + "----" + numeroinicial);
        Timer timer = new Timer();
        TimerTask tc = new TimerTask() {
            @Override
            public void run() {
                if (v.getTiempoCarga().getText().equals("00:00:00")) {
                    verificar = false;
                } else {
                    if (minuto2 < 60) {
                        lt = LocalTime.of(hora2, minuto2);
                        minuto2 = minuto2 - 1;
                        System.out.println(lt);
                    } else {
                        minuto2 = 0;
                        hora2 = minuto2 - 1;
                    }
                    String tiempo = lt + ":00";
                    v.getTiempoCarga().setText(tiempo);
                }
            }
        };
        if (verificar == false) {
            timer.cancel();
        } else {

            timer.schedule(tc, 0, tiempoInicial);
            tiempoInicial = tiempoInicial + 3000;
        }

    }

}
