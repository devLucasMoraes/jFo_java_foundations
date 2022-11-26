package com.oracle.myacademy.jFoS04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor converter = new Conversor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em celsius: ");
        double pontoDeChegada = converter.fahrenheitParaCelsius(sc.nextDouble());
        System.out.println("O valor em fahrenheit é: " + pontoDeChegada);
    }
}