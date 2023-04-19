package Atv01;

public class Atv01 {
    public static void main(String[] args) {
        
        //declaração de variaveis
        int v1 = 12, v2 = 23, v3 = -23, soma;
        float v4 = 85.8f;

        //conversão das variaveis para float
        int numeroInteiro = Float.valueOf(v4).intValue();
        int numeroInteiro2 = Float.valueOf(v3).intValue();

        //soma dos argumentos
        soma = v1 + v2 + numeroInteiro + numeroInteiro2;
        
        
        //exibição dos resultados
        System.out.print("A soma dos argumentos é: " + soma);
    }
}