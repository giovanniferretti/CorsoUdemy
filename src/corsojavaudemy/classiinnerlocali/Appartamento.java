/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.classiinnerlocali;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanni
 */
public class Appartamento {

    private int piano;

    private List<StanzaStandard> stanzeSt;
    private List<StanzaInner> stanzeIn;

    public void aggiungiStanza(double mq, String accessori) {
        class CalcoloPerimetro {

            public double calcola(double lato1, double lato2) {
                return lato1 + lato2;
            }
        }

        CalcoloPerimetro cp = new CalcoloPerimetro();
        cp.calcola(3, 6);

        getStanzeIn().add(new StanzaInner(mq, accessori));
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public List<StanzaStandard> getStanzeSt() {
        if (stanzeSt == null) {
            stanzeSt = new ArrayList<StanzaStandard>();
        }

        return stanzeSt;
    }

    public void setStanzeSt(List<StanzaStandard> stanzeSt) {
        this.stanzeSt = stanzeSt;
    }

    public List<StanzaInner> getStanzeIn() {
        if (stanzeIn == null) {
            stanzeIn = new ArrayList<StanzaInner>();
        }
        return stanzeIn;
    }

    public void setStanzeIn(List<StanzaInner> stanzeIn) {
        this.stanzeIn = stanzeIn;
    }

    class StanzaInner {

        private double mq;
        private String accessori;

        public StanzaInner(double mq, String accessori) {
            this.mq = mq;
            this.accessori = accessori;
        }

        public double getMq() {
            return mq;
        }

        public void setMq(double mq) {
            this.mq = mq;
        }

        public String getAccessori() {
            return accessori;
        }

        public void setAccessori(String accessori) {
            this.accessori = accessori;
        }

    }
}
