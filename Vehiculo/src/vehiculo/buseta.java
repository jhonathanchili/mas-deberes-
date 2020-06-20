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
public class buseta extends Vehiculo1 {
    protected int numeroRecorido;
    
    public buseta(int numeroRuedas, int numeroRecorido){
        super(numeroRuedas);
     this.numeroRecorido=numeroRecorido;
    }

    public int getNumeroRecorido() {
        return numeroRecorido;
    }

    public void setNumeroRecorido(int numeroRecorido) {
        this.numeroRecorido = numeroRecorido;
    }
     public String mostrarEstado(){
        return "ruedas:"+this.numeroRecorido;
    
    }
    
}
