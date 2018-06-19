/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.classiinnerlocali;

import corsojavaudemy.classiinnerlocali.Appartamento.StanzaInner;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author giovanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Appartamento a = new Appartamento();
        a.setPiano(0);
        a.getStanzeSt().add(new StanzaStandard(16, "angolo cottura"));
        
        /* Provare a chiamare una classe inner da un contesto esterno alla enclosing
        class in scrittura non è ammesso; si deve invece ricorrere ad un metodo 
        definitio nella enclosing class che faccia da "costruttore" 
        all'inner class
        
        a.getStanzeIn().add(new StanzaInner(16, "angolo cottua"));
        */
        
        a.aggiungiStanza(16, "angolo cottura");
        
        List<StanzaStandard> list1 = a.getStanzeSt();
        
        for (StanzaStandard st1 : list1) {
            System.out.println(st1.getMq());
        }
        
        /* Versione con iterator */
        Iterator<StanzaStandard> myIt1 = list1.iterator();
        while (myIt1.hasNext()) {
            System.out.println(myIt1.next().getMq());
        }
        
        /* In lettura invece posso utilizzare le classi inner */
        List<StanzaInner> list2 = a.getStanzeIn();
        
        for (StanzaInner stanzaInner : list2) {
            System.out.println(stanzaInner.getMq());
        }
    }
    
}
