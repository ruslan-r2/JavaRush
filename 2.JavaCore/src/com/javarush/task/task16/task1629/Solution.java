package com.javarush.task.task16.task1629;

import javax.management.monitor.StringMonitor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        private List<String> result = new ArrayList<String>();
        int count = 0;

        public void run(){
            while ( !isInterrupted() ){
                try {
                    synchronized (reader){
                        if ( reader.ready() ){
                            while ( count < 3 ) {
                                result.add(reader.readLine());
                                //System.out.println(count);
                                count++;
                            }
                            //interrupt();
                            return;
                        }
                    }

                }catch (IOException e){
                    //System.out.println("Ошибка!");
                    //e.printStackTrace();
                }
            }
        }

        public void printResult(){
            String str = "";
            for (String elem: result) {
                str += elem + " ";
            }
            System.out.println( str.trim() );
        }
    }
}
