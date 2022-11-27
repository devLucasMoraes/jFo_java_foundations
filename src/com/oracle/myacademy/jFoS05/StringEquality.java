package com.oracle.myacademy.jFoS05;

import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if(name.equals("Moe")){
            System.out.println("Voce e o rei do rock'roll");
        }else {
            System.out.println(name);
        }

    }
}

