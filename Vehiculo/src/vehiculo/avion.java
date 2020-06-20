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
public class avion extends Vehiculo1 {
    protected int numeroVuelo;
   
      public avion ( int numeroRuedas,int numeroVuelo){
          super(numeroRuedas);
     this.numeroVuelo=numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }
    
    public String mostrarEstado(){
        return "ruedas:"+this.numeroVuelo;
    
    }
}
