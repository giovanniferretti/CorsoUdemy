/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.ciclo;

/**
 *
 * @author giova
 */
public class ForWhileDoWhile {
    public void itera(int contatore, int estremo) {
        while(contatore < estremo) {
            System.out.println("contatore: " + contatore);
            contatore++;
        }
    }
    
    public void iteraDoWhile(int contatore, int estremo) {
        do{
            System.out.println("contatore: " + contatore);
            contatore++;
        } while (contatore < estremo);   
    }
        
    public void iteraFor(int contatore, int estremo) {
        for(int i = contatore; contatore < estremo; contatore++) {
            System.out.println("contatore: " + contatore);
        }
    }
    
    /* Esempio di for-each
        Esempio di for-each
    */
    
    public void iteraForEach(String[] stringArray) {
        for(String myElement:stringArray) {
            System.out.println(myElement);
        }
    }
    
    public void esempioBreak(int interruttore, int estremo) {
        for(int i = 0; i < estremo; i++) {
            if(i == interruttore) {
                System.out.println("i == interruttore");
                break;
            }
        }
    }
}
