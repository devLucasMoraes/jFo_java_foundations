package com.oracle.myacademy.jFoS06.exercicio;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int pin = 1234;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero PIN: ");
        int pinDigitado = in.nextInt();
        while (pinDigitado != pin) {
            System.out.println("PIN invalido, digite novamente: ");
            pinDigitado = in.nextInt();
        }
        System.out.println("PIN correto...");
        System.out.println("Acessando sua conta...");
    }
}
