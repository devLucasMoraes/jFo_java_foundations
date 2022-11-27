package com.oracle.myacademy.jFoS08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Double> numeros = new ArrayList<Double>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);
        Iterator<Double> interator = numeros.iterator();
        //while (interator.hasNext()) {
        //    System.out.println(interator.next());
        //}
        while (interator.hasNext()){
            double next = interator.next();
            if((next % 2) == 0 ){
                numeros.remove(numeros.indexOf(next));
            }
        }
        System.out.println(numeros.toString());


        
        
        
        
         
    }
}
