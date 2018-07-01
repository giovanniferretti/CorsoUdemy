/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corsojavaudemy.concorrenza;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 *
 * @author giovanni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        try {
//            esempioGetSitePage();
//        } catch (InterruptedException ex) {
//            ex.getMessage();
//        }

//        try {
//            esempioExecutorFramework();
//        } catch (InterruptedException ex) {
//            ex.getMessage();
//        } catch (ExecutionException ex) {
//            ex.getMessage();
//        }

        esempioForkJoinFramework();
    }

    private static void esempioGetSitePage() throws InterruptedException {
        GetSitePage g1 = new GetSitePage("https://www.google.it");
        GetSitePage g2 = new GetSitePage("http://commons.apache.org");

        g1.start();
        g2.start();

        g1.join();
        g2.join();

        System.out.println("Sito 1");
        System.out.println(g1.getContent());

        System.out.println("Sito 2");
        System.out.println(g2.getContent());

    }

    private static void esempioExecutorFramework() throws InterruptedException, ExecutionException {
        List<Callable<String>> siti = new ArrayList<>();
        siti.add(new GetSitePageExecutor("https://www.google.it"));
        siti.add(new GetSitePageExecutor("http://commons.apache.org"));

        ExecutorService es1 = Executors.newSingleThreadExecutor();
        List<Future<String>> out = es1.invokeAll(siti);

        for (Future<String> future : out) {
            System.out.println(future.get());
        }

        es1.shutdown();

    }

    private static void esempioForkJoinFramework() {
        ForkJoinPool fj1 = new ForkJoinPool();

        System.out.println(fj1.invoke(new GetSitePageForkJoin("https://www.google.it")));
        System.out.println(fj1.invoke(new GetSitePageForkJoin("http://commons.apache.org")));

        fj1.shutdown();

    }
}
