/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.liste;

import corsojavaudemy.oop.gestionale.Smartphone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author giovanni
 */
public class Main {

    public void esempioIterazione() {
        List<String> lista = new ArrayList<>();

        lista.add("Elena");
        lista.add("Mentore");
        lista.add("Giulia");
        lista.add("Giovanni");

        /*for*/
        for (int i = 0; i < lista.size(); i++) {
            String temp = lista.get(i);
            System.out.println(temp);
        }

        System.out.println("----------");
        /*for each*/
        for (String temp : lista) {
            System.out.println(temp);
        }

        System.out.println("----------");
        /*Iterator*/
        Iterator<String> it1 = lista.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }

    public void getConfig() {
        Properties p = new Properties();
        try {
            InputStream is = new FileInputStream(new File("/Users/giovanni/NetBeansProjects/CorsoUdemy/CorsoUdemy/config.properties"));
            p.load(is);

            System.out.println(p.getProperty("db-name"));
            System.out.println(p.getProperty("db-address"));
        } catch (FileNotFoundException ex) {
            System.out.println("File non trovato");
        } catch (IOException ex) {
            System.out.println("Errore di conversione alla classe Property");
        }

    }

    public void esempioHashMap() {
        Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();

        Smartphone sm = new Smartphone();
        sm.setMarca("Apple");
        sm.setModello("iPhone");
        mappa.put("sm1", sm);

        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Samsung");
        sm1.setModello("Galaxy");
        mappa.put("sm2", sm1);

        Set<String> chiavi = mappa.keySet();
        for (String string : chiavi) {
            System.out.println(string);
        }

        Smartphone sm3 = mappa.get("sm1");
        System.out.println(sm3.getMarca());
        System.out.println(sm3.getModello());

    }

    public void esempioArrayList() {
        List<String> lista = new ArrayList<>();

        lista.add("Elena");
        lista.add("Mentore");
        lista.add("Giulia");
        lista.add("Giovanni");

//        for (String string : lista) {
//            System.out.println(string);
//        }
        String[] listArray = lista.toArray(new String[lista.size()]);

        for (String string : listArray) {
            System.out.println(string);
        }

        List<Smartphone> lista2 = new ArrayList<>();

        Smartphone sm = new Smartphone();
        sm.setMarca("Apple");
        sm.setModello("iPhone");
        lista2.add(sm);

        Smartphone sm1 = new Smartphone();
        sm1.setMarca("Samsung");
        sm1.setModello("Galaxy");
        lista2.add(sm1);

    }

    public static void main(String[] args) {
        Main myMain = new Main();
//        myMain.arrayMultidimensionale();

//        myMain.esempioArrayList();
//        myMain.esempioHashMap();
//        myMain.getConfig();
        myMain.esempioIterazione();
    }

    public void creaArray() {
        int[] numeri = new int[10];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = 10 + i;
        }

        for (int i : numeri) {
            numeri[i] = 10 + i;
        }

        Smartphone[] prodotti = new Smartphone[10];

    }

    public void arrayMultidimensionale() {
        int[][] matrice = new int[10][10];

        for (int[] i : matrice) {
            for (int j : i) {
                i[j] = j;
            }
        }
    }
}
