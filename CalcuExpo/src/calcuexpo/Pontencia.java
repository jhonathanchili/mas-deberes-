/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcuexpo;

/**
 *
 * @author HP
 */
class Pontencia {

   public static int pontencia(int x, int z, int a ){
        int resultado = 1;
        int suma = a;
        for(int i=1; i<=z; i++){
            resultado = resultado * x ;
        }
        return resultado + suma;
    }
}
