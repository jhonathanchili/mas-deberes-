/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("ingrese el tamaño del arreglo");
      
      int numero;
      int contador;
      int sumaPar = 0;
      int sumaImpar = 0;
      Scanner teclado= new Scanner(System.in);
      numero=teclado.nextInt();
      int[]arreglo=new int[numero];
      for(contador=0;contador<numero;contador++){
          System.out.println("ingrese un numero");
          System.out.println("arreglo["+contador+"]");
          arreglo[contador]=teclado.nextInt();
        }    
          for(contador=0;contador<arreglo.length;contador++){
              if(contador % 2 == 0){
                  sumaPar+=arreglo[contador];
          }else{
                if(contador%2!=0){
                    sumaImpar+=arreglo[contador];
                }
            }
        }
          System.out.println("la suma de los pares es: "+sumaPar);
          System.out.println("la suma de los impares es: "+sumaImpar);
    }
}
