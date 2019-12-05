package com.javarush.task.task15.task1522;

import com.sun.corba.se.impl.util.SUNVMCID;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();

        if ( str.equals("sun") ){
            thePlanet = Sun.getInstance();
        }else if ( str.equals("earth") ){
            thePlanet = Earth.getInstance();
        }else if (str.equals("moon")){
            thePlanet = Moon.getInstance();
        }else{
            thePlanet = null;
        }
        //System.out.println( thePlanet );
    }
}
