/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.oop.gestionale;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author u357400
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrdineDiVendita odv = new OrdineDiVendita();

        odv.setCliente(new Cliente());
        odv.setDataOrdine(new Date());
        odv.setStatoOrdine(OrdineDiVendita.STATO_SPEDITO);
        odv.setRigheOrdine(new ArrayList<>());

        odv.getCliente().setCodiceFiscale("FRRGNN89P09A944H");
        odv.getCliente().setCognome("Ferretti");
        odv.getCliente().setNome("Giovanni");

        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Apple");
        sm1.setModello("iPhone");
        sm1.setPrezzo(800);

        Televisore tv1 = new Televisore();
        tv1.setMarca("Samsung");
        tv1.setModello("Smart TV");
        tv1.setPrezzo(1000);

        Televisore tv2 = new Televisore();
        tv2.setMarca("Sony");
        tv2.setModello("Bravia");
        tv2.setPrezzo(1050);

        RigaOrdine riga1 = new RigaOrdine(1, sm1, 1, sm1.getPrezzo());
        RigaOrdine riga2 = new RigaOrdine(1, tv1, 1, tv1.getPrezzo());
        RigaOrdine riga3 = new RigaOrdine(2, tv2, 1, tv2.getPrezzo());

        odv.getRigheOrdine().add(riga1);
        odv.getRigheOrdine().add(riga2);
        odv.getRigheOrdine().add(riga3);

        odv.stampaOrdine();

    }

}
