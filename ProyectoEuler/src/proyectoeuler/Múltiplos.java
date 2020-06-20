/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoeuler;

/**
 *
 * @author HP
 */
public class Múltiplos {
    
    public static void main(String[] agrs){
    int prevFirst=0;
    int prevSecond=1;
    int bound=4_000_000;
    int evenSum=0;

    boolean exceed=false; //when fib numbers > bound
    while(!exceed){
        int newFib=prevFirst + prevSecond;
        prevFirst = prevSecond;
        prevSecond = newFib;

        if(newFib > bound){
            exceed=true;
            break;
        }

        if(newFib % 2 == 0){
            evenSum += newFib;
        }
    }

    System.out.println(evenSum);

}
    
    
}
