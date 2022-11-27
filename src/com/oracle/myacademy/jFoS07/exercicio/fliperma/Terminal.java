package com.oracle.myacademy.jFoS07.exercicio.fliperma;

public class Terminal {
    //private int leitorCartao;
    public void verificaSaldoCartao(Cartao card){
        System.out.format("ID do cartao: %d \nSaldo atual de creditos: %d \nSaldo atual de tickets: %d\n", card.getId(), card.getSaldoAtual(), card.getSaldoTickets());
    }
    public void trocarDinheroPorCreditos(Cartao card, int dinheiro){
        card.setSaldoAtual(card.getSaldoAtual() + (dinheiro * 2));
        verificaSaldoCartao(card);
    }
    public void transferirCreditos(Cartao card1, Cartao card2, int creditos) {
        int saldoDoCartao = card1.getSaldoAtual();
        if(saldoDoCartao >= creditos) {
            card1.setSaldoAtual(saldoDoCartao - creditos);
            card2.setSaldoAtual(card2.getSaldoAtual() + creditos);
            verificaSaldoCartao(card1);
            verificaSaldoCartao(card2);
        } else {
            System.out.println("Creditos insuficientes para realizar esta ação");
            verificaSaldoCartao(card1);
            verificaSaldoCartao(card2);
        }
    }

    public void trocarTicketsPorPremios(Cartao card, CategoriaDePremios premio){
        if(card.getSaldoTickets() < premio.getTicketNecessarios()){
            System.out.println("Quantidade de tickets insuficientes");
        } else if(premio.getQuantidadeDeItens() <= 0){
            System.out.println("Premio indisponivel no momento");
        } else {
            premio.setQuantidadeDeItens(premio.getQuantidadeDeItens() - 1);
            System.out.println("Parabens! solicite seu: " + premio.getName() + " no caixa");
        }
    }
}
