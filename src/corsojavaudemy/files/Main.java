/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author giovanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        
        String dirPath = "/Users/giovanni/NetBeansProjects/CorsoUdemy/CorsoUdemy/test-dir";
        String filePath = dirPath + "/test-file.txt";
        
        m.creaDir(dirPath);
        m.creaFile(filePath);
        
        File d = new File(dirPath);
        System.out.println(d.isDirectory());
        
        File[] fileList = d.listFiles();
        
        /* Using for-each */
        for (File file : fileList) {
            System.out.println(file.getName());
        }
        
        /* Using List<File> and Iterator<File> */
        List<File> myList = Arrays.asList(fileList);
        Iterator<File> myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next().getName());
        }
        
        
        File f = new File(filePath);
        System.out.println(f.isFile());
        
    }

    public void creaFile(String path) {
        File f = new File(path);

        if (!(f.exists()))  {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }

    public void creaDir(String path) {
        File d = new File(path);
        
        if (!(d.exists())) {
            d.mkdir();
        }
    }
}
