/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *
 * @author Iman H
 */
public class ThreadExample {
    
    public static void main(String[] args) {
        Even even = new Even();
        ThreadOne first = new ThreadOne(even);
        ThreadOne second = new ThreadOne(even);
        first.start();
        second.start();
        
    }
    //next metoden bliver øget +1 tre gange før variablen returneres. Begge Threads 
    //prøver at arbejde med det samme object og det kalder vi race condition, når 2 tråde prøver
    // at arbejde med det samme object, vi bruger Syncronized metoden, så kun en tråd af gangen får adgang
    //så ved at syncronosere, så er objektet ikke i aktiv brug, mens den tilgås en tråd af gangen. 
    // det er et meget almindeligt problem, når man arbejde med tråde, at 2 tråde prøver tilgå den samme object på samme tid.
}
