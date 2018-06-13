/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.oop.gestionale;

import java.util.Date;
import java.util.List;

/**
 *
 * @author u357400
 */
public class OrdineDiVendita {
    private long id;
    private Cliente cliente;
    private Date dataOrdine;
    private String statoOrdine;
    private List<RigaOrdine> righeOrdine;

    public static final String STATO_IN_ATTESA = "STATO IN ATTESA";
    public static final String STATO_SPEDITO = "STATO SPEDITO";
    public static final String STATO_CONSEGNATO = "STATO CONSEGNATO";
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public String getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(String statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public List<RigaOrdine> getRigheOrdine() {
        return righeOrdine;
    }

    public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
        this.righeOrdine = righeOrdine;
    }
    
}
