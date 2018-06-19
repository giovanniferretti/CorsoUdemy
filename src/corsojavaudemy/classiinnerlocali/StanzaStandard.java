/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.classiinnerlocali;

/**
 *
 * @author giovanni
 */
public class StanzaStandard {

    private double mq;
    private String accessori;

    public StanzaStandard(double mq, String accessori) {
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
