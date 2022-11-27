package com.oracle.myacademy.jFoS03.exercicio;

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter your name");
        String sexo = JOptionPane.showInputDialog("Insira seu sexo (M para masculino ou F para feminino)");
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento"));
        int mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o mes de nascimento"));
        int diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de nascimento"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso"));

        double imc = peso / Math.pow(altura,2);
        String idade = calculaIdade(diaNascimento,mesNascimento,anoNascimento);

        JOptionPane.showMessageDialog(null,"Olá " + name + " seu IMC é de: " + Math.round(imc) + ", sua idade é de: " + idade + " anos");

    }
    public static String calculaIdade(int Dia, int Mes, int Ano){
        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int Idade = anoAtual - Ano;//Calcula a idade apenas com os anos
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        int mesAtual = cal.get(Calendar.MONTH);
        if(Dia >= diaAtual && Mes >= mesAtual){
            Idade--;
        }
        return String.valueOf(Idade);
    }
}