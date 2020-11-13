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
public class JefeZona extends Empleado{
    
    private double precioproducto;
    private int cantidistri;

    public JefeZona(String nombre, String apellido, int edad, int id, int suel, double prod, int cant) {
        super(nombre, apellido, edad, id, suel);
        precioproducto=prod;
        cantidistri=cant;
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(double prod) {
        this.precioproducto = prod;
    }

    public int getCantidistri() {
        return cantidistri;
    }

    public void setCantidistri(int cant) {
        this.cantidistri = cant;
    }
    

    @Override
    public double AumenSueldo() {
       double dato;
             
        dato=getCantidistri()*getPrecioproducto();
        
        dato=dato+getSueldo();
        
        return dato;
       
    }
    
}
