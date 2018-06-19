/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.interfacce;

/**
 *
 * @author giovanni
 */
public class Prodotto implements GeneraDati {

    private String id;
    private String nomeProdotto;
    private double peso;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String generaXLM() {
        String XMLString = 
                "<id>"+this.getId()+"</id>" +
                "<nome>"+this.getNomeProdotto()+"</nome>" +
                "<peso>"+this.getPeso()+"</peso>";
        
        return XMLString;
    }

}
