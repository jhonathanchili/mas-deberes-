/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfirmo;

/**
 *
 * @author HP
 */
public class Directivo extends Empleado {
    
    
   public Directivo(String nombre){
        super(nombre);
    }
    @Override
    public String  toString(){
        return "Empleado "+ this.nombre; 
    }
    
}
