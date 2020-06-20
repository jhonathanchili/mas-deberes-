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
public class motocicleta  extends Vehiculo1 {
    protected int placa;
   
    
     public motocicleta(int numeroRuedas, int placa){
         super(numeroRuedas);
           this.placa=placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getPlaca() {
        return placa;
    }

    public String mostrarEstado(){
        return "ruedas:"+this.placa;
    
    }
    
}
