/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.thread;

/**
 *
 * @author giovanni
 */
public class EsempioThread extends Thread {

    @Override
    public void run() {
//        System.out.println("Questo è un thread" + getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " " + i);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }

}
