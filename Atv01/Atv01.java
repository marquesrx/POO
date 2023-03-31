package Atv01;

public class Atv01 {
    public static void main(String[] args) {
        double soma = 0.0;
        
        for (String arg : args) {
            try {
                double valor = Double.parseDouble(arg);
                soma += valor;
            } catch (NumberFormatException e) {
                // Argumento inválido, ignorar
            }
        }
        
        System.out.println("A soma dos argumentos é: " + soma);
    }
}