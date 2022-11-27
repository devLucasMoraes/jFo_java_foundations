package com.oracle.myacademy.jFoS08;
import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double[] teste = new double[5];
        double media;
        double soma = 0.0;

        for (int i = 0; i < teste.length; i++) {
            System.out.println("Informe a pontuacao de teste " + (i + 1));
            teste[i] = teclado.nextDouble();
        }

        for (int i = 0; i < teste.length; i++) {
            soma = soma + teste[i];
        }

        media = soma / teste.length;

        System.out.println("Sua media é de: " + media);
        
    }

}
