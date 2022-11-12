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
public class Bateria extends Observador {

    private double tiempo;
    private VentanaBateria v = new VentanaBateria();

    @Override
    public void agregar(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);

    }

    @Override
    public void actualizar() {
//        int porcentaje = Integer.parseInt(v.getIngresoPorcentaje().getText());
//        v.getPorcentaje().setText(porcentaje + "%");
System.out.println("hola mundo");
    }

}
