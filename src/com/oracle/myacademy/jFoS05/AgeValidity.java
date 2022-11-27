package com.oracle.myacademy.jFoS05;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int age = in.nextInt();
        boolean drivingUnderAge = false;
        if(age <= 18){
            drivingUnderAge = true;
        }
        System.out.println("DrivingUnderAge: " + drivingUnderAge);
       
    }
}
