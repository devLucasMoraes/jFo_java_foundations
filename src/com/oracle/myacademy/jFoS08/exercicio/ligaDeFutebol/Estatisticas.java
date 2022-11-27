package com.oracle.myacademy.jFoS08.exercicio.ligaDeFutebol;

import java.util.ArrayList;

public class Estatisticas {
    private int[][] tabelaClassificacao;

    public ArrayList<Jogo> tabelaJogos;

    public Estatisticas() {
        tabelaClassificacao = new int[4][6];
        tabelaJogos = new ArrayList<Jogo>();
    }

    public int[][] getTabelaClassificacao() {
        return tabelaClassificacao;
    }

    public void setTabelaClassificacao(int[][] tabelaClassificacao) {
        this.tabelaClassificacao = tabelaClassificacao;
    }
}
