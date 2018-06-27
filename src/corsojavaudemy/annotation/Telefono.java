/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.annotation;

/**
 *
 * @author giovanni
 */
public class Telefono extends Prodotto {

    @Override
    @Deprecated
    public double calcolaIva(double ivaperc) {
        return super.calcolaIva(ivaperc); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
