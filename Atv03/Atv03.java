package Atv03;

import javax.swing.JOptionPane;


public class Atv03 {
    public static void main(String[] args) {
        
        //declaração de variaveis
        String nota1, nota2, notaTrabalho;
        double media;

        // solicita as notas das duas provas e do trabalho
        nota1 = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        nota2 = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        notaTrabalho = JOptionPane.showInputDialog("Digite a nota do trabalho:");

        // converte as notas de string para double
        double nota1Double = Double.parseDouble(nota1);
        double nota2Double = Double.parseDouble(nota2);
        double notaTrabalhoDouble = Double.parseDouble(notaTrabalho);

        // calcula a média
        media = (nota1Double + nota2Double + notaTrabalhoDouble) / 3;

        // exibe a média na tela
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}