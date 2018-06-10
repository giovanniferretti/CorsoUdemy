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
public class Prodotto {

    private int id;
    private String nome;
    private String descrizione;
    private String prezzo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public List<String> getStores() {
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Negozio 1");
        tmp.add("Negozio 2");
        tmp.add("Negozio 3");
        tmp.add("Negozio 4");

        return tmp;
    }
}
