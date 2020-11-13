/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probador;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class Secretario extends Empleado {
    
    private int meses;
    
    
    
    public Secretario(String nombre, String apellido, int edad, int id, String perfil, int suel, int mes) {
        super(nombre, apellido, edad, id, suel);
        meses=mes;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int mes) {
        this.meses = mes;
    }

    @Override
    public double AumenSueldo() {
        double sueldoTotal=0;
        
        if(getMeses()==12 && getEdad()>=50){
            sueldoTotal=(getSueldo()*0.30)+getSueldo();
            
        }
        else
            if(getMeses()<12 && getEdad()>50){
                sueldoTotal=(getSueldo()*0.15)+getSueldo();
                
            }
        else
                if(getMeses()==12 && getEdad()<50){
                    sueldoTotal=(getSueldo()*0.10)+getSueldo();
                    
                }
        else
                    if(getMeses()<12 && getEdad()<50){
                        sueldoTotal=getSueldo();
                       
                    }
       return sueldoTotal;
    }
    
    
}
