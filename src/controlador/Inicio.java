/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Inicio {

    public static void main(String[] args) {
        Subject subjectCasaPeso = new Subject();
        subjectCasaPeso.setNombre("Casa Peso");
        Subject subjectCasaEuro = new Subject();
        subjectCasaEuro.setNombre("Casa Euro");

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        // Persona p3 =  new Persona(subjectCasaEuro);
        p1.setNombre("Andrea");
        p1.setSaldo(15);
        p1.agregar(subjectCasaEuro);
        p1.agregar(subjectCasaPeso);

//        p3.setNombre("Andrea");
//        p3.setSaldo(100);
//        
        p2.setNombre("Pedro");
        p2.setSaldo(16);
//        p2.agregar(subjectCasaPeso);
//        p2.agregar(subjectCasaPeso);
//        p1.agregar(subjectCasaEuro);
//        p1.agregar(subjectCasaPeso);
        
        subjectCasaPeso.setEstado(50);
        subjectCasaEuro.setEstado(25);

    }
}
