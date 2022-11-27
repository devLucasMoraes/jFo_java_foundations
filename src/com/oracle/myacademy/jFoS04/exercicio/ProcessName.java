package com.oracle.myacademy.jFoS04.exercicio;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        int indexSpace = name.indexOf(" ");
        String sobrenome = name.substring(indexSpace + 1);
        System.out.println(sobrenome);
        System.out.println("Seu nome é: " + sobrenome + "," + " " + name.substring(0,1) + ".");

    }


}
