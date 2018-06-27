/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.generics;

import corsojavaudemy.classiinnerlocali.Appartamento;
import java.util.ArrayList;
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
        /* senza generics */
        List lista1 = new ArrayList();
        lista1.add("Esempio 1");
        lista1.add("Esempio 2");
        lista1.add(new Appartamento());
        String test1 = (String) lista1.get(0);
        
        /* con l'uso di generics */
        List<String> lista2 = new ArrayList<String>();
        lista2.add("Esempio 3");
        lista2.add("Esempio 4");
        String test2 = lista2.get(0);
    }
    
}
