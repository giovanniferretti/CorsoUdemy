/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

        try {
            s1.esempioBufferedFileWriter(dirPath + "test-file.txt", "Prima linea", "Seconda linea");
        } catch (IOException ex) {
            ex.getMessage();
        }
        
        try {
            s1.esempioPrintWriter(dirPath + "test-file.txt", "Prima linea", "Seconda linea");
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public void esempioFileWriter(String filePath, String testo) throws IOException {

        FileWriter fw = new FileWriter(getFile(filePath));
        fw.write(testo);
        fw.close();
    }

    public void esempioBufferedFileWriter(String filePath, String... testo) throws IOException {

        BufferedWriter bw = null;
        bw = new BufferedWriter(new FileWriter(getFile(filePath)));

        for (String string : testo) {
            bw.write(string);
            bw.newLine();
        }

        bw.close();
    }

    public void esempioPrintWriter(String filePath, String... testo) throws IOException {
        PrintWriter pw = null;
        
        
        pw = new PrintWriter(getFile(filePath));
        
        for (String string : testo) {
            pw.write(string);
            pw.println();
        }
        
        
        pw.close();
    }

    private File getFile(String filePath) throws IOException {
        File f = new File(filePath);

        if (!(f.exists())) {
            f.createNewFile();
        }

        return f;
    }
}
