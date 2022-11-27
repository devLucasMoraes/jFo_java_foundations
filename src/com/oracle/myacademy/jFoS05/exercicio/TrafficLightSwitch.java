package com.oracle.myacademy.jFoS05.exercicio;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentColor = in.nextInt();

        switch (currentColor) {
            case 1 -> System.out.println("Next Traffic Light is green");
            case 2 -> System.out.println("Next Traffic Light is yellow");
            case 3 -> System.out.println("Next Traffic Light is red");
            default -> System.out.println("Invalid color");
        }

    }

}
