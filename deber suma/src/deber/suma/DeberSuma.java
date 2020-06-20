/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.suma;

/**
 *
 * @author HP
 */
public class DeberSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] voki={3,7,12,22,9,25,18,31,21,14,45,2};
        int total=0;
        int sumapar=0;
        int sumaimpar=0;
        int conteopar=0;
        int mayor,menor;
        int n1=1,n2=10;
        int suma=0;
        for(int contador=0; contador<voki.length;contador++){
            total+=voki[contador];
            if(contador%2==0){
                sumapar+=voki[contador];
            }else{
                if(contador%2!=0){
                    sumaimpar+=voki[contador];
                }
            }
        }
        
        System.out.println("minimo es igual a:"+minimoRec(voki,0,voki[0]));
        System.out.println("maximo es igual a:"+maximoRec(voki,0,voki[0]));
        System.out.println("la suma de los pares es:"+sumapar);
        System.out.println("la suma de los impares es:"+sumaimpar);
        System.out.println("tu suma es igual a : "+total);
        
        if(n1>n2){
            mayor=n1;
            menor=n2;
        }
        else{
            mayor=n2;
            menor=n1;
        }
        for(int i = menor; i<=mayor; i++){
            if(i%2==0){
                suma +=i;
            }
        }
        System.out.println("valor maximo par "+suma);
    } 
    
    public static int maximoRec(int[] voki,int indice, int max){
        if(indice != voki.length){
            if(voki[indice]>max){
                max=maximoRec(voki,indice +1,voki[indice]);
            }else{ 
                max=maximoRec(voki,indice+1,max);
            }
        }
        return max;
    }
    public static int minimoRec(int[] voki,int indice, int minimo){
        if(indice != voki.length){
            if(voki[indice]>minimo){
                minimo=minimoRec(voki,indice+1,minimo);
                
            }else{ 
               minimo=minimoRec(voki,indice +1,voki[indice]); 
            }
        }
        return minimo;
    }  
}
