package Atv05;

public class Atv05 {

    public static void main(String[] args) {

        
        // declaração e inicialização da variável gastosJaneiro
        double gastosJaneiro = 30000;

        // declaração e inicialização das variáveis gastosFevereiro e gastosMarco
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;

        // declaração e inicialização da variável gastosTrimestre
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        //exibição do valor da variável gastosTrimestre
        System.out.println("O gasto total no trimestre foi: R$ " + gastosTrimestre);

        double mediaMensal = gastosTrimestre / 3;

        System.out.println("Valor da média mensal é %.2fm: " + mediaMensal);

        
    }

        
}
