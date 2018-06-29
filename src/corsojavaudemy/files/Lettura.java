/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author giovanni
 */
public class Lettura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dirPath = "/Users/giovanni/NetBeansProjects/CorsoUdemy/CorsoUdemy/test-dir/";
        
        Lettura l = new Lettura();
        l.esempioFileReader(dirPath + "test-file.txt");
    }

    public void esempioFileReader(String filePath) {
        File f = new File(filePath);
        FileReader fr = null;
        char[] testo = new char[1024];

        if (f.exists()) {
            try {
                fr = new FileReader(f);
                int size = fr.read(testo);
                
                for (int i = 0; i<size; i++) {
                    System.out.print(testo[i]);
                }
                
            } catch (FileNotFoundException ex) {
                ex.getMessage();
            } catch (IOException ex) {
                ex.getMessage();
            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    ex.getMessage();
                }
            }

        }
    }
    
    public void esempioBufferedReader(String filePath) {
        File f = new File(filePath);
        BufferedReader fr = null;
        char[] testo = new char[1024];

        if (f.exists()) {
            try {
                fr = new BufferedReader(new FileReader(f));
                int size = fr.read(testo);
                
                for (int i = 0; i<size; i++) {
                    System.out.print(testo[i]);
                }
                
            } catch (FileNotFoundException ex) {
                ex.getMessage();
            } catch (IOException ex) {
                ex.getMessage();
            } finally {
                try {
                    fr.close();
                } catch (IOException ex) {
                    ex.getMessage();
                }
            }

        }
    }

}
