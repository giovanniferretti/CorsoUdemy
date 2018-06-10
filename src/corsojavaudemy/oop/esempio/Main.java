/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.oop.esempio;

/**
 *
 * @author giova
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Smartphone sm1 = new Smartphone();
        sm1.setImei("aaa");
        sm1.setProduttore("Samsung");
        
        NuovoSmartphone nsm1 = new NuovoSmartphone();
        nsm1.getDescrizione();
        
        Utente u1 = new Utente();
        
    }
    
}
