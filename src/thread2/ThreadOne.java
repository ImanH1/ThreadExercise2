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
public class ThreadOne extends Thread {
    Even even = new Even();
    int h;
    
    public ThreadOne(Even even){
        this.even = even;
    }
    public void run(){
        synchronized (even){
            for(int i = 0; i< 10000; i++){
                h = even.next();
                
                if ((h % 2) !=0){
                    System.out.println(h);
                }
            }
        }
    }
}
