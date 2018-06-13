/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.oop.gestionale;

/**
 *
 * @author u357400
 */
public class RigaOrdine {

    private long id;
    private Prodotto prodotto;
    private int quantita;
    private double prezzoUnitario;
    private OrdineDiVendita odv;

    public RigaOrdine(long id, Prodotto prodotto, int quantita, double prezzoUnitario) {
        this.id = id;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(double prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public OrdineDiVendita getOdv() {
        return odv;
    }

    public void setOdv(OrdineDiVendita odv) {
        this.odv = odv;
    }

}
