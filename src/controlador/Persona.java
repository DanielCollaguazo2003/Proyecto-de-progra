/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Persona extends Observador {

    private String nombre;
    private int saldo;

    @Override
    public void agregar(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);

    }

    @Override
    public void actualizar() {
        System.out.println("El sueldo con el sujeto " + sujeto.getNombre() + " es: " + (sujeto.getEstado() * saldo) + " para el cliente: " + getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setSujeto(Subject sujeto) {
        this.sujeto = sujeto;
    }

}
