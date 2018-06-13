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
public class Smartphone extends ProdottoElettronico {

    private String display;
    private String cpu;
    private String ram;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void stampaProdotto() {
        System.out.println(getId() + " " + getModello() + " " + getMarca() + " " + getCpu());
    }

}
