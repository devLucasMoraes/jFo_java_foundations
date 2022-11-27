package com.oracle.myacademy.jFoS05;

import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numeroDoMes = in.nextInt();
        switch (numeroDoMes){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("fev");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("abr");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("ago");
                break;
            case 9:
                System.out.println("set");
                break;
            case 10:
                System.out.println("out");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dez");
                break;
            default:
                System.out.println("Numero do mes invalido");
        }
    }
}
