/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.classianonime;

/**
 *
 * @author giovanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.eseguiAzione().eseguiAzione();
        m1.eseguiAzione2().eseguiAzione();
    }
    
    /* In questo caso creo una classe (AzioneImpl) che ha il solo scopo di
       implementare l'interfaccia Azione ed invoco poi un'istanza di questa
       classe
    */
    public Azione eseguiAzione() {
        return new AzioneImpl();
    }
    
    /* In questo caso creo una classe anonima per risolvere lo stesso problema,
       cioè implementare l'interfaccia Azione
    */
    
    public Azione eseguiAzione2() {
        return new Azione() {
            @Override
            public void eseguiAzione() {
                System.out.println("Sono dentro alla classe anonima");
            }
            
        };
    }
    
}
