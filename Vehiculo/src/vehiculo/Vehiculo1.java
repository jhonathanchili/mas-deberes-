/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author HP
 */
public class Vehiculo1 {
    protected int numeroRuedas;
    
 public Vehiculo1(int numeroRuedas){
     
     this.numeroRuedas=numeroRuedas;
 }    

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
    
    public String mostrarEstado(){
        return "ruedas:"+this.numeroRuedas;
    
    }
}
