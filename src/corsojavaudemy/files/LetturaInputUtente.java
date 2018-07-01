/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author giovanni
 */
public class LetturaInputUtente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leggiInputUtente();
        leggiInputUsandoScanner();
    }

    public static void leggiInputUtente() {
        BufferedReader br1;

        String nome = null;

        try {
            System.out.println("Inserisci il tuo nome: ");
            br1 = new BufferedReader(new InputStreamReader(System.in));
            nome = br1.readLine();
        } catch (IOException ex) {
            ex.getMessage();
        }

        try {
            System.out.println("Inserisci il tuo cognome: ");
            br1 = new BufferedReader(new InputStreamReader(System.in));
            nome += " " + br1.readLine();
        } catch (IOException ex) {
            ex.getMessage();
        }

        System.out.println("Ciao " + nome);
    }

    public static void leggiInputUsandoScanner() {
        System.out.println("Inserisci il tuo nome: ");
        Scanner scn1 = new Scanner(System.in);
        String dati = scn1.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        scn1 = new Scanner(System.in);
        dati += " " + scn1.nextLine();
        System.out.println("Buongiorno " + dati);
    }
}
