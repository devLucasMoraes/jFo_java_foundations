package com.oracle.myacademy.jFoS07.exercicio.fliperma;

public class Main {
    public static void main(String[] args) {
    Cartao card1 = new Cartao();
    Cartao card2 = new Cartao();

    card1.setId(1);
    card1.setSaldoAtual(300);
    card1.setSaldoTickets(0);

    card2.setId(2);
    card2.setSaldoAtual(40);
    card2.setSaldoTickets(10);

    Jogo mario = new Jogo();
    mario.setCreditosNecessarios(50);

    mario.inserirCartaoParaJogar(card2);


    Terminal tm = new Terminal();

    tm.trocarDinheroPorCreditos(card1,50);
    tm.transferirCreditos(card1, card2, 400);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);
    mario.inserirCartaoParaJogar(card2);


    CategoriaDePremios bichosDePelucia = new CategoriaDePremios();
    bichosDePelucia.setName("coelho");
    bichosDePelucia.setQuantidadeDeItens(1);
    bichosDePelucia.setTicketNecessarios(37);

    tm.trocarTicketsPorPremios(card2,bichosDePelucia);
    tm.trocarTicketsPorPremios(card2,bichosDePelucia);



    }
}
