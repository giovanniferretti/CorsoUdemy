/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.oop.esempio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giova
 */
public class NuovoSmartphone extends Prodotto {

    private String imei;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public List<String> getStores() {
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Negozio 1");
        tmp.add("Negozio 2");

        return tmp;
    }

}
