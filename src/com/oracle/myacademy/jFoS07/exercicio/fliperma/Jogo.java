package com.oracle.myacademy.jFoS07.exercicio.fliperma;

import java.util.Random;

public class Jogo {
    private int creditosNecessarios;
    //private int monitorLCD;
    //private int leitorDeCartao;


    public int getCreditosNecessarios() {
        return creditosNecessarios;
    }

    public void setCreditosNecessarios(int creditosNecessarios) {
        this.creditosNecessarios = creditosNecessarios;
    }

    public void inserirCartaoParaJogar(Cartao card) {
        int saldoDoCartao = card.getSaldoAtual();
        if (creditosNecessarios > saldoDoCartao) {
            System.out.println("Creditos insuficientes para jogar este jogo");
        } else {
            Random rndNumber = new Random();
            int tickets = rndNumber.nextInt(6) + 1;
            int ticketsDoCartao = card.getSaldoTickets();
            card.setSaldoAtual(saldoDoCartao - creditosNecessarios);
            card.setSaldoTickets(ticketsDoCartao + tickets);
            System.out.format("ID do cartao: %d \nSaldo atual de creditos: %d \nSaldo atual de tickets: %d\n", card.getId(), card.getSaldoAtual(), card.getSaldoTickets() );
        }
    }

}
