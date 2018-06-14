/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u357400
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        File f = new File("test.txt");
//        
//        f.exists();
//        
//        try {
//            FileReader fr = new FileReader(f);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

        Main m = new Main();
//        m.stampaTesto(null);
        m.stampaTesto("Testo di prova");

        try {
            m.stampaTesto1(null);
        } catch (CorsoJavaException e) {
            System.out.println(e.getMessage());
        }
    }

    private void stampaTesto(String testo) {

        String tmp = testo.concat("...");

        System.out.println(tmp);

    }

    private void stampaTesto1(String testo) throws CorsoJavaException {
        if (testo == null) {
            throw new CorsoJavaException();
        }
        stampaTesto(testo);

    }

}
