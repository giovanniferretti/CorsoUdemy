/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author giovanni
 */
public class Scrittura {
    public static void main(String[] args) {
        String dirPath = "/Users/giovanni/NetBeansProjects/CorsoUdemy/CorsoUdemy/test-dir/";
        
        Scrittura s1 = new Scrittura();
        try {
            s1.esempioFileWriter(dirPath + "test-file.txt", "Testo di prova");
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    
    
    
    public void esempioFileWriter(String filePath, String testo) throws IOException {
        File f = new File(filePath);
        
        if (!(f.exists())) {
            f.createNewFile();
        }
        
        FileWriter fw = new FileWriter(f);
        fw.write(testo);
        fw.close();
    }
}
