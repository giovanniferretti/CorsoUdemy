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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        EsempioThread et1 = new EsempioThread();
//        
//        et1.start();
//        
//        EsempioRunnable er1 = new EsempioRunnable();
//        er1.run();
//        
//        Thread t1 = new Thread(new EsempioRunnable());
//        t1.start();

        EsempioThread et1 = new EsempioThread();
        et1.setName("Thread 1");
        EsempioThread et2 = new EsempioThread();
        et2.setName("Thread 2");
        EsempioThread et3 = new EsempioThread();
        et3.setName("Thread 3");
        EsempioThread et4 = new EsempioThread();
        et4.setName("Thread 4");
        EsempioThread et5 = new EsempioThread();
        et5.setName("Thread 5");
        
        et1.start();
        et2.start();
        et3.start();
        et4.start();
        et5.start();
        
    }
    
}
