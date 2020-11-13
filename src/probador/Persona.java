/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probador;

/**
 *
 * @author Jhon
 */
public class Persona {
    
     protected String nombre;
     protected int id;
     protected String apellidos;
     protected int edad;

    public Persona(String nom, String ape, int edad, int id) {
        nombre = nom;
        id = id;
        apellidos = ape;
        edad = edad;
   
   }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String ape) {
        this.apellidos = ape;
    }
}
