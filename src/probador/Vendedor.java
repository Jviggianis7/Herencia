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
public class Vendedor extends Empleado {
    private int  numventas;
    private int he;

    public Vendedor(String nombre, String apellido, int edad, int id, int suel, int ventas, int HrsE) {
        super(nombre, apellido, edad, id, suel);
        numventas=ventas;
        he=HrsE;
    }

    public int getHe() {
        return he;
    }

    public void setHe(int HrsE) {
        this.he = HrsE;
    }

    public int getNumventas() {
        return numventas;
    }

    public void setNumventas(int numventas) {
        this.numventas = numventas;
    }
   
    @Override
    public double AumenSueldo() {
       double sueldoneto, hes;
       sueldoneto=getSueldo()*getNumventas();
       hes=getHe()*5000;
       sueldoneto=sueldoneto+hes;
       
       return sueldoneto;
    }
    
}
