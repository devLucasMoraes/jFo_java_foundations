package com.oracle.myacademy.jFoS05.exercicio;

import javax.swing.*;

public class ColorRange {

    public static void main(String[] args) {
        double comprimentoOnda = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da onda"));

        if (comprimentoOnda >= 380 && comprimentoOnda < 450){
            JOptionPane.showMessageDialog(null,"Cor Violeta");
        } else if (comprimentoOnda >= 450 && comprimentoOnda < 495){
            JOptionPane.showMessageDialog(null, "Cor Azul");
        } else if (comprimentoOnda >= 495 && comprimentoOnda <570) {
            JOptionPane.showMessageDialog(null, "Cor Verde");
        } else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
            JOptionPane.showMessageDialog(null,"Cor Amarela");
        } else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
            JOptionPane.showMessageDialog(null, "Cor Laranja");
        } else if (comprimentoOnda >=620 && comprimentoOnda < 750) {
            JOptionPane.showMessageDialog(null,"Cor Vermelha");
        } else {
            JOptionPane.showMessageDialog(null,"O comprimento de onda não está dentro do espectro visível.");
        }


    }
    }
