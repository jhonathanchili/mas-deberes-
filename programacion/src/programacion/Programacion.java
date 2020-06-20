/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

/**
 *
 * @author HP
 */
public class Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int voki[]={3,7,12,22,9,25,18,31,21,14,45,2};
        int total=0;
        int cont=0;
        for(int contador=0; contador<voki.length;contador++){
            total+=voki[contador];
        }
        System.out.println("tu suma es igual a : "+total);
    }
    
}
