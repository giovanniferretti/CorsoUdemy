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
public class Smartphone {

    private String serialNumber;
    private String imei;
    private String produttore;
    private String modello;
    private Display schermo; 

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Display getSchermo() {
        return schermo;
    }

    public void setSchermo(Display schermo) {
        this.schermo = schermo;
    }

    

}
