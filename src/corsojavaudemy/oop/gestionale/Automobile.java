/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.oop.gestionale;

/**
 *
 * @author giovanni
 */
public class Automobile extends Prodotto {

    private String classe;
    private String verniciatura;
    private String motore;
    private String alimentazione;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getVerniciatura() {
        return verniciatura;
    }

    public void setVerniciatura(String verniciatura) {
        this.verniciatura = verniciatura;
    }

    public String getMotore() {
        return motore;
    }

    public void setMotore(String motore) {
        this.motore = motore;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    @Override
    public String getNome() {
        return super.getNome() + " " + this.getVerniciatura();
    }

}
