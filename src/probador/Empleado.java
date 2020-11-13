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
public abstract class Empleado extends Persona {
    
    private int sueldo;
 
    public Empleado(String nombre, String apellido, int edad, int id, int suel){
        super(nombre, apellido, edad, id);
        sueldo=suel;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setCargo(int suel) {
        this.sueldo = suel;
    }
    public abstract double AumenSueldo();
    
}
