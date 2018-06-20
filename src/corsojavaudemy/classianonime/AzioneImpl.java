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
public class AzioneImpl implements Azione {

    @Override
    public void eseguiAzione() {
        System.out.println("Sono dentro alla classe che implementa l'interfaccia");
    }
    
}
