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
public class Polimorfirmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado y = new Empleado("Rafa");
        Operario m = new Operario ("Alfonso");
        Directivo a = new Directivo("Mario");
        Oficial q = new Oficial("Luis");
        Tecnico s = new Tecnico("Pablo");
        
        
        System.out.println(y.toString());
        System.out.println(m.toString());
        System.out.println(a.toString());
        System.out.println(q.toString());
        System.out.println(s.toString());
        
    }
    
}
