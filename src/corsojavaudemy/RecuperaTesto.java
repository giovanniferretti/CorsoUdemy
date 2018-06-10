/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy;

/**
 *
 * @author giova
 */
public class RecuperaTesto {
    int switchSelector = 0;
    public String ritornaTesto() {
        switch (switchSelector) {
            case 1:
                return "Testo 1";
            case 2:
                return "Testo 2";
            default:
                return "Nessun testo è stato selezionato";
        }
    }
}