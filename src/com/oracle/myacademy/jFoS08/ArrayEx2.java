package com.oracle.myacademy.jFoS08;

import java.util.ArrayList;

public class ArrayEx2 {
    
    public static void main(String args[]) {
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";

        ArrayList<String> estudantes = new ArrayList<>();
        estudantes.add("Amy");
        estudantes.add("Bob");
        estudantes.add("Cindy");
        estudantes.add("David");

        System.out.println(estudantes.toString());
        System.out.println(estudantes.size());

        estudantes.add(0, "Nick");
        estudantes.add(1, "Mike");
        estudantes.remove(3);
        System.out.println(estudantes.toString());
        System.out.println(estudantes.size());

        
    }
    
}
